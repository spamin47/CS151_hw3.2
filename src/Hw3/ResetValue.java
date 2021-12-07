package Hw3;

public class ResetValue implements Value{
    private int value;
    public ResetValue(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}
