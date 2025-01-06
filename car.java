
public class car extends vehicle{
    int gateNumber;

    car(String make, String model, int year, int gateNumber) {
        super(make, model, year);
        this.gateNumber = gateNumber;
    }

    void display() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Gate Number: " + gateNumber);
        System.out.println();
    }
}
