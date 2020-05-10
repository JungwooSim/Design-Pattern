package me.study.strategy;

public class RightMove implements CarMove{
    @Override
    public void action() {
        System.out.println("Right");
    }
}
