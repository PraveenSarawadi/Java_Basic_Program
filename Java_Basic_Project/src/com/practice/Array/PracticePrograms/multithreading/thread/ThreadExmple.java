package com.practice.Array.PracticePrograms.multithreading.thread;
class MyThread extends Thread{
    String threadName;
    public MyThread(String threadName){
        this.threadName=threadName;
    }

    @Override
    public void run() {
        for(int i=1;i<5;i++){
            System.out.println(threadName+" count: "+i);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println(threadName+" Interrupted: "+e);

            }
            System.out.println(threadName+" finished");
        }
    }
}
public class ThreadExmple {
    public static void main(String[] args) {
        MyThread t1= new MyThread("thread1");
        MyThread t2= new MyThread("thread2");
        MyThread t3= new MyThread("thread3");
//        System.out.println(t1.getState());
        t1.start();
//        System.out.println(t2.getState());
        t2.start();
//        System.out.println(t3.getState());
        t3.start();
        try{
            t1.join();
        }
        catch (InterruptedException e){
            System.out.println("Interuppted "+e);
        }
        System.out.println("all threades finished");
        System.out.println("stete t1"+t1.getState());
        System.out.println("stete t2"+t2.getState());
        System.out.println("stete t3"+t3.getState());

    }
}
