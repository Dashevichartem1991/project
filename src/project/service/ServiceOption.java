package project.service;

import project.Cars.Car;
import project.exception.OptionException;
import project.moreInterface.OptionsChange;

public class ServiceOption extends Service implements OptionsChange {

    @Override

    public void addOptionCar(Car car, String option){
        try {
            if (option == null)
                throw new OptionException("Не правильная опция");
        } catch (OptionException e) {
            option = "нет такой";
            System.err.println(e.getMessage());
            System.err.println("Опцию добавить не можем");
        }
        if (car.getOptions().equals("нет такой")) {
            car.setOptions(option);
        } else car.setOptions(car.getOptions() + ", " + option);

    }
    @Override
        public void rmCarOption(Car car){
        car.setOptions("Отсутствуют");
    }

}
