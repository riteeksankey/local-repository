import javax.sql.rowset.spi.SyncResolver;

class product{
     int id;
    String name;
     int price;
   void setproductdetails(int id,String name,int price){
    this.id=id;
    this.name=name;
    this.price=price;
    System.out.println("data written in product object");

   }
   void getproductdetails(){
    System.out.println("--------product id is:\t"+id+"---------");
    System.out.println("product name is:\t"+name);
    System.out.println("product price is:\t"+price);
   }
   void setid(int id){
    this.id=id;// LHS=object, RHS=method
   }
   int getid(){
    return id;
   }
 }
 class mobile extends product{   
    String sdcard;
    String os;
    int ram;
    void setproductdetails(int id,String name,int price, String sdcard,String os,int ram){
        this.id=id;
        this.name=name;
        this.price=price;
        this.sdcard=sdcard;
        this.os=os;
        this.ram=ram;
        System.out.println("data written in product object");
    
 }
 void getproductdetails(){
    System.out.println("--------product id is:\t"+id+"---------");
    System.out.println("product name is:\t"+name);
    System.out.println("product price is:\t"+price);
    System.out.println("product SD card is:\t"+sdcard);
    System.out.println("product OS is:\t"+os);
    System.out.println("product RAM is:\t"+ram);


 }
}
 public class inheritance{
    public static void main(String[] args) {
        product product1=new product();
        product1.setproductdetails(23, "nike", 3999);
        product1.getproductdetails();

        product product2=new product();
       // product2.id=42;
       product2.setid(43);

        product2.name="Adidas";
        product2.price=2343;
        product2.getproductdetails();



        mobile phone=new mobile();
        phone.setproductdetails(65, "iphone", 80000, "logics", "IOS", 4);
        phone.getproductdetails();


        
        
    }
 }