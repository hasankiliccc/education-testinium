package model.constructor;

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



   // public Car() {}


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

