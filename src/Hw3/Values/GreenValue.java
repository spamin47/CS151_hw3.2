package Hw3.Values;

import Hw3.Value;

public class GreenValue implements Value {
    private int value;
    public GreenValue(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
}