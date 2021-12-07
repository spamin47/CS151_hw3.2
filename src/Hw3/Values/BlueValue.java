package Hw3.Values;

import Hw3.Value;

public class BlueValue implements Value {
    private int value;
    public BlueValue(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
}
