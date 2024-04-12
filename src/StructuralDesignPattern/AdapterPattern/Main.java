package StructuralDesignPattern.AdapterPattern;

public class Main {
    public static void main(String[] args) {

        System.out.println("Adapter Design Pattern.");

        AndroidCharger androidCharger = new ChargerAndroid();

        AppleCharger charger = new AdapterCharger(androidCharger);

        ApplePhone phone = new ApplePhone(charger);
        phone.chargeApple();


    }
}
