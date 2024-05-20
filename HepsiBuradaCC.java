public class HepsiBuradaCC extends HepsiBuradaCustomer{
    // CC = Corporate Customer = Kurumsal Müşteri
    private String companyName; // company name = şirket adı
    private String taxNumber; // tax number = vergi numarası
    
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getTaxNumber() {
        return taxNumber;
    }
    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }
    
}
