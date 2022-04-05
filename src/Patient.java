import java.util.ArrayList;

public class Patient extends User{
    public int patient_id;
    String Payment_method;



    public Patient( int patient_id,String name,int age,String gender, String phone,String contact_add,String payment_method) {
        this.patient_id = patient_id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.contact_add = contact_add;
        this.Payment_method = payment_method;
    }


    public int getPatient_id() {return patient_id;}
    public void setPatient_id(int patient_id) {this.patient_id = patient_id;}
    public String getPatient_phone() {return phone;}
    public void setPatient_phone(String patient_phone) {this.phone = patient_phone;}


    public ArrayList<Medicine> requestPrescription(ArrayList<Medicine> Prescription){
        ArrayList <Medicine> order_list = new ArrayList();
        for(Medicine medicine :Prescription){order_list.add(medicine);}
        System.out.println("*********** Prescription Has Successfully Demanded **********");
        return order_list;
    }

    public void requestPrescriptionCost(ArrayList<Medicine> Prescription){
        double cost = 0;
        for(Medicine medicine: Prescription){
            cost += medicine.price;
        }
        System.out.println("\t Your Order Total Cost:" + cost);
    }


    public void getReceipt(ArrayList<Medicine> Prescription){
        System.out.println("******* The Details of Your Order:");
        System.out.println("\t Your id: "+patient_id+"\n"+"\t Your Name: "+ name);
        System.out.println("\t Items List:");
        for(Medicine medicine: Prescription){
            System.out.println("\t\t"+ medicine.name+"-----"+ medicine.price);
        }
        requestPrescriptionCost(Prescription);
    }

}
