package project.moreInterface;


import project.Cars.Car;
import project.enums.CarColors;
import project.enums.CarEngine;
import project.enums.CarWheelSize;


public interface CreateCar {

    Car createCar (int year, CarEngine carEngine, CarWheelSize carWheelSize, CarColors carColors);
}
