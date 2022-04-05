import java.util.Vector;

public class ManufactureCompany {
     public int comp_id;
     public String name;
     String paymentMethod;


     public ManufactureCompany(String name) {
          this.name = name;
     }


     public ManufactureCompany(int comp_id, String name, String paymentMethod) {
          this.comp_id = comp_id;
          this.name = name;
          this.paymentMethod = paymentMethod;
     }



     public int getComp_id() {return comp_id;}
     public void setComp_id(int comp_id) {this.comp_id = comp_id;}
     public String getName() {return name;}
     public void setName(String name) {this.name = name;}
     public String getPaymentMethod() {return paymentMethod;}
     public void setPaymentMethod(String paymentMethod) {this.paymentMethod = paymentMethod;}


}
