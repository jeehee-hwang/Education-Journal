package org.study_250509;

public class Sonata extends Car{

    // Car 자식 클래스, Override함

    @Override
    public void start() {
        System.out.println("소나타에 시동을 걸었습니다.");
    }

    @Override
    public void drive() {
        System.out.println("소나타를 운전 중입니다. 빵빵~" );
    }

    @Override
    public void stop() {
        System.out.println("소나타가 정지했습니다. 끼익~");
    }

    @Override
    public void turnoff() {
        System.out.println("소나타의 시동을 껐습니다.");
    }

}
