package project.Cars;

import java.util.Objects;

public abstract class Car {

    private String madel;
    private int year;
    private double engineVolume;
    private String color;
    private int wheelSize;
    private String options;

    protected Car(String madel, int year, double engineVolume, String color, int wheelSize) {
        this.madel = madel;
        this.year = year;
        this.engineVolume = engineVolume;
        this.color = color;
        this.wheelSize = wheelSize;

    }

    public String getColor() {
        return color;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public String getOptions() {
        return options;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Double.compare(car.engineVolume, engineVolume) == 0 && Objects.equals(madel, car.madel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(madel, year, engineVolume, color, wheelSize, options);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
