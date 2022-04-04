import java.util.ArrayList;

public class Medicine {
    public int med_id;
    public String name;
    public String type;
    public String manufactureCompany;
    public String expireDate;
    public float price;


    public Medicine(String name) {

        this.name = name;
    }

    public Medicine(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public Medicine(int id, String name, String type, String manufactureCompany, String expireDate, float price) {
        this.med_id = id;
        this.name = name;
        this.type = type;
        this.manufactureCompany = manufactureCompany;
        this.expireDate = expireDate;
        this.price = price;
    }



 }
