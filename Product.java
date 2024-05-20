class Product{
    private String name;
    private String description; // Açıklama
    private double price; // price=satış
    // private sadece bu classın içinde kullanıcağımız anlamına gelmektedir.
    // getter-setter ile bunu kullanılabilir hale getiricez.
    
    public String getname(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    
    
}