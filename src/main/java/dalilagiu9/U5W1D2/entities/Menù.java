package dalilagiu9.U5W1D2.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
public class Menù {
    //ATTRIBUTES LIST:
    private List<Pizza> pizzaList;
    private List<Drink> drinkList;

    private List<Topping> toppingList;

  //METHOD:
    public void getMenù(){
        System.out.println("-------------MENÚ-------------");
        System.out.println("----DRINKS----");
        this.drinkList.forEach(System.out::println);
        System.out.println("------------------------------");

        System.out.println("----TOPPINGS----");
        this.toppingList.forEach(System.out::println);
        System.out.println("------------------------------");

        System.out.println("----PIZZAS----");
        this.pizzaList.forEach(System.out::println);
        System.out.println("------------------------------");
    }
}
