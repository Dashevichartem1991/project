package project.service;

import project.Cars.Car;
import project.enums.CarColors;
import project.exception.ColorException;
import project.moreInterface.ColorChange;


public class ServiceColor extends Service implements ColorChange {

    @Override
    public void changeColorCar(Car car, CarColors color) {
        try {
            if (color == null)
                throw new ColorException("Не правильный цвет!");
        } catch (ColorException e) {

            System.err.println(e.getMessage());

        }
        car.setColor(color.getColor());
    }
}
