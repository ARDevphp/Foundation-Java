public class Test {
    public static void main(String[] args) {
        Lid lid = new Lid("123dgfgfs3");
        Lid lid1 = new Lid("12341234");
        Lid lid2 = new Lid("aeiudrgf");
        Lid lid3 = new Lid("kjdyiuea");
        Lid lid4 = new Lid("12Ac11ad");
        Lid lid5 = new Lid("12341234");

        Bonus bonus = new Bonus(5);
        System.out.println(bonus.check(lid));
        System.out.println(bonus.check(lid1));
        System.out.println(bonus.check(lid2));
        System.out.println(bonus.check(lid3));
        System.out.println(bonus.check(lid4));
        System.out.println(bonus.check(lid5));
    }
}
