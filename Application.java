package org.study_250509;

public class Application {

    public static void main(String[] args) {

        System.out.println("Car 생성=====");  // Car 생성=====
        Car car1 = new Car();
        car1.start(); //차에 시동을 걸고 있습니다.
        car1.drive(); //차가 도로를 달리고 있습니다.
        car1.stop();  //차가 정지했습니다.
        car1.turnoff(); //차의 시동을 껐습니다.

        System.out.println("Sonata 생성====="); //Sonata 생성=====
        Sonata sonata1 = new Sonata();
        sonata1.start(); //소나타에 시동을 걸었습니다.
        sonata1.drive(); //소나타를 운전 중입니다. 빵빵~
        sonata1.stop();  //소나타가 정지했습니다. 끼익~
        sonata1.turnoff(); //소나타의 시동을 껐습니다.

        System.out.println("Bus 생성====="); //Bus 생성=====
        Bus bus1 = new Bus();
        bus1.start(); //버스에 시동이 걸렸습니다.
        bus1.drive(); //버스가 달리고 있습니다! 비켜주세요 빠아앙~~
        bus1.stop(); //버스가 정지했습니다. 끼이익~~
        bus1.turnoff(); //운행은 여기까지 입니다. 버스의 시동을 껐습니다.

        /* 부모 타입으로 자식 인스턴스 주소값 저장 */
        Car c1 = new Sonata();
        Car c2 = new Bus();

        // 동적 바인딩 확인
        System.out.println("동적바인딩 확인 ================"); //동적바인딩 확인 ================
        c1.start(); //소나타에 시동을 걸었습니다.
        c2.start(); //버스에 시동이 걸렸습니다.

        // 타입 형변환 확인
        System.out.println("클래스타입 형변환 확인===== "); //클래스타입 형변환 확인=====
        ((Sonata) c1).drive(); //소나타를 운전 중입니다. 빵빵~
        ((Bus) c2).turnoff(); //운행은 여기까지 입니다. 버스의 시동을 껐습니다.


        // instanceof 연산자 사용 확인
        System.out.println("instanceof 확인 ====="); //instanceof 확인 =====

        System.out.println("c1이 Sonata 타입인지 확인 : " + (c1 instanceof Sonata));
        //c1이 Sonata 타입인지 확인 : true
        System.out.println("c2가 Bus 타입인지 확인 : " + (c2 instanceof Bus));
        //c2가 Bus 타입인지 확인 : true

        System.out.println("c1이 Car 타입인지 확인 : " + (c1 instanceof Car));
        // c1이 Car 타입인지 확인 : true

        System.out.println("c1이 Object 타입인지 확인 : " + (c1 instanceof Object));
        // c1이 Object 타입인지 확인 : true


        // 추상클래스, 메소드 출력
        System.out.println("추상 메소드 출력===="); // 추상 메소드 출력====
        Wash_abst wash = new Wash_abst();
        wash.washcarMethod(); //차를 세차 중입니다.

    }


}
