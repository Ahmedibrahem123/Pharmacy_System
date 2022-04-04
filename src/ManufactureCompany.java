import java.util.Vector;

public class ManufactureCompany {
     public int comp_id;
     public String name;
     String paymentMethod;
     ManufactureCompany m1 = new ManufactureCompany(123,"pfizer","dialyCash");
     ManufactureCompany[] companyList = {m1};



     public ManufactureCompany(String name) {
          this.name = name;
     }

     public ManufactureCompany(int comp_id, String name, String paymentMethod) {
          this.comp_id = comp_id;
          this.name = name;
          this.paymentMethod = paymentMethod;
     }

     public void getCompanyDetails(String CompanyName){
          ManufactureCompany company = new ManufactureCompany(CompanyName);
          System.out.println("Company Id:"+company.comp_id+"\n"+"Company Name:"+company.name+"\n"+"Company PaymentMethod:"+company.paymentMethod+"\n");
     }



}
