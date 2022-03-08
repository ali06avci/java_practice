package minicarproject;
public class Honda extends Car{
    String make="Honda";
    String model="Civic";
    int year=2014;
    double price=9000;

    static {
        System.out.println("Honda is on the way");
    }
    public Honda () {

    }
    public Honda(String model, int year, double price) {
        super(model,year,price);
        this.model = model;
        this.year = year;
        this.price = price;
    }
    @Override
    String carMake() {
        return "Car make: " +this.make;
    }
    @Override
    String carModel() {
        return "Car model: "+this.model;
    }
    @Override
    int carYear() {
        return this.year;
    }
    @Override
    double carPrice() {
        return this.price;
    }
}
