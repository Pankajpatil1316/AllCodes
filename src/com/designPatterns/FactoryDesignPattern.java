package com.designPatterns;

interface Car{
    void assemble();
}

class SUV implements Car{
    public void assemble() {
        System.out.println("Assembling a SUV Car");
    }
}

class  Sedan implements Car{
    public void assemble() {
        System.out.println("Assembling a Sedan Car");
    }
}
class CarFactory{
    public Car getCar(String carType){
        switch (carType.toLowerCase()) {
            case "suv":
                return new SUV();
            case "sedan":
                return new Sedan();
            default:
                System.out.println("Unknown car type");
                return null;
        }
    }
}
public class FactoryDesignPattern {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car car1 = carFactory.getCar("sedan");
        car1.assemble();  // Output: Assembling a Sedan Car

        Car car2 = carFactory.getCar("suv");
        car2.assemble();  // Output: Assembling an SUV Car
    }
}
