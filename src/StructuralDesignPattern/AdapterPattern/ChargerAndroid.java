package StructuralDesignPattern.AdapterPattern;

public class ChargerAndroid implements AndroidCharger{
    @Override
    public void chargerAndroidPhone() {
        System.out.println("Charging Android");
    }
}
