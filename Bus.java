package org.study_250509;

public class Bus extends Car {

    // Car 자식 클래스, Override함

    @Override
    public void start() {
        System.out.println("버스에 시동이 걸렸습니다.");
    }

    @Override
    public void drive() {
    System.out.println("버스가 달리고 있습니다! 비켜주세요 빠아앙~~");
    }

    @Override
    public void stop() {
        System.out.println("버스가 정지했습니다. 끼이익~~ ");
    }

    @Override
    public void turnoff() {
        System.out.println("운행은 여기까지 입니다. 버스의 시동을 껐습니다.");
    }
}
