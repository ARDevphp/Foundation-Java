public class Tast {
    public static void main(String[] args) {
        Factory factory = new Factory("Lasseti");
        Factory factory1 = new Factory("Malibu2");
        Model model = new Model("Car1","Oq");
        Model model1 = new Model("Car2","Qora");
        Factory.Car car = factory.new Car(model);
        Factory.Car car2 = factory1.new Car(model1);
        car.getInfo();
        car2.getInfo();
        System.out.println("----------------");
        car.getInfo();
        car2.getInfo();
    }
}
