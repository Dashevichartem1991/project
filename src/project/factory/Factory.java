package project.factory;

import project.enums.CarColors;
import project.enums.CarEngine;
import project.enums.CarWheelSize;
import project.exception.ColorException;
import project.exception.CreateCarException;
import project.exception.WheelSizeException;
import project.moreInterface.CreateCar;

public abstract class Factory implements CreateCar {



    public void createSchemeCar(int year,
                                CarEngine volume,
                                CarWheelSize carWheelSize,
                                CarColors carColors){

        try {
            if (year != 2022)
                throw new CreateCarException("Не правильный год выпуска");
        }catch (CreateCarException e){
            System.err.println(e.getMessage());
        }
        try {
            if (volume == null)
                throw new CreateCarException("Не правильный объем двигателя");
        } catch (CreateCarException e) {

            System.err.println(e.getMessage());

        }
        try {
            if (carWheelSize == null)
                throw new WheelSizeException("Не правильный размер колес");
        } catch (WheelSizeException e) {

            System.err.println(e.getMessage());
        }
        try {
            if (carColors == null)
                throw new ColorException("Не правильный цвет машины");
        } catch (ColorException e) {

            System.err.println(e.getMessage());
        }

    }




}
