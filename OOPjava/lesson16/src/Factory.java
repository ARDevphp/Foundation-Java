/**
 * Kundan-kunga mashina ishlab chiqish sanoati rivojlanmoqda va ko'paymoqda.
 * Factory(zavod) nomli sinf va uning kunstruktorida zavod nomi beriladi.
 * Car(mashina) sinfi va konstruktorida
 * Model nomli sinf obyektini qabul qiladi.
 * Model sinfi model nomi va rangini saqlaydi.
 * Car sinfining getInfo
 * metodi mashina nomi, rangi va zavod nomini
 * "factory_name|car_name|car_color" formatda qaytaradi.
 */

public class Factory {
    private String factoryName;

    public Factory(String factoryName) {
        this.factoryName = factoryName;
    }
    class Car {
        private Model model;

        public Car(Model model) {
            this.model = model;
        }

        public void getInfo() {
            System.out.println("brand " + model.getBrand());
            System.out.println("Color " + model.getColor());
            System.out.println("Factory " + factoryName);
        }
    }
}
