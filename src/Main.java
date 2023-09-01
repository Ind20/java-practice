import coreJava.Switch;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 100.00);
        account.deposit(50);
        account.withdraw(30);

        Switch sw = new Switch();
        sw.getDay(5);

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("one", 1);
        System.out.println(map);

        //  Circle cir = new Circle(5);
        //  double area = cir.calculateArea();
        //  System.out.println(area);
        //  double per = cir.calculatePerimeter();
        //  System.out.println(per);

        // Rectangle rec = new Rectangle(5, 6);
        //  double rarea = rec.calculateArea();
        //  System.out.println(rarea);
        //  double rper = rec.calculatePerimeter();
        //  System.out.println(rper);


        //  Shape circle = new Circle(5);
        //  System.out.println("Circle Area: " + circle.calculateArea());
        //  System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

      /*
        for(int i =0; i<10; i++)
        {
            Shape rectangle = new Rectangle(4+i, 6+i);
            System.out.println("Rectangle Area: " + rectangle.calculateArea());
            System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        }

        */

    }

}
