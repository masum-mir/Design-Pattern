package StructuralDesignPattern.AdapterPattern;

public class AdapterCharger implements AppleCharger{

    private AndroidCharger androidCharger;
    AdapterCharger(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }
    @Override
    public void chargePhone() {
            androidCharger.chargerAndroidPhone();
        System.out.println("Using android charger with adapter");
    }
}
