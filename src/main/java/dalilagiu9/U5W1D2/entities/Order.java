package dalilagiu9.U5W1D2.entities;

import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@ToString
public class Order {
    private int orderNumber;
    private StateOrder stateOrder;
    private int numberSeats;
    private LocalDateTime acquisitionHour;
    private List<Item> itemList;
    private Table table;

    //CONSTRUCTOR:
    public Order(int numberSeats, Table table){
        Random random = new Random();
        this.orderNumber = random.nextInt(1,10);
        this.stateOrder = StateOrder.IN_PROGRESS;
        this.numberSeats = numberSeats;
        this.acquisitionHour = LocalDateTime.now();
        this.itemList = new ArrayList<>();
        this.table = table;
    }

    //METHODS:
    public void addItem(Item item){
        this.itemList.add(item);
    }

    public double getTotal(){
       return this.itemList.stream().mapToDouble(Item::getPrice).sum() + (this.table.getSeatCost() * this.numberSeats);
    }

}
