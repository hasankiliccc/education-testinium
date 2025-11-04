package model.inheritance;

public class SoftwareWorker extends  Worker{
    private  String prgrammingLanguage;

    public String getPrgrammingLanguage() {
        return prgrammingLanguage;
    }

    public void setPrgrammingLanguage(String prgrammingLanguage) {
        this.prgrammingLanguage = prgrammingLanguage;
    }
}
