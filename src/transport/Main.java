package transport;

import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

import static transport.Car.BodyType.*;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, SEDAN);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, HATCHBACK);
        Car bmw = new Car("BMW", "Z8", 2.8, COUPE);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, UNIVERSAL);

        Bus liAZ = new Bus("ЛиАЗ", "Курсор", 5.0, Bus.Type.SMALL);
        Bus mAZ = new Bus("МАЗ", "Междугородец", 3.5, Bus.Type.BIG);
        Bus liaz = new Bus("ЛиАЗ", "Курсор1", 3.0, Bus.Type.MEDIUM);
        Bus maz = new Bus("МАЗ", "Междугородец1", 3.7, Bus.Type.ESPECIALLY_SMALL);

        Truck krAZ = new Truck("КрАЗ", "С 18", 6.2, Truck.Type.N1);
        Truck kamAZ = new Truck("КамАЗ", "4308", 6.2, Truck.Type.N2);
        Truck gAZ = new Truck("ГАЗ", "22177", 6.2, Truck.Type.N3);
        Truck volvo = new Truck("Volvo", "FL7", 6.2, Truck.Type.N1);

        System.out.println(lada);
        System.out.println(krAZ);
        System.out.println(gAZ);
        System.out.println(kamAZ);
        System.out.println(liAZ);
        System.out.println(maz);
        bmw.printType();
        mAZ.printType();
        volvo.printType();



       /* lada.pitStop();
        mAZ.pitStop();
        gAZ.pitStop();

        DriverB ivan = new DriverB("Иван", true, 3);
        DriverC petr = new DriverC("Петр", true, 6);
        DriverD vasiliy = new DriverD("Василий", true, 01);

        ivan.startMove(lada);
        ivan.stopMove(lada);
        ivan.refill(lada);

        ivan.printInfo(lada);*/

    }

}