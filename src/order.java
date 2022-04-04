import java.util.ArrayList;

public class order {

    public int order_id;
    public String Company;
    public String registerDate;
    public static ArrayList<Medicine> MedicineList;
    public static ArrayList<Integer> QuantityList;

    // Constructor for get details:
    public order(int order_id) {
        this.order_id = order_id;
    }

    //Constructor for Patient order:
    public order(int order_id, String registerDate, ArrayList<Medicine> MedicineList) {
        this.order_id = order_id;
        this.registerDate = registerDate;
        this.MedicineList = MedicineList;
    }

    // Constructor for Company order:
    public order(int order_id, String Company, String registerDate,ArrayList<Medicine> MedicineList,ArrayList<Integer> QuantityList) {
        this.order_id = order_id;
        this.Company = Company;
        this.registerDate = registerDate;
        this.MedicineList = MedicineList;
        this.QuantityList= QuantityList;
    }


    public void addElement(Medicine addedMedicine){
        order.MedicineList.add(addedMedicine);
        System.out.println("Element has been Successfully added");
    }


    public void removeElement(Medicine removedMedicine){
        order.MedicineList.remove(removedMedicine);
        System.out.println("Element has been Successfully removed");
        }




   public void calcTotalCost() {
        double total =0;
        for (Medicine medicine: order.MedicineList){
            total =+ medicine.price;
        }
       System.out.println("\t The Order Total Cost:" + total);
   }








}
