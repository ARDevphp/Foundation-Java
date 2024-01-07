class Main1{
    public static void main(String[] args) {
        Region region = new Region("Toshkent ");
        Region region1 = new Region("Andijon ");

        Region.Person person = region.new Person("Abdulloh");
        Region.Person person1 = region.new Person("Abdulloh1 ");
        Region.Person person2 = region1.new Person("Abdulloh2 ");
        Region.Person person3 = region1.new Person("Abdulloh3");

        region1.name = "Andijon";

        person.show();
        person1.show();
        person2.show();
        person3.show();
    }
}


class Region {
    String name;
    int count = 1000_000;


    public Region(String name) {
        this.name = name;
    }
    class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }
        void show() {
            System.out.println("Name " + name);
            System.out.println("Region " + Region.this.name);
            System.out.println("====================");
        }
    }
}
