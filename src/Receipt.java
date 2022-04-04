import java.util.Date;

public class Receipt {

    public int receipt_id;
    public int patient_id;
    public String patientName;
    public String shippedDate;

    public Receipt(int receipt_id, int patient_id, String patientName, String shippedDate) {
        this.receipt_id = receipt_id;
        this.patient_id = patient_id;
        this.patientName = patientName;
        this.shippedDate = shippedDate;
    }



}
