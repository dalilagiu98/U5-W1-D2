package dalilagiu9.U5W1D2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
public class Table {
    //ATTRIBUTES LIST:
    private int number;
    private int maxNumberSeats;
    private double seatCost;
    private boolean isFree;

    //METHODS:
    public void print(){
        System.out.println("Number of table: " + this.number);
        System.out.println("Number max of seats: " + this.maxNumberSeats);
        System.out.println("Busy / Free : " + this.isFree);

    }

}
