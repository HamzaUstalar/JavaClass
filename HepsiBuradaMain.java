public class HepsiBuradaMain {
    public static void main(String[] args) {
        // product = ürün
        HepsiBuradaClass product1 = new HepsiBuradaClass(); // Class Tanımlama
        product1.setName("İndirimli NIKE Kampanyasi"); 
        product1.setUnitPrice(5000); // Birim fiyatı
        product1.setDiscount(10); // İndirim oranı
        product1.setUnitsInStock(20); // Stoktaki birimler
        product1.setImageUrl("nike.png"); // Görüntünün url'i

        HepsiBuradaClass product2 = new HepsiBuradaClass(); // Yeniden class tanımladım.
        product2.setName("İndirimli KITAP Kampanyasi");
        product2.setUnitPrice(300);
        product2.setUnitsInStock(200);
        product2.setDiscount(20);
        product2.setImageUrl("kitap.png");

        HepsiBuradaClass product3 = new HepsiBuradaClass(); // 3.class'ımızı tanımladık.
        product3.setName("İndirimli KALEM Kampanyasi");
        product3.setDiscount(30);
        product3.setUnitPrice(200);
        product3.setUnitsInStock(1000);
        product3.setImageUrl("kalem.png");

        System.out.println("<ul>"); // html olarak kaydedince ul ve li'lerin hiçbiri gözükmedi.
        // Class türünde array açtım ve içini class türünde doldurmak zorundayım.
        HepsiBuradaClass[] products = {product1,product2,product3}; 
        for (HepsiBuradaClass x : products) {
            System.out.println("<li>" + x.getDiscount() + "</li>"); // Burada ekstra 5 eklenmiş halini gördük.
        }
        System.out.println("</ul>");    
        
        HepsiBuradaIC icustomer = new HepsiBuradaIC(); // icustomer adında HepsiBuradaIC class'ı oluşturduk.

        icustomer.setCustomerNumber("1281010"); // inheritance sayesinde IC class'ı boş olmasına rağmen yazabildik.
        // Buradan sonra referans tutma ile OOP'yi daha net bir şekilde oturtucaz.
        icustomer.setId(1);
        
        icustomer.setFirstName("Hamza");
        icustomer.setLastName("Ustalar");

        
        HepsiBuradaCC corporateCustomer=new HepsiBuradaCC(); // Class oluşturduk.
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("FisionCode");
        corporateCustomer.setTaxNumber("1231231");
        corporateCustomer.setPhoneNumber("053274831");
        corporateCustomer.setCustomerNumber("1231543531");

        // Burada hata var 18/05/2024
        HepsiBuradaCustomer[] customers={HepsiBuradaIC,HepsiBuradaCC}; 
        
        for (HepsiBuradaCustomer hepsiBuradaCustomer : customers) {
            System.out.println(hepsiBuradaCustomer.getCustomerNumber());
        }

        
    }
}
