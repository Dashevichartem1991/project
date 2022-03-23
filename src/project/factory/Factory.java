package project.factory;

import project.enums.CarColors;
import project.enums.CarEngine;
import project.enums.CarWheelSize;
import project.exception.ColorException;
import project.exception.CreateCarException;
import project.exception.WheelSizeException;
import project.moreInterface.CreateCar;

public abstract class Factory implements CreateCar {

    private int checkedYear;
    private CarEngine checkedValue;
    private CarWheelSize checkedWheels;
    private CarColors checkedColor;

    public void createSchemeCar(int year, CarEngine value,
                             CarWheelSize wheels, CarColors color) {
        try {
            if (year < 1990 || year > 2021)
                throw new CreateCarException("!Год выпуска машины введен не корректно");
        } catch (CreateCarException e) {
            System.err.println(e.getMessage());
            if (year < 1990) {
                year = 1990;
                System.err.println("Был установлен минимальный год выпуска: 1990");
            } else {
                year = 2021;
                System.err.println("Был установлен максимальный год выпуска: 2021г");
            }
        }
        try {
            if (value == null)
                throw new CreateCarException("!Объем двигателя машины введен не корректно");
        } catch (CreateCarException e) {
            value = CarEngine.VOLUME2_0;
            System.err.println(e.getMessage());
            System.err.println("Был установлен объем двигателя по умолчанию: 1.5");
        }
        try {
            if (wheels == null)
                throw new WheelSizeException("!Размер колес машины введен не корректно");
        } catch (WheelSizeException e) {
            wheels = CarWheelSize.INCH_17;
            System.err.println(e.getMessage());
            System.err.println("Был установлен размер колес по умолчанию: 16");
        }
        try {
            if (color == null)
                throw new ColorException("!Цвет машины введен не корректно");
        } catch (ColorException e) {
            color = CarColors.BLACK;
            System.err.println(e.getMessage());
            System.err.println("Был установлен цвет машины по умолчанию: Black");
        }
        checkedYear = year;
        checkedValue = value;
        checkedWheels = wheels;
        checkedColor = color;
    }

    public int getCheckedYear() {
        return checkedYear;
    }

    public CarEngine getCheckedValue() {
        return checkedValue;
    }

    public CarWheelSize getCheckedWheels() {
        return checkedWheels;
    }

    public CarColors getCheckedColor() {
        return checkedColor;
    }


}
