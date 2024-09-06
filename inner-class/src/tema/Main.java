package tema;

import java.util.ArrayList;
import java.util.Arrays;

interface Offert {
    double calculateDiscount(Car car);
}

public class Main {
    public static void main(String[] args){

        ArrayList<Car> cars = new ArrayList<>();

        Car mercedes1 = new Car(20000, 2010, Car.CarType.Mercedes);
        Car mercedes2 = new Car(35000, 2015, Car.CarType.Mercedes);

        cars.add(mercedes1);
        cars.add(mercedes2);

        Car fiat1 = new Car(3500, 2008, Car.CarType.Fiat);
        Car fiat2 = new Car(7000, 2010, Car.CarType.Fiat);

        cars.add(fiat1);
        cars.add(fiat2);

        Car skoda1 = new Car(12000, 2015, Car.CarType.Skoda);
        Car skoda2 = new Car(25000, 2021, Car.CarType.Skoda);

        cars.add(skoda1);
        cars.add(skoda2);

        Dealership d = new Dealership();

        for(Car car : cars){
            System.out.println("Pentru masina " + car.tip + " se acord un discount de " + d.getPriceOffer(car) + " rezultand pretul masinii de(euro): " + (car.pret - d.getPriceOffer(car)));
        }
        Car mert = new Car(20000, 2019, Car.CarType.Mercedes);
        d.negotiate(mert, new Offer(){
            @Override
            public int getDiscount(Car car) {
                return car.pret * (5 / 100);
            };
            int disc = getDiscount(mert);
            void showDiscount(){
                System.out.println(disc);
            }
        });

        Car m1 = new Car(30000, 2019, Car.CarType.Mercedes);
        Car m2 = new Car(50000, 2021, Car.CarType.Mercedes);
        Car f1 = new Car(10000, 2018, Car.CarType.Fiat);
        Car s1 = new Car(20000, 2019, Car.CarType.Skoda);
        ArrayList<Car> carsList = new ArrayList<>(Arrays.asList(m1, m2, f1, s1));
        carsList.forEach((v) -> System.out.println(v));
        carsList.removeIf((p) -> p.pret > 25000);
        carsList.forEach((v) -> System.out.println(v));
    }
}
