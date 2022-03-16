package project.service;

import project.Cars.Car;
import project.enums.CarWheelSize;
import project.exception.WheelSizeException;
import project.moreInterface.WheelSizeChange;

public class ServiceWheelSize extends Service implements WheelSizeChange {
    @Override
    public void changeWheelSize(Car car, CarWheelSize carWheelSize){
        try {
            if (carWheelSize == null)
                throw new WheelSizeException("Такого размера колес нет");
        } catch (WheelSizeException e) {

            System.err.println(e.getMessage());

        }
        car.setWheelSize(carWheelSize.getSize());
    }
}
