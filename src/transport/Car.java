package transport;

public class Car extends Transport implements Competing {
    private final BodyType bodyType;

    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    @Override
    public String toString() {
        return super.toString() + ", тип кузова: " + bodyType;
    }

    @Override
    public void printType() {
        if (bodyType == null){
            System.out.println("Данных по транспортному средству недостаточно");
        }
        System.out.println(bodyType);
    }

    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хэтчбек"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private final String name;

        BodyType (String name) {
            this.name = name;

        }

        @Override
        public String toString() {
            return name;
        }

        public String getName() {
            return name;


        }
    }

    @Override
    public void start(){
        System.out.println("Автомобиль \"" + getBrand() + "\" (\"" + getModel() +"\") начал движение");
    }
    @Override
    public void stop(){
        System.out.println("Автомобиль \"" + getBrand() + "\" (\"" + getModel() +"\") закончил движение");
    }

    @Override
    public void pitStop(){

        System.out.println("Автомобиль прошел пит-стоп");
    }

    @Override
    public int bestLoopTime(){

        return (int)(Math.random()*7);
    }

    @Override
    public int maxSpeed(){

        return (int)(Math.random()*200);
    }

    @Override
    public String name() {
        return null;
    }
}
