public class Car {
    final int slot;
    final double power;

    private double maxPowerBattery;
    private double currentPowerBattery;
    private int batteryCount;


    public Car(int slot, double power) {
        this.slot = slot;
        this.power = power;
    }

    public boolean addBattery(Battery battery) {
        if (!isNotFullBattery()) return false;
        batteryCount++;
        maxPowerBattery += battery.capacity*1.5;
        currentPowerBattery = maxPowerBattery;
        return true;
    }
    public int getBatteryInfo() {
        if (batteryCount != slot) return 0;
        return (int) ((currentPowerBattery/maxPowerBattery)*100);
    }
    private boolean isNotFullBattery() {
        return batteryCount != slot;
    }
    public boolean run (int minutes) {
        if (isNotFullBattery()) return false;
        double hour = minutes/60.0;
        double runPower = hour*power;
        if (runPower > currentPowerBattery) return false;
        currentPowerBattery -= runPower;
        return true;
    }
}
