public class Customer {
    private int customerId;
    private string name;
    private string email;
    private int phoneNumber;

    public Customer() {}

    public Customer(int customerId,String name,String email,int phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    //getters and setters

    public int getCustomerId() {return customerId;}
    public void setCustomerId(int customerId) {this.customerId = customerId;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    Public String getEmail() {return email;}
    Public void setEmail(String email) {this.email = email;}

    public int getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(int phoneNumber) {this.phoneNumber = phoneNumber;}

    @override
    public String toString(){
        return "CustomerID: " +customerId +",Name: "+name+",Email: "+email+",PhoneNumber: "+phoneNumber;
    }

}
