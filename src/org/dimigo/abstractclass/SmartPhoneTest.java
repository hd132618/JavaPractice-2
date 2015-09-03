package org.dimigo.abstractclass;

/**
 * Created by gandd on 2015-08-28.
 */
public class SmartPhoneTest {
    public static void main(String[] args) {
        SmartPhone[] phones = {
                new IPhone("iPhone 6", "애플", 700000),
                new Galaxy("갤럭시 S6", "삼성", 650000)
        };

        for(SmartPhone phone : phones) {
            System.out.println(phone);
            phone.turnOn();
            phone.pay();

            phone.useSpeicalFunction();

            phone.turnOff();
            System.out.println();
        }


    }
}
