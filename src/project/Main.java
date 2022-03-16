package project;

import project.factory.FordFactory;
import project.factory.GeelyFactory;
import project.factory.MercedesFactory;
import project.service.ServiceColor;
import project.service.ServiceOption;
import project.service.ServiceWheelSize;

public class Main {

    public static void main(String[] args) {


        ServiceColor serviceColor = new ServiceColor();
        ServiceWheelSize serviceWheelSize = new ServiceWheelSize();
        ServiceOption serviceOption = new ServiceOption();

        FordFactory fordFactory = new FordFactory();
        GeelyFactory geelyFactory = new GeelyFactory();
        MercedesFactory mercedesFactory = new MercedesFactory();

        Storage wareHouse = new Storage();
        Dealer dealer = new Dealer(serviceColor, serviceWheelSize, serviceOption);

        System.out.println(dealer.printCarProperties());
    }

}
