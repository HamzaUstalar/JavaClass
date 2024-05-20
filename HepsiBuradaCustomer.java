public class HepsiBuradaCustomer {
    private int id;
    private String customerNumber; // Camel Case kullandık.
    private String phoneNumber; // üzerinde matematiksel işlem yapmadığımız şeyler String'tir.
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCustomerNumber() {
        return customerNumber;
    }
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    

    
}
