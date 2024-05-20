public class HepsiBuradaClass {
    // Pascal case = Classların isimlendirme biçimi veya kuralı. Classların ilk harfi büyük olur.
    // classlar bir şablondur. Atama yaptıysan ona biçimini şimdi verme ilerde ver.
    // String,double,int gibi veri tipleri field adı verilir. Yani class'ın name field'ı veya class'ın unitPrice field'ı denir.
    private String name;
    private double unitPrice; // Birim fiyatı , unitPrice yazılırken camelCase kullanılmıştır. Yani boşluk yerine büyük harfle yazılıp boşluk gibi olmuştur.
    private double discount; // Indirim oranı
    private String imageUrl; // Resmin URL'si
    private int unitsInStock; // Birim Stok fiyatı
    
    public String getName() { // okumak için
        return name;
    }
    public void setName(String name) { // yazmak için,değiştirmek için
        this.name = name;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) { // İndirim oranına ekstra 5 eklemek istersek buradan oynama yapabiliriz.
        discount+=5;
        this.discount = discount;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public int getUnitsInStock() {
        return unitsInStock;
    }
    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    

    
}
