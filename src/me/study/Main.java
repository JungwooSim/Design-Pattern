package me.study;

public class Main {

    public static void main(String[] args) {
        //Singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("두 인스턴스는 같다.");
        }
    }
}
