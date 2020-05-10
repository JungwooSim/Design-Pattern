package me.study.template;

public class Move extends Car{
    @Override
    protected void move1() {
        System.out.println("Go");
    }

    @Override
    protected void move2() {
        System.out.println("Left");
    }
}
