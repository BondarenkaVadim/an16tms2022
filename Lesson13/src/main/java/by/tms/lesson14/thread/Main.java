package by.tms.lesson14.thread;

public class Main {
    public static void main(String[] args) {
        System.out.println("main");
         FirstThread firstThread = new FirstThread("FirstThread");
        // firstThread.run();
           firstThread.start(); //чтобы стартануть поток обязательно с начала метод start/

        SecondThread secondThread = new SecondThread();
        secondThread.run(); //поток не стартанет

        Thread thread = new Thread(secondThread);
        thread.start(); //так стартанет поток

        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                System.out.println("start my Thread");
            }
        };
        // как развернуть из лямбда выражений в обычные
        new Thread(){
            @Override
            public void run() {
                System.out.println("sssd");
            }
        }.start();

//методы Object - знать (wait, notify, notifyAll, ... и тд)
    }
}
