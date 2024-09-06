package tema;

import java.util.Random;

public class Dealership {
    private class BrandOffer implements Offer{
        public int getDiscount(Car car){
            int discount = 0;
            if(car.tip == Car.CarType.Mercedes) discount =  5 * car.pret / 100;
            if(car.tip == Car.CarType.Fiat) discount =  10 * car.pret / 100;
            if(car.tip == Car.CarType.Skoda) discount =  15 * car.pret / 100;
            return discount;
        }
    }
    private class DealerOffer implements Offer{
        public int getDiscount(Car car){
            int dif = 2023 - car.anFabricatie, discount = 0;
            if(car.tip == Car.CarType.Mercedes) discount = 300 * dif;
            if(car.tip == Car.CarType.Fiat) discount = 100 * dif;
            if(car.tip == Car.CarType.Skoda) discount = 150 * dif;
            return discount;
        }
    }
    private class SpecialOffer implements Offer{
        public int getDiscount(Car car){
            int discount = 0;
            Random rand = new Random();
            rand.setSeed(20);
            discount = rand.nextInt(20, 100);
            return discount;
        }
    }
    public int getPriceOffer(Car car){
        Dealership d = new Dealership();
        Dealership.BrandOffer brand =  d.new BrandOffer();
        Dealership.DealerOffer dealer =  d.new DealerOffer();
        Dealership.SpecialOffer special =  d.new SpecialOffer();
        int totalDiscount = brand.getDiscount(car) + dealer.getDiscount(car) +  special.getDiscount(car);
        return totalDiscount;
    }
    public void negotiate(Car car, Offer procent){}
}
