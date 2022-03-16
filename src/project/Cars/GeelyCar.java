package project.Cars;

import project.enums.CarColors;
import project.enums.CarEngine;
import project.enums.CarWheelSize;

public class GeelyCar extends Car {
    public GeelyCar(int year, CarEngine engineVolume, CarColors color, CarWheelSize wheelSize) {
        super("Geely", year, engineVolume.getVolume(), color.getColor(), wheelSize.getSize());
    }
}
