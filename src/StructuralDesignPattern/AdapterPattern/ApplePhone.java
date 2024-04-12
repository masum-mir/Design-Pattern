package StructuralDesignPattern.AdapterPattern;

public class ApplePhone {
    private AppleCharger appleCharger;

    ApplePhone(AppleCharger appleCharger) {
        this.appleCharger = appleCharger;
    }

    public void chargeApple() {

        appleCharger.chargePhone();

    }
}
