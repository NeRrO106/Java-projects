package inner;

public class MainClassInner {
    public static void main(String[] args){
        Car car = new Car();
        InterfataEngine firstEngine = car.getEngine(7);
        InterfataEngine secondEngine = car.getEngine(10);
    }
}
