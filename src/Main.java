import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String Args[]){

        // System Date Base:
        Data_base();

        //scanner for integer values:
        Scanner scanner = new Scanner(System.in);

        // starting our program:
        System.out.println("\t\t****** WELCOME TO MY SMALL PHARMACY SYSTEM ********** ");
        System.out.println("------------------------------------------------------------------------");

        int runChoice;
        do
        {
            System.out.println(" You want to run system as:" + "\n" + "\t (1) Pharmacist" + "\n" + "\t (2) Patient" + "\n" + "\t (3) Exit" );
            System.out.print(">");
            runChoice = scanner.nextInt();
            if (runChoice >= 1 && runChoice <= 2)
            {
              switch (runChoice)
              {
                 // if choosing pharmacist:
                 case 1:
                 {
                  pharmacist();
                  break;
                 }
                  // if choosing patient:
                 case 2:
                 {
                       patient();
                        break;
                 }
              }
            }
            else if(runChoice==3)
           {
             System.out.println(" Thanks For Using Our Programing");
           }else
           System.out.println("Please, Enter Valid Number!!");
        }
        while (runChoice!=3);
    }
    public static void Data_base(){
     { Pharmacist Admin = new Pharmacist(1, "Admin", 33, "male", "Menouf-Egypt",
             "01282853120", "mohamed123@gmail.com", "96321");
      Medicine m1 = new Medicine(1, "OPLEX", "syrup", "pfizer", "05/24", 13.5f);
      Medicine m2 = new Medicine(2, "TUSSCAN", "syrup", "Johnson", "09/23", 15);
      Medicine m3 = new Medicine(3, "VELOSEF", "syrup", " Roche", "10/26", 27);
      Medicine m4 = new Medicine(4, "BRUFEN", "tab", "Novartis", "01/26", 31.5f);
      Medicine m5 = new Medicine(5, "CONGENITAL", "tab", "Merck & Co", "05/24", 19.75f);
      Medicine m6 = new Medicine(6, "HIBIOTIC", "tab", "Sanofi", "01/25", 75f);
      Medicine m7 = new Medicine(7, "MEGA-MOX", "tab", "AbbVie", "11/24", 75f);
      Medicine m8 = new Medicine(8, "E-MOX", "cap", "GlaxoSmithKline", "05/25", 32f);
      Medicine m9 = new Medicine(9, "OMEGA3", "cap", "Takeda", "10/24", 45f);
      Medicine m10 = new Medicine(10, "FUCIDEN", "cr", "Shanghai Pharmaceuticals Holding", "12/25", 30f);
      Admin.medicineList.add(m1);
      Admin.medicineList.add(m2);
      Admin.medicineList.add(m3);
      Admin.medicineList.add(m4);
      Admin.medicineList.add(m5);
      Admin.medicineList.add(m6);
      Admin.medicineList.add(m7);
      Admin.medicineList.add(m8);
      Admin.medicineList.add(m9);
      Admin.medicineList.add(m10);

      ManufactureCompany c1 = new ManufactureCompany(1, "pfizer", "DailyCash");
      ManufactureCompany c2 = new ManufactureCompany(2, "Johnson", "PerMonth");
      ManufactureCompany c3 = new ManufactureCompany(3, "Roche", "DailyCash");
      ManufactureCompany c4 = new ManufactureCompany(4, "Novartis", "PerMonth");
      ManufactureCompany c5 = new ManufactureCompany(5, "Merck & Co", "DailyCash");
      ManufactureCompany c6 = new ManufactureCompany(6, "Sanofi", "PerMonth");
      ManufactureCompany c7 = new ManufactureCompany(7, "AbbVie", "DailyCash");
      ManufactureCompany c8 = new ManufactureCompany(8, "GlaxoSmithKline", "PerMonth");
      ManufactureCompany c9 = new ManufactureCompany(9, "Takeda", "DailyCash");
      ManufactureCompany c10 = new ManufactureCompany(10, "Shanghai Pharmaceuticals Holding", "PerMonth");
      Admin.companyList.add(c1);
      Admin.companyList.add(c2);
      Admin.companyList.add(c3);
      Admin.companyList.add(c4);
      Admin.companyList.add(c5);
      Admin.companyList.add(c6);
      Admin.companyList.add(c7);
      Admin.companyList.add(c8);
      Admin.companyList.add(c9);
      Admin.companyList.add(c10);}}
    public static void pharmacist() {
     Scanner scanner = new Scanner(System.in);
     //scanner for string values:
     Scanner scanner1 = new Scanner(System.in);
     //scanner for float values:
     Scanner scanner2 = new Scanner(System.in);


     System.out.println("Enter your Login Details,please: ");
     System.out.println("\t Enter your Id: ");
     System.out.print(">");
     int userId = scanner.nextInt();
     System.out.println("\t Enter your Name: ");
     System.out.print(">");
     String userName = scanner1.nextLine();
     System.out.println("\t Enter your Age: ");
     System.out.print(">");
     int userAge = scanner.nextInt();
     System.out.println("\t Enter your Gender: ");
     System.out.print(">");
     String userGender = scanner1.nextLine();
     System.out.println("\t Enter your Contact Address: ");
     System.out.print(">");
     String userAddress = scanner1.nextLine();
     System.out.println("\t Enter your Phone: ");
     System.out.print(">");
     String userPhone = scanner1.nextLine();
     System.out.println("\t Enter your Email: ");
     System.out.print(">");
     String userEmail = scanner1.nextLine();
     System.out.println("\t Enter your Pass: ");
     System.out.print(">");
     String userPass = scanner1.nextLine();

     Pharmacist newPharmacist = new Pharmacist(userId, userName, userAge, userGender, userAddress, userPhone, userEmail, userPass);
     int takeChoice;

     do
     {
      System.out.println("As a Pharmacist what you want to do:" + "\n" + "\t 1-Add New Medicine" + "\n" + "\t 2-Remove Medicine"
              + "\n" + "\t 3-Search about Medicine" + "\n" + "\t 4-Add New Company" + "\n" + "\t 5- Remove Company"
              + "\n" + "\t 6-Search about Company" + "\n" + "\t 7-Make Company Order"
              + "\n" + "\t 8-Make Patient Order" + "\n" + "\t 9-show Order Details"+ "\n"+ "\t 10-Exit");
      System.out.print(">");
      takeChoice = scanner.nextInt();
      if (takeChoice >= 1 && takeChoice <= 9)
      {
       switch (takeChoice)
       {
        case 1:
        {
         // performing adding medicine:
         System.out.println("\t Enter Medicine Id: ");
         System.out.print(">");
         int medicineId = scanner.nextInt();
         System.out.println("\t Enter Medicine Name: ");
         System.out.print(">");
         String medicineName = scanner1.nextLine();
         System.out.println("\t Enter Medicine Type: ");
         System.out.print(">");
         String medicineType = scanner1.nextLine();
         System.out.println("\t Enter Medicine Company: ");
         System.out.print(">");
         String medicineCompany = scanner1.nextLine();
         System.out.println("\t Enter Medicine Expire Date: ");
         System.out.print(">");
         String medicineExpireDate = scanner1.nextLine();
         System.out.println("\t Enter Medicine Price: ");
         System.out.print(">");
         float medicinePrice = scanner2.nextFloat();

         Medicine newMedicine = new Medicine(medicineId, medicineName, medicineType, medicineCompany, medicineExpireDate, medicinePrice);
         newPharmacist.addMedicine(newMedicine);
         break;
        }
        case 2:
        {
         // performing removing medicine:
         System.out.println("\t Enter Medicine Name: ");
         System.out.print(">");
         String medicineName1 = scanner1.nextLine();
         newPharmacist.removeMedicine(medicineName1);
         break;
        }
        case 3:
        {
         // performing searching medicine:
         System.out.println("\t Enter Medicine Name: ");
         System.out.print(">");
         String medicineName2 = scanner1.nextLine();
         newPharmacist.searchMedicine(medicineName2);
         break;
        }
        case 4:
        {
         //performing adding company:
         System.out.println("\t Enter Medicine Id: ");
         System.out.print(">");
         int companyId = scanner.nextInt();
         System.out.println("\t Enter Medicine Name: ");
         System.out.print(">");
         String companyName = scanner1.nextLine();
         System.out.println("\t Enter Company Payment Method( Daily_Cash or Per_Month ): ");
         System.out.print(">");
         String companyPaymentMethod = scanner1.nextLine();

         ManufactureCompany newCompany = new ManufactureCompany(companyId, companyName, companyPaymentMethod);
         newPharmacist.addCompany(newCompany);
         break;
        }
        case 5:
        {
         //performing removing company:
         System.out.println("\t Enter Company Name: ");
         System.out.print(">");
         String companyName1 = scanner1.nextLine();
         newPharmacist.removeCompany(companyName1);
         break;
        }
        case 6:
        {
         // performing searching medicine:
         System.out.println("\t Enter Company Name: ");
         System.out.print(">");
         String companyName2 = scanner1.nextLine();
         newPharmacist.searchCompany(companyName2);
         break;
        }
        case 7:
        {
         // performing MakeCompanyOrder:
         System.out.println("\t Enter Order Id: ");
         System.out.print(">");
         int orderId = scanner.nextInt();
         System.out.println("\t Enter Order Company: ");
         System.out.print(">");
         String orderCompany = scanner1.nextLine();
         System.out.println("\t Enter Order Register Date: ");
         System.out.print(">");
         String orderRegisterDate = scanner1.nextLine();

         Scanner medicine = new Scanner(System.in);
         Scanner quantity = new Scanner(System.in);
         System.out.println("\t Enter Number of  Medicine List Items: ");
         System.out.print(">");
         int num = medicine.nextInt();
         ArrayList<Medicine> medicineList = new ArrayList<>();
         ArrayList<Integer> quantityList = new ArrayList<>();
         System.out.println("\t\t ************ Order Information ************");
         for (int i = 0; i < num; i++) {
          System.out.println(" Enter the name of Medicine" + (i + 1) + ":");
          System.out.print(">");
          Medicine nM = new Medicine(scanner1.nextLine());
          medicineList.add(nM);
          System.out.println(" \t Enter Order Quantity List" + (i + 1) + ":");
          System.out.print(">");
          quantityList.add(quantity.nextInt());
         }
         order newOrder = new order(orderId, orderCompany, orderRegisterDate, medicineList, quantityList);
         newPharmacist.MakeCompanyOrder(newOrder);
         break;
        }
        case 8:
        {
         // performing MakePatientOrder:
         System.out.println("\t Enter Order Id: ");
         System.out.print(">");
         int orderId1 = scanner.nextInt();
         System.out.println("\t Enter Order Register Date: ");
         System.out.print(">");
         String orderRegisterDate1 = scanner1.nextLine();

         Scanner medicine1 = new Scanner(System.in);
         System.out.println("\t Enter Number of  Medicine List Items: ");
         System.out.print(">");
         int num1 = scanner.nextInt();
         ArrayList<Medicine> medicineList1 = new ArrayList<>();
         for (int i = 0; i < num1; i++) {
          System.out.println("Enter the name of Medicine :" + (i + 1));
          System.out.print(">");
          Medicine nM = new Medicine(medicine1.nextLine());
          medicineList1.add(nM);
          System.out.println("");
         }
         order newOrder1 = new order(orderId1, orderRegisterDate1, medicineList1);
         newPharmacist.MakePatientOrder(newOrder1);
         break;
        }
        case 9:
        {
         //performing showOrderDetails:
         System.out.println("\t Enter The Order Id: ");
         System.out.print(">");
         int orderId2 = scanner.nextInt();
         newPharmacist.showOrderDetails(orderId2);
         break;
        }
       }
      }
      else if (takeChoice==10)
      {
       System.out.println(" ********* Thanks For Using Our Program *********");
      }else
       System.out.println("Please, Enter Valid Number!!");
     }while(takeChoice != 10);

    }
    public static void patient(){
     Scanner scanner = new Scanner(System.in);
     //scanner for string values:
     Scanner scanner1 = new Scanner(System.in);
     //scanner for float values:

     System.out.println("Enter your Login Details,please: ");
     System.out.println("\t Enter your Id: ");
     System.out.print(">");
     int patientId = scanner.nextInt();
     System.out.println("\t Enter your Name: ");
     System.out.print(">");
     String patientName = scanner1.nextLine();
     System.out.println("\t Enter your Age: ");
     System.out.print(">");
     int patientAge = scanner.nextInt();
     System.out.println("\t Enter your Gender: ");
     System.out.print(">");
     String patientGender = scanner1.nextLine();
     System.out.println("\t Enter your Contact Address: ");
     System.out.print(">");
     String patientAddress = scanner1.nextLine();
     System.out.println("\t Enter your Phone: ");
     System.out.print(">");
     String patientPhone = scanner1.nextLine();
     System.out.println("\t Enter your Payment Method(Cash or Debit_Card or Credit_Card): ");
     System.out.print(">");
     String patientPayment = scanner1.nextLine();

     Patient newPatient = new Patient(patientId, patientName,patientAge, patientGender, patientPhone, patientAddress, patientPayment);
     int takeChoice2;

     do
     {
      System.out.println("As a Patient what you want to do:" + "\n" + "\t 1-Request Prescription" + "\n" +
              "\t 2-Request Prescription Cost" + "\n" + "\t 3-Get Receipt" + "\n" + "\t 4-Exit" + "\n");
      takeChoice2 = scanner.nextInt();
      if (takeChoice2 >= 1 && takeChoice2 <= 3)
      {
       switch (takeChoice2)
       {

        //performing requesting Prescription:
        case 1:
        {
         System.out.println("\t Enter Number of  Medicine List Items: ");
         System.out.print(">");
         int num1 = scanner.nextInt();
         ArrayList<Medicine> medicineList2 = new ArrayList<>();
         for (int i = 0; i < num1; i++)
         {
          System.out.println("Enter the name of Medicine :" + (i + 1));
          System.out.print(">");
          Medicine nM1 = new Medicine(scanner1.nextLine());
          medicineList2.add(nM1);
         }
         newPatient.requestPrescription(medicineList2);
         break;
        }
        //performing Requesting Prescription Cost:
        case 2:
        {

         System.out.println("\t Enter Number of  Medicine List Items: ");
         System.out.print(">");
         int num2 = scanner.nextInt();
         ArrayList<Medicine> medicineList3 = new ArrayList<>();
         for (int i = 0; i < num2; i++) {
          System.out.println("Enter the name of Medicine :" + (i + 1));
          System.out.print(">");
          Medicine nM1 = new Medicine(scanner1.nextLine());
          medicineList3.add(nM1);
         }
         newPatient.requestPrescriptionCost(medicineList3);
         break;
        }
        //performing Getting Receipt:
        case 3:
        {

         System.out.println("\t Enter Number of  Medicine List Items: ");
         System.out.print(">");
         int num3 = scanner.nextInt();
         ArrayList<Medicine> medicineList4 = new ArrayList<>();
         for (int i = 0; i < num3; i++) {
          System.out.println("Enter the name of Medicine :" + (i + 1));
          System.out.print(">");
          Medicine nM1 = new Medicine(scanner1.nextLine());
          medicineList4.add(nM1);
         }
         newPatient.getReceipt(medicineList4);
         break;
        }
       }
      }
      else if(takeChoice2==4)
      {
       System.out.println("******** I wish You To Be Good ********* !!");
      }
      else
       System.out.println("Please, Enter Valid Number!!");
     }while(takeChoice2!=4);
    }

}
