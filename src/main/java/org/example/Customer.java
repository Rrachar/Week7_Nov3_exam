package org.example;

public class Customer {
    private int customerId;
    private String name;
    private String email;
    private int phoneNumber;

    public Customer() {}

    public Customer(String name,int customerId,String email,int phoneNumber) {
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

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public int getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(int phoneNumber) {this.phoneNumber = phoneNumber;}


    public String toString(){
        return "CustomerID: " +customerId +",Name: "+name+",Email: "+email+",PhoneNumber: "+phoneNumber;
    }

}
