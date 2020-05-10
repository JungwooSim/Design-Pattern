package me.study.strategy;

public class Car {
    private CarMove carMove;

    public Car(CarMove carMove) {
        this.carMove = carMove;
    }

    public void move() {
        carMove.action();
    }

    public void setCarMove(CarMove carMove) {
        this.carMove = carMove;
    }
}
