package me.study;

import me.study.singleton.Singleton;
import me.study.strategy.Car;
import me.study.strategy.GoMove;
import me.study.strategy.LeftMove;
import me.study.strategy.RightMove;

public class Main {

    public static void main(String[] args) {
        //Singleton
//        Singleton singleton1 = Singleton.getInstance();
//        Singleton singleton2 = Singleton.getInstance();
//
//        if (singleton1 == singleton2) {
//            System.out.println("두 인스턴스는 같다.");
//        }

        // Strategy
        Car car1 = new Car(new GoMove());
        car1.move();

        Car car2 = new Car(new RightMove());
        car2.move();

        Car car3 = new Car(new LeftMove());
        car3.move();
    }
}
