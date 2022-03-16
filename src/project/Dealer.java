package project;

import project.Cars.Car;
import project.enums.CarColors;
import project.enums.CarEngine;
import project.enums.CarWheelSize;
import project.factory.Factory;
import project.service.ServiceColor;
import project.service.ServiceOption;
import project.service.ServiceWheelSize;

import java.util.Arrays;

public class Dealer {

    private ServiceColor dealerServiceColor;
    private ServiceWheelSize dealerServiceWheelSize;
    private ServiceOption dealerServiceOption;

    public Dealer(ServiceColor dealerServiceColor, ServiceWheelSize dealerServiceWheelSize, ServiceOption dealerServiceOption) {
        this.dealerServiceColor = dealerServiceColor;
        this.dealerServiceWheelSize = dealerServiceWheelSize;
        this.dealerServiceOption = dealerServiceOption;
    }

    public StringBuilder printCarProperties() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nХарактеристики машин :")
                .append("\nДоступные цвета: ").append(Arrays.toString(CarColors.values()))
                .append("\nДиаметр колес: ").append(Arrays.toString(CarWheelSize.values()))
                .append("\nОбъемы двигателей: ").append(Arrays.toString(CarEngine.values()))
                .append("\n");
        return sb;
    }

    public void changeCarColorInColorService(Car car, CarColors color) {
        dealerServiceColor.changeColorCar(car, color);
    }

    public void changeCarWheelsInWheelService(Car car, CarWheelSize wheels) {
        dealerServiceWheelSize.changeWheelSize(car, wheels);
    }

    public void addCarOptionsInOptionsService(Car car, String option) {
        dealerServiceOption.addOptionCar(car, option);
    }

    public void removeCarOptionsInOptionsService(Car car) {
        dealerServiceOption.rmCarOption(car);
    }

    public void makeOrder(Factory factory, Storage garage, int year, CarEngine volume,
                          CarWheelSize wheels, CarColors color) {
        System.out.println("\nМашина по вашему заказу: \n"
                + garage.carFinding(factory.createCar(year, volume, wheels, color)));
    }

}
