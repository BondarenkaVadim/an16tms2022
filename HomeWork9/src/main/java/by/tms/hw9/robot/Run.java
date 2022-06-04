package by.tms.hw9.robot;

import by.tms.hw9.robot.hands.IHand;
import by.tms.hw9.robot.hands.SamsungHand;
import by.tms.hw9.robot.hands.SonyHand;
import by.tms.hw9.robot.heads.SamsungHead;
import by.tms.hw9.robot.heads.SonyHead;
import by.tms.hw9.robot.heads.ToshibaHead;
import by.tms.hw9.robot.legs.SamsungLeg;
import by.tms.hw9.robot.legs.SonyLeg;

public class Run {


    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        Robot[] robotsArryy = new Robot[3];
        {
            Robot robot = new Robot(new SamsungHead(10), new SamsungHand(10), new SamsungLeg(15));
            robotsArryy[0] = robot;
        }
        {
            Robot robot = new Robot(new ToshibaHead(30), new SonyHand(10), new SamsungLeg(20));
            robotsArryy[1] = robot;
        }
        {
            Robot robot = new Robot(new SonyHead(40), new SonyHand(50), new SonyLeg(15));
            robotsArryy[2] = robot;

        }
        for (int i = 0; i < robotsArryy.length; i++) {
            robotsArryy[i].action();
            System.out.println("----------------");
        }


     robotMaxPrice(robotsArryy);

    }



    public static void robotMaxPrice(Robot[] robotsArray){
        int robotMaxPrice;
        int robotMaxPriceValue = 0;
        robotMaxPrice = robotsArray[0].getPrice();
        for (int i = 0; i < robotsArray.length; i++) {
            if (robotMaxPrice <robotsArray[i].getPrice())
                robotMaxPrice = robotsArray[i].getPrice();
                robotMaxPriceValue = i;
        }
        robotMaxPriceValue ++; //= robotMaxPriceValue +1;
        System.out.println("The most expensive robot #" +robotMaxPriceValue+", its price is " + robotMaxPrice);
    }
}