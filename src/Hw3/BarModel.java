package Hw3;

import java.awt.*;
import java.util.HashMap;

public class BarModel {
    //store value of each bar of different colors
    private HashMap<Color,Integer> listOfBarValues = new HashMap<>();

    public BarModel(){
        //declare the value of each bar
        listOfBarValues.put(Color.red, 0);
        listOfBarValues.put(Color.green, 0);
        listOfBarValues.put(Color.red, 0);
    }

    public HashMap<Color,Integer> getBar(){
        return (HashMap<Color, Integer>) listOfBarValues.clone();
    }
    public void setValue(Color color, int i){
        listOfBarValues.put(color, i);
    }
    public int getValue(Color color){
        return listOfBarValues.get(color);
    }
}
