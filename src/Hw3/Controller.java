package Hw3;

import Hw3.Values.*;

import java.awt.*;
import java.util.concurrent.BlockingQueue;

public class Controller {
    BlockingQueue<Value> queue;
    View view;
    BarModel barModel;
    public Controller(View view, BlockingQueue<Value> queue, BarModel barModel){
        this.view = view;
        this.queue = queue;
        this.barModel = barModel;
    }

    public void mainLoop(){
        while(view.isDisplayable()){
            Value value = null;
            //take any events from queue
            try{
                value = queue.take();
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            //filter event from blocking queue
            if(value.getClass() == RedValue.class){
                System.out.println("Red Value found in queue. ");
                RedValue red = (RedValue) value;
                //update model
                barModel.setValue(Color.red,red.getValue());
                //retrieve value from model
                System.out.println("Red value: " + barModel.getValue(Color.red));
                view.updateRedBar(barModel.getValue(Color.red));
            }
            if(value.getClass() == GreenValue.class){
                System.out.println("Green Value found in queue. ");
                GreenValue green = (GreenValue) value;
                //update model
                barModel.setValue(Color.green,green.getValue());
                //retrieve value from model
                System.out.println("Green value: " + barModel.getValue(Color.green));
                view.updateGreenBar(barModel.getValue(Color.green));
            }
            if(value.getClass() == BlueValue.class){
                System.out.println("Blue Value found in queue. ");
                BlueValue blue = (BlueValue) value;
                //update model
                barModel.setValue(Color.blue,blue.getValue());
                //retrieve value from model
                System.out.println("Blue value: " + barModel.getValue(Color.blue));
                view.updateBlueBar(barModel.getValue(Color.blue));
            }
            if(value.getClass() == ResetValue.class){
                System.out.println("Reset value called");
                ResetValue reset = (ResetValue) value;
                //update model
                barModel.setValue(Color.red,reset.getValue());
                barModel.setValue(Color.green,reset.getValue());
                barModel.setValue(Color.blue,reset.getValue());
                //retrieve value from model
                view.reset(barModel.getValue(Color.red));
            }

        }
    }
}
