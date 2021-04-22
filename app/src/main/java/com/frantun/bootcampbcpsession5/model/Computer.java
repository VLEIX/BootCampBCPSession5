package com.frantun.bootcampbcpsession5.model;

public class Computer {
    public String name;
    public String brand;
    public String model;

    public Computer(String name) {
        this.name = name;
    }

    public Computer(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public Computer(String name, String brand, String model) {
        this.name = name;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
