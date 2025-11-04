package model;

public class Car {

    private long id ;
    private String model ;
    private String color;
    private int year;

    public Car(String color, String model, long id) {
        this.color = color;
        this.model = model;
        this.id = id;
    }

    public Car(long id, String model, String color, int year) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.year = year;

    }


    public Car() {}



}

