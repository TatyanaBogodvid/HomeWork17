package transport;

public abstract class Transport {
    private final String brand;
    private final String model;

    private final double engineVolume;

    public static boolean isNullOrEmpty(String s){
        return s == null || s.isEmpty();
    }

    public Transport(String brand, String model, double engineVolume) {
        if (isNullOrEmpty(brand)){
            this.brand = "нет информации";
        } else {
            this.brand = brand;
        }
        if (isNullOrEmpty(model)){
            this.model = "нет информации";
        } else {
            this.model = model;
        }
        if (engineVolume < 0){
            this.engineVolume = Math.abs(engineVolume);
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public abstract void start();

    public abstract void stop();

    public abstract String name();

    public abstract void printType();

    @Override
    public String toString() {
        return "Брэнд: " + brand + ", модель " + model + ", объем двигателя " + engineVolume;
    }
}
