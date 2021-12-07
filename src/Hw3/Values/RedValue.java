package Hw3.Values;

import Hw3.Value;

public class RedValue implements Value {
    private int value;
    public RedValue(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
}