public class DecoratorPatternTest {

    public static void main(String[] args) {
        Car superCar = new SportsCar(new BasicCar());
        superCar.assemble();
        System.out.println("\n*****");

        Car SportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        SportsLuxuryCar.assemble();
    }

}