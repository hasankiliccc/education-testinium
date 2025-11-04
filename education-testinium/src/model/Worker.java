package model;

public class Worker {

    private String ad ;
    private int department;
    private int id ;

    public Worker(String ad, int department, int id) {
        this.ad = ad;
        this.department = department;
        this.id = id;
    }

    public Worker() {
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
