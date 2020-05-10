package me.study.strategy;

public class LeftMove implements CarMove{
    @Override
    public void action() {
        System.out.println("Left");
    }
}
