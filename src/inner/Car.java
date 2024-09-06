package inner;

public class Car {
    public InterfataEngine getEngine(int fuelCapacity){
        return () -> fuelCapacity;
    }
    private class Engine implements InterfataEngine{
        private int fuelCapacity;

        public Engine(int fuelCapacity) {
            this.fuelCapacity = fuelCapacity;
        }

        @Override
        public int getFuelCapacity() {
            return fuelCapacity;
        }
    }
    /*public Engine getEngine(int n){
        Engine engine = new Engine(n);
        return engine;
    }*/
}