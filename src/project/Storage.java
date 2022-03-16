package project;

import project.Cars.Car;
import project.Cars.FordCar;
import project.Cars.GeelyCar;
import project.Cars.MercedesCar;
import project.enums.CarColors;
import project.enums.CarEngine;
import project.enums.CarWheelSize;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private List<Car> storage = new ArrayList<>();

    public Storage(){
        storage.add(new FordCar(2022, CarEngine.VOLUME1_6, CarColors.BLACK, CarWheelSize.INCH_15));
        storage.add(new FordCar(2022, CarEngine.VOLUME2_0, CarColors.WHITE, CarWheelSize.INCH_20));
        storage.add(new MercedesCar(2022, CarEngine.VOLUME1_8, CarColors.BLUE, CarWheelSize.INCH_17));
        storage.add(new MercedesCar(2022, CarEngine.VOLUME2_0, CarColors.RED, CarWheelSize.INCH_17));
        storage.add(new GeelyCar(2022, CarEngine.VOLUME2_0, CarColors.GREEN, CarWheelSize.INCH_18));
        storage.add(new GeelyCar(2022, CarEngine.VOLUME2_0, CarColors.GREEN, CarWheelSize.INCH_19));
    }

    public Car carFinding(Car car){
        for (int i = 0; i < storage.size(); i++) {
            Car garageCar = storage.get(i);
            if (garageCar.equals(car)) {
                garageCar.setWheelSize(car.getWheelSize());
                garageCar.setColor(car.getColor());
                storage.remove(i);
                return garageCar;
            }
        }
        return car;
    }
    public Car getCar(int numberOfCar) {
        return storage.get(numberOfCar);
    }

    @Override
    public String toString() {
        System.out.println("Склад автомобилей");
        StringBuilder sb = new StringBuilder();
        int count = 1;
        int iMax = storage.size() - 1;
        for (int i = 0; ; i++) {
            sb.append("\n ")
                    .append("\nНомер машины на складе: ").append(count)
                    .append("\n ")
                    .append("\n");
            count++;
            sb.append(storage.get(i).toString());
            if (i == iMax) {
                return sb.append(' ').toString();
            }
        }
    }

}
