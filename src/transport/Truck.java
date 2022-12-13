package transport;

public class Truck extends Transport implements Competing {
    private Type type;
    public Truck(String brand, String model, double engineVolume, Type type) {
        super(brand, model, engineVolume);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString() + ", грузоподъемность: " + type;
    }

    public enum Type {
        N1(0.0f, 3.5f),
        N2(3.5f, 12.0f),
        N3(12.0f, 0.0f);
    private final float min;
    private final float max;

        public float getMin() {
            return min;
        }

        public float getMax() {
            return max;
        }

        @Override
        public String toString() {
            if (min <=0){
                return " до " + max;
            } else if (max <=0){
                return " свыше " + min;
            } else {
                return " от " + min + " до " + max;
            }
        }

        Type(float min, float max){
        this.min = min;
        this.max = max;



    }
    }
    @Override
    public void start(){
        System.out.println("Грузовик \"" + getBrand() + "\" (\"" + getModel() +"\") начал движение");
    }
    @Override
    public void stop(){
        System.out.println("Грузовик \"" + getBrand() + "\" (\"" + getModel() +"\") закончил движение");
    }

    @Override
    public void pitStop(){
        System.out.println("Грузовик прошел пит-стоп");
    }

    @Override
    public int bestLoopTime(){
        return (int)(Math.random()*13);
    }

    @Override
    public int maxSpeed(){
        return (int)(Math.random()*110);
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public void printType() {
        if (type == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(type);
        }
    }
}
