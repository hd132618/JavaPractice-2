package org.dimigo.inheritance;

/**
 * Created by gandd on 2015-08-28.
 */
public class Galaxy extends SmartPhone {
    public Galaxy() {

    }

    public Galaxy(String model, String company, int price) {
        super(model, company, price);
    }

    public void pay() {
        System.out.print("삼성 페이로 ");
        super.pay();
    }

    public void useWirelessCharging() {
        System.out.println("무선충전 기능을 사용합니다.");
    }
}