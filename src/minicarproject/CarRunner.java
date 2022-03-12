package minicarproject;
public class CarRunner {
    public static void main(String[] args) {

        System.out.println("=========CAR1============");
//DATA TYPE(REFERENCE TYPE)          OBJECT TYPE
        Car car1 = new Honda();
        System.out.println(car1.model);//null
        System.out.println(car1.carMake());//car make: Honda
        System.out.println(car1.carModel());
        System.out.println(car1.carYear());
        System.out.println(car1.carPrice());

        System.out.println("=========CAR2============");
        Car car2 = new Honda("Civic", 2020, 20000);
        System.out.println(car2.model);//Civic
        System.out.println(car2.carMake());
        System.out.println(car2.carModel());
        System.out.println(car2.carYear());
        System.out.println(car2.carPrice());

        System.out.println("=========CAR3============");
        Car car3 = new Toyota();
        System.out.println(car3.carMake());
        System.out.println(car3.carModel());
        System.out.println(car3.carYear());
        System.out.println(car3.carPrice());
    }
}
