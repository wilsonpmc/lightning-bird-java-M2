package com.example.demo;
import com.example.demo.FruitModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class FruitController{

    private List<FruitModel> fruitList = new ArrayList<>(Arrays.asList(
            new FruitModel("1","Apple","2"),
            new FruitModel("2","Mango","3"),
            new FruitModel("3","Watermelon","4")
            ));

    @GetMapping("/fruits")
    public List<FruitModel> getAllFruits()
    {
        return fruitList;
    }

    @PostMapping("/fruits")
    public void addFruits(@RequestBody FruitModel fruit){
                    fruitList.add(fruit);
}

    @PutMapping("/fruits/{id}")
    public void updateFruits(@RequestBody FruitModel fruit, @PathVariable("id") String id)
{
        for (FruitModel fruit1 : fruitList) {
            if (fruit1.getId().equals(id)) {
                fruit1.name = fruit.name;
                fruit1.price = fruit.price;
            }
        }
    }

    @DeleteMapping("/fruits/{id}")
    public void deleteFruits(@PathVariable("id") String id)
    {
        for (FruitModel fruit1 :fruitList){
            if (fruit1.getId().equals(id)) {
                fruitList.remove(fruit1);
             }
         }
    }

}


