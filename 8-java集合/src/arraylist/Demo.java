package arraylist;

import java.util.*;

class MyThread extends Thread{
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Demo.arrayList.add(Thread.currentThread().getName() + " " + System.currentTimeMillis());
    }
}

public class Demo{
    public static List arrayList = Collections.synchronizedList(new LinkedList<>());

    public static void main(String[] args) {
        Thread[] threadArray = new Thread[1000];
        for(int i = 0;i < threadArray.length;i++){
            threadArray[i] = new MyThread();
            threadArray[i].start();
        }
        for (Thread thread : threadArray) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (Object o : arrayList) {
            System.out.println(o);
        }
    }
}