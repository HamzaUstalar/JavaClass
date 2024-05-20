public class HepsiBuradaIC extends HepsiBuradaCustomer {
    // Türkçesi Bireysel Müşteri Bir Müşteridir.
    // IC = Individual Customer = Bireysel Müşteri
    // Individual Customer olduğu için doğal olarak Customer'dır. Bu yüzden IC'yi genişlettik. Yani extends ettik.
    // Buna inheritance denir.
    
    private String firstName; // kodda private varsa getter-setter durumu kullanılabilir.
    private String lastName;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    

}
