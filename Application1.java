package org.study_250509;

public class Application1 {

    public static void main(String[] args) {

        System.out.println("Car 생성=====");
        Car car1 = new Car();
        car1.start();
        car1.drive();
        car1.stop();
        car1.turnoff();

        System.out.println("Sonata 생성=====");
        Sonata sonata1 = new Sonata();
        sonata1.start();
        sonata1.drive();
        sonata1.stop();
        sonata1.turnoff();

        System.out.println("Bus 생성=====");
        Bus bus1 = new Bus();
        bus1.start();
        bus1.drive();
        bus1.stop();
        bus1.turnoff();

        /* 부모 타입으로 자식 인스턴스 주소값 저장 */
        Car c1 = new Sonata();
        Car c2 = new Bus();

        // 동적 바인딩 확인
        System.out.println("동적바인딩 확인 ================");
        c1.start();
        c2.start();

        // 타입 형변환 확인
        System.out.println("클래스타입 형변환 확인===== ");
        ((Sonata) c1).drive();
        ((Bus) c2).turnoff();


        // instanceof 연산자 사용 확인
        System.out.println("instanceof 확인 =====");
        System.out.println("c1이 Sonata 타입인지 확인 : " + (c1 instanceof Sonata));
        System.out.println("c2가 Bus 타입인지 확인 : " + (c2 instanceof Bus));

        System.out.println("c1이 Car 타입인지 확인 : " + (c1 instanceof Car));

        System.out.println("c1이 Object 타입인지 확인 : " + (c1 instanceof Object));


        // 추상클래스, 메소드 출력
        System.out.println("추상 메소드 출력====");
        Wash_abst wash = new Wash_abst();
        wash.washcarMethod();

    }

}
