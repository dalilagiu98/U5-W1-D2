package dalilagiu9.U5W1D2.entities;

import lombok.ToString;

import java.util.List;

@ToString(callSuper = true)
public class Pizza extends Item{
    //ATTRIBUTES LIST:
    private String name;
    private List<Topping> toppingList;

    //CONSTRUCTOR:
    public Pizza(String name, List<Topping> toppingList){
        super(1400, 4.20);
        this.name=name;
        this.toppingList = toppingList;
        this.calories = setCalories(toppingList);
        this.price = setPrice(toppingList);
    }

    //METHODS:
    public double setCalories(List<Topping> toppingList){
        double tot = 1400;
        if (toppingList != null){
            for(int i = 0; i < toppingList.size(); i++){
                tot += toppingList.get(i).getCalories();
            }
        }
        return tot;
    }

    public double setPrice(List<Topping> toppingList){
        double tot = 4.20;
        if(toppingList != null){
            for (int i = 0; i < toppingList.size(); i++){
                tot += toppingList.get(i).getPrice();
            }
        }
        return tot;
    }
}
