package Hw3;

import Hw3.Values.Value;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args){
        BlockingQueue<Value> queue = new LinkedBlockingQueue<>();
        System.out.println("Hi");

        BarModel barModel = new BarModel();
        View view = new View(queue,barModel.getBar());
        Controller controller = new Controller(view,queue,barModel);
        controller.mainLoop();
    }
}
