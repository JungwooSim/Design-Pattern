package me.study;

import me.study.decorator.Beverage;
import me.study.decorator.Espresso;
import me.study.decorator.HouseBlend;
import me.study.decorator.Mocha;
import me.study.proxy.protcetedProxy.Employee;
import me.study.proxy.protcetedProxy.GRADE;
import me.study.proxy.protcetedProxy.NormalEmployee;
import me.study.proxy.protcetedProxy.ProtectedEmployee;
import me.study.proxy.virtual.VirtualProxy;
import me.study.proxy.virtual.VirtualProxyImpl;
import me.study.proxy.virtual.VirtualProxyInterface;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //Singleton
//        Singleton singleton1 = Singleton.getInstance();
//        Singleton singleton2 = Singleton.getInstance();
//
//        if (singleton1 == singleton2) {
//            System.out.println("두 인스턴스는 같다.");
//        }

        // Strategy
//        Car car1 = new Car(new GoMove());
//        car1.move();
//
//        Car car2 = new Car(new RightMove());
//        car2.move();
//
//        Car car3 = new Car(new LeftMove());
//        car3.move();

        // Template
//        me.study.template.Car car = new me.study.template.Move();
//        car.move();

        // Template Callback
//        Calculator calculator = new Calculator();
//        System.out.println(calculator.calculatorTemplateMethod(1, 2, ((num1, num2) -> num1 + num2)));
//
//        System.out.println(calculator.calculatorTemplateMethod(1, 2, ((num1, num2) -> num1 * num2)));

        // Virtual Proxy
//        VirtualProxyInterface virtualProxyInterface2 = new VirtualProxyImpl();
//        virtualProxyInterface2.action();
//
//        VirtualProxyInterface virtualProxyInterface1 = new VirtualProxy();
//        virtualProxyInterface1.action();

        /*
        // Protected Proxy
        Employee manager = new NormalEmployee("manager", GRADE.Manager);
        Employee staff = new NormalEmployee("staff", GRADE.Staff);
        List<Employee> employees = Arrays.asList(manager, staff);

        // protected 미적용
        printAllInformation(staff, employees);
        System.out.println("----------------");

        List<Employee> protectedEmployees = employees.stream().map(ProtectedEmployee::new).collect(Collectors.toList());

        // protected 적용
        printAllInformation(staff, protectedEmployees);
        System.out.println("----------------");

        printAllInformation(manager, protectedEmployees);
         */

        Beverage beverage = new Espresso();
        System.out.println(beverage);

        beverage = new Mocha(beverage);
        System.out.println(beverage);

        Beverage beverage2 = new HouseBlend();
        System.out.println(beverage2);

        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2);

    }
    public static void printAllInformation(Employee viewer, List<Employee> employees) {
        employees.stream().map(
                employee -> {
                    return employee.getInformation(viewer);
                }).forEach(System.out::println);
    }
}
