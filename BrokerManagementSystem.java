public class Person {
    private String id;
    private String name;
    private String contact;

    public Person(String id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }
    // Getter functions
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getContact() {
        return contact;
    }
    //setter functions
    public void setName(String name) {
        this.name = name;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    //Method to display information
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Contact: " + contact);
    }
}
public class Broker extends Person {
    public Broker(String id, String name, String contact) {
        super(id, name, contact);
    }
    public void displayInfo() {
        System.out.println("Broker ID: " + getId());
        System.out.println("Broker Name: " + getName());
        System.out.println("Broker Contact: " + getContact());
    }
}
public class client extends Person{
    public client(String id,Strong name,String contact){
        super(id,name,contact);
    }
    public void displayInfo(){
        System.out.println("Client ID: "+getId());
        System.out.println("Client Name: "+getName());
        System.out.println("client Contact: "+getContact());
    }
}
public class Property{
    private String id;
    private String name;
    private String location;
    private double price;

    public Property(String id,String name,String location,double price) {
        this.id = id;
        this.name =name;
        this.location=location;
        this.price=price;
    }
    //Getter functions
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }
    public double getPrice(){
        return price;
    }
    //Setter functions
    public void setName(String name){
        this.name=name;
    }
    public void setLocation(String location){
        this.location=location;
    }
    public void setPrice(double price){
        this.price=price;
    }
    //Method to display information
    public void displayInfo(){
        System.out.println("Property ID: "+id);
        System.out.println("Property Name;"+name);
        System.out.println("Property Location:"+location);
        System.out.println("Property Price:"+price);
    }
}
public class Dealing{
    private String id;
    private Broker broker;
    private Client buyer;
    private Client seller;
    private Property property;
    private double brokerCharge;
    private double totalAmount;
public Dealing(String id,Broker broker,Client buyer,Client seller,Property property,double brokerCharge,double totalAmount){
    this.id=id;
    this.broker=broker;
    this.buyer=buyer;
    this.seller=seller;
    this.property=property;
    this.brokerCharge=brokerCharge;
    this.totalAmount=totalAmount;
//getter functions
public String getId(){
    return id;
}
public Broker getBroker(){
    return Broker;
}
public Client getBuyer(){
    return buyer;
}
public Client getSeller(){
    return seller;
}
public Propert getProperty(){
    return property;
}
public double getBrokerCharge(){
    return brokerCharge;
}
public double gettotalAmount(){
    return totalAmount;
}
// Method to Display information
public void displayInfo(){
    System.out.println("Dealing ID: "+id);
    buyer.displayInfo();
    seller.displayInfo(); 
    property.displayInfo();
    System.out.println("Broker Charge: "+brokerCharge);
    System.out.println("Total Amount: "+totalAmount);
    }
}
class Main{
    public static void main(String[] args) {
        
    }
}
