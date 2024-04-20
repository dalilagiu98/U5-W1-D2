package dalilagiu9.U5W1D2.entities;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class Topping extends Item{
    private String name;

    //CONSTRUCTOR:

    public Topping(String name, double calories, double price){
        super(calories, price);
        this.name = name;
    }

}
