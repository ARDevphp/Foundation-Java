import java.util.Queue;


class B {
    public static void main(String[] args) {
        Oven oven = new Oven(1200,1200);
        oven.switchOn(1,30);
        oven.switchOn(3,40);
        oven.switchOn(2,20);
        oven.switchOff(1);
        oven.showInfo();

    }
}
public class Oven {
    private int[] powers = new int[3];
    private int spendPower;
    private boolean first = true;

    public Oven(int powers, int power2) {
        this.powers[0] = powers;
        this.powers[1] = power2;
    }


    public int switchOn(int code, int time) {
        if (first) {
            first = false;
        }
        else code -= time;
        return time;
    }
    public int switchOff(int vaqt) {
        return vaqt;
    }

    public void showInfo() {
        System.out.println("sariflangan vaqt" + spendPower);
    }
}
