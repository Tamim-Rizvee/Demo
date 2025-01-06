

public class Main {
    public static void main(String[] args) throws Exception {
        // book book1 = new book("Java", "Tamim", 100.0);
        // book book2 = new book("Python", "Prionti", 200.0);
        // book book3 = new book("C++", "John", 300.0);
        // book1.display();
        // book2.display();
        // book3.display();

        // car car1 = new car("Toyota", "Corolla", 2020, 4);
        // car car2 = new car("Honda", "Civic", 2021, 4);
        // car car3 = new car("Suzuki", "Alto", 2019, 4);

        // car1.display();
        // car2.display();
        // car3.display();

        circle circle1 = new circle(5);
        System.out.printf("Area of circle: %.2f\n", circle1.area());
        System.out.printf("Perimeter of circle: %.2f\n", circle1.perimeter());


        Rectangle rectangle1 = new Rectangle(5, 10);
        System.out.println("Area of rectangle: " + rectangle1.area());
        System.out.println("Perimeter of rectangle: " + rectangle1.perimeter());

    }
}
