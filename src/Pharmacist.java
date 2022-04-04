import java.util.ArrayList;

public class Pharmacist extends User{
    public int phar_id;
    public String phar_email;
    public String phar_pass;


    ArrayList<Medicine> medicineList = new ArrayList();
    ArrayList<ManufactureCompany> companyList = new ArrayList();

    public Pharmacist(int  phar_id,String name, int age, String contact_add,String phone, String phar_email, String phar_pass) {
        this.phar_id = phar_id;
        this.name = name;
        this.age = age;
        this.contact_add = contact_add;
        this.phone = phone;
        this.phar_email = phar_email;
        this.phar_pass = phar_pass;
    }

    public int getPhar_id() {return phar_id;}
    public void setPhar_id(int phar_id) {this.phar_id = phar_id;}
    public String getPhar_email() {return phar_email;}
    public void setPhar_email(String phar_email) {this.phar_email = phar_email;}
    public String getPhar_pass() {return phar_pass;}
    public void setPhar_pass(String phar_pass) {this.phar_pass = phar_pass;}





    public void addMedicine(Medicine medicine){
        medicineList.add(medicine);
        System.out.println("Medicine Has been added Successfully");
    }

    public void removeMedicine(String medicineName){
             for (Medicine medicine : medicineList) {
                 if (medicine.name == medicineName)  {
                     medicineList.remove(medicine);
                     System.out.println("Medicine Has been removed Successfully");}
                 else System.out.println("Medicine Not Existed !!");}
    }


    public void searchMedicine(String medicineName){
        for (Medicine medicine : medicineList) {
            if (medicine.name == medicineName)  {
                System.out.println("The Details of Medicine you Search about:");
                System.out.println("\t Medicine Id:"+medicine.med_id +"\n"+ "\t Medicine name:"+ medicine.name + "\n" +"\t Medicine Type:"+medicine.type +"\n"+
                        "\t Medicine Price:"+medicine.price +"\n"+ "\t Medicine ExpireDate:"+medicine.expireDate +"\n"+
                        "\t Medicine ManufactureCompany:"+medicine.manufactureCompany);
                }
            else System.out.println("Medicine Not Existed !!");}
    }


    public void addCompany(ManufactureCompany company){
        companyList.add(company);
        System.out.println("Company Has been added Successfully");

    }

    public void removeCompany(String companyName){
        for(ManufactureCompany company : companyList){
            if(company.name == companyName){
                companyList.remove(company);
                System.out.println("Company Has been removed Successfully");}
            else System.out.println("Company Not Existed!!");}
    }

    public void searchCompany(String companyName){
        for(ManufactureCompany company : companyList ) {
            if(company.name == companyName){
                System.out.println("The details of Company you Search about:");
                System.out.println("\t Company Id:" + company.comp_id +"\n"+"\t Company Name:" + company.name +"\n"+
                        "\t Company PaymentMethod:" + company.paymentMethod +"\n");}
            else System.out.println("Company Not Existed!!");
          }
        }



    public void MakeCompanyOrder(order CompanyOrder){
       order newOrder = new order(CompanyOrder.order_id,CompanyOrder.Company,
               CompanyOrder.registerDate,CompanyOrder.MedicineList,CompanyOrder.QuantityList);
        System.out.println("Order has Successfully recorder");
    }

    public void MakePatientOrder(order PatientOrder){
        order newOrder = new order(PatientOrder.order_id,PatientOrder.registerDate,PatientOrder.MedicineList);
        System.out.println("Order has Successfully recorder");
    }

    public void getOrderDetails(int Order_id ){
        order order = new order(Order_id);
        System.out.println("The Details of Order:");
        System.out.println("\t Order Id:"+order.order_id+"\n"+"\t Order Company:"+order.Company+"\n"+"\t Order Date:"+order.registerDate+"\n");


    }


}



