package project.factory;

import project.Cars.Car;
import project.Cars.GeelyCar;
import project.enums.CarColors;
import project.enums.CarEngine;
import project.enums.CarWheelSize;

public class GeelyFactory extends Factory{
    @Override
    public Car createCar(int year, CarEngine carEngine, CarWheelSize carWheelSize, CarColors carColors) {
        createSchemeCar(year,carEngine,carWheelSize,carColors);
        GeelyCar car = new GeelyCar(getCheckedYear(), getCheckedValue(), getCheckedColor(), getCheckedWheels());
        return car;
    }
}
