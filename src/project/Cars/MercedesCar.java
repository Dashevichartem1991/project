package project.Cars;

import project.enums.CarColors;
import project.enums.CarEngine;
import project.enums.CarWheelSize;

public class MercedesCar extends Car{
    public MercedesCar(int year, CarEngine engineVolume, CarColors color, CarWheelSize wheelSize) {
        super("Mercedes", year, engineVolume.getVolume(), color.getColor(), wheelSize.getSize());
    }
}
