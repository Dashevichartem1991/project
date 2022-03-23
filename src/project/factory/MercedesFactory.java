package project.factory;

import project.Cars.Car;
import project.Cars.MercedesCar;
import project.enums.CarColors;
import project.enums.CarEngine;
import project.enums.CarWheelSize;

public class MercedesFactory extends Factory{
    @Override
    public Car createCar(int year, CarEngine carEngine, CarWheelSize carWheelSize, CarColors carColors) {
        createSchemeCar(year,carEngine,carWheelSize,carColors);
        MercedesCar car = new MercedesCar(getCheckedYear(), getCheckedValue(), getCheckedColor(), getCheckedWheels());
        return car;
    }
}
