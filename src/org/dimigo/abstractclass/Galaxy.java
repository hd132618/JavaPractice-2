package org.dimigo.abstractclass;

/**
 * Created by gandd on 2015-08-28.
 */
public class Galaxy extends SmartPhone {
    public Galaxy() {

    }

    public Galaxy(String model, String company, int price) {
        super(model, company, price);
    }

    @Override
    public void pay() {
        System.out.println("삼성 페이로 결제");
    }

    public void useWirelessCharging() {
        System.out.println("무선충전 기능을 사용합니다.");
    }
}