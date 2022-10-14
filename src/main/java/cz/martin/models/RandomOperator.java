package cz.martin.models;

import java.util.Random;

public class RandomOperator {
    public Operation getRandomOperation() {
        Random rand = new Random();
        int o = rand.nextInt(3);
        if(o == 0) return Operation.Times;
        if(o == 1 ) return Operation.Minus;
        if(o == 2 ) return Operation.Plus;
        return Operation.Divide;
    }
}
