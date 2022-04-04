import java.util.ArrayList;

public class Patient extends User{
    public int patient_id;
    String Payment_method;



    public Patient( int patient_id,String name,String gender, String phone,String contact_add,String payment_method) {
        this.patient_id = patient_id;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.contact_add = contact_add;
        this.Payment_method = payment_method;
    }


    public int getPatient_id() {return patient_id;}
    public void setPatient_id(int patient_id) {this.patient_id = patient_id;}
    public String getPatient_phone() {return phone;}
    public void setPatient_phone(String patient_phone) {this.phone = patient_phone;}


    public void requestPrescription(ArrayList<Medicine> Prescription){
        ArrayList <Medicine> order_list = new ArrayList();
        for(Medicine medicine :Prescription){order_list.add(medicine);}
        System.out.println("Prescription Has Successfully Demanded");
    }


    public void prescriptionCost(){

    }

}
