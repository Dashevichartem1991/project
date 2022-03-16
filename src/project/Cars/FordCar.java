package project.Cars;

import project.enums.CarColors;
import project.enums.CarEngine;
import project.enums.CarWheelSize;

public class FordCar extends Car{
    public FordCar(int year, CarEngine engineVolume, CarColors color, CarWheelSize wheelSize) {
        super("Ford", year, engineVolume.getVolume(), color.getColor(), wheelSize.getSize());
    }
}
