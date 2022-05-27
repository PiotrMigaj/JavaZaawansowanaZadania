package pl.migibud.day1.ex18and19;

import lombok.*;


public class Computer {
    String processor;
    String ram;
    String graphicsCard;
    String manufacturer;
    String model;

    public Computer(String processor, String ram, String graphicsCard, String manufacturer, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.manufacturer = manufacturer;
        this.model = model;
    }
}
