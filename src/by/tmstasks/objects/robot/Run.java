package by.tmstasks.objects.robot;

/*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */


import by.tmstasks.objects.robot.hands.SamsungHand;
import by.tmstasks.objects.robot.hands.SonyHand;
import by.tmstasks.objects.robot.hands.ToshibaHand;
import by.tmstasks.objects.robot.heads.SamsungHead;
import by.tmstasks.objects.robot.heads.SonyHead;
import by.tmstasks.objects.robot.heads.ToshibaHead;
import by.tmstasks.objects.robot.legs.SamsungLeg;
import by.tmstasks.objects.robot.legs.SonyLeg;
import by.tmstasks.objects.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        SamsungHead samsungHead = new SamsungHead(150);
        ToshibaHead toshibaHead = new ToshibaHead(90);
        SonyHead sonyHead = new SonyHead(120);

        SamsungHand samsungHand = new SamsungHand(80);
        ToshibaHand toshibaHand = new ToshibaHand(100);
        SonyHand sonyHand = new SonyHand(90);

        SamsungLeg samsungLeg = new SamsungLeg(90);
        ToshibaLeg toshibaLeg = new ToshibaLeg(90);
        SonyLeg sonyLeg = new SonyLeg(100);

        Robot robot1 = new Robot(samsungHead, toshibaHand, sonyLeg);
        Robot robot2 = new Robot(sonyHead, samsungHand, toshibaLeg);
        Robot robot3 = new Robot(toshibaHead, sonyHand, samsungLeg);

        Robot[] robots = {robot1, robot2, robot3};
        for (Robot robot : robots) {
            robot.action();
            System.out.print("Стоимость робота: ");
            System.out.println(robot.getPrice());
            System.out.println();
        }
        if (robot1.getPrice() > (robot2.getPrice() | robot3.getPrice())) {
            System.out.println("Максимальная стоимость робота: " + robot1.getPrice());
            if (robot2.getPrice() > (robot1.getPrice() | robot3.getPrice())) {
                System.out.println("Максимальная стоимость робота: " + robot2.getPrice());
                if (robot3.getPrice() > (robot1.getPrice() | robot2.getPrice())) {
                    System.out.println("Максимальная стоимость робота: " + robot3.getPrice());
                }
            }

        }
    }
}
