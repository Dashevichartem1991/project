package project.factory;

import project.Cars.Car;
import project.Cars.FordCar;
import project.enums.CarColors;
import project.enums.CarEngine;
import project.enums.CarWheelSize;

public class FordFactory extends  Factory {


    @Override
    public Car createCar(int year, CarEngine carEngine, CarWheelSize carWheelSize, CarColors carColors) {
        createSchemeCar(year,carEngine,carWheelSize, carColors);
        FordCar car = new FordCar(getCheckedYear(), getCheckedValue(), getCheckedColor(), getCheckedWheels());
        return car;
    }


}
