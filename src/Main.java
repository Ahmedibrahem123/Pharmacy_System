import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

public class Main {

    public static void main(String Args[]){
       Pharmacist phar_1 = new Pharmacist(123,"mohamed",35,"Egypt","01282853120",
               "mohamed0013@gmail.com","159");
        Medicine m1 = new Medicine(1,"oplex","syurp","pfizer","05/24",13.5f);
       phar_1.addMedicine(m1);
       phar_1.removeMedicine("tusscan");
       phar_1.searchMedicine("oplex");

    }
}
