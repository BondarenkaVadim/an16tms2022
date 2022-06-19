package by.tms.lesson14.thread;

public class FirstThread extends Thread{  //хуже чем second тк мы уже отнаследовались, а наслодоваться можно единожды
    public FirstThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        System.out.println(getName());

        try {
            Thread.sleep(60*1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
