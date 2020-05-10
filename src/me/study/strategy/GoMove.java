package me.study.strategy;

public class GoMove implements CarMove{
    @Override
    public void action() {
        System.out.println("Go");
    }
}
