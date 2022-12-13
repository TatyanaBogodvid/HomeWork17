package transport;

public class Bus extends Transport implements Competing {
    private Type type;
    public Bus(String brand, String model, double engineVolume, Type type) {

        super(brand, model, engineVolume);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", вместимость: " + type;
    }

    @Override
    public void printType() {
        if (type == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(type);
        }
    }

    public enum Type {
        ESPECIALLY_SMALL(0, 10),
        SMALL(0,25),
        MEDIUM(40, 50),
        BIG(60, 80),
        ESPECIALLY_BIG(100,120);

        public final int seatsMin;
        public final int seatsMax;

        Type (int seatsMin, int seatsMax){
            this.seatsMin = seatsMin;
            this.seatsMax = seatsMax;
        }

        public int getSeatsMin() {
            return seatsMin;
        }

        public int getSeatsMax() {
            return seatsMax;
        }

        @Override
        public String toString() {
            if (seatsMin <=0){
                return " до " + seatsMax;
            } else if (seatsMax <= 0){
                return " от " + seatsMin;
            } else {
                return " от " + seatsMin +
                        " до " + seatsMax;
            }
        }
    }
    @Override
    public void start(){
        System.out.println("Автобус \"" + getBrand() + "\" (\"" + getModel() +"\") начал движение");
    }
    @Override
    public void stop(){
        System.out.println("Автобус \"" + getBrand() + "\" (\"" + getModel() +"\") закончил движение");
    }
     @Override
    public void pitStop(){

        System.out.println("Автобус прошел пит-стоп");
     }

    @Override
    public int bestLoopTime(){

        return (int)(Math.random()*15);
    }

    @Override
    public int maxSpeed(){
        return (int)(Math.random()*100);
    }

    @Override
    public String name() {

        return null;
    }

}

