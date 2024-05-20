class Deneme{
    public static void main(String[] args){
        int[] sayilar=new int[]{1,2,3,4};

        Product product1=new Product();
        product1.setName("Hamza"); // Set-Get Denemesi.
        System.out.println(product1.getname());

        Product[] urunler=new Product[]{product1};

        // Kredi Yöntecisi türünde bir diziyi new'ledik. yoksa interface new'lenmez.
        KrediYöneticisi[] krediler=new KrediYöneticisi[2]; // 2 elemanlı krediler adında dizi oluşturduk.
        krediler[0]=new MortgageManager(); // krediler adlı dizinin 0.elemanı Mortgage Manager.
        krediler[1]=new VehicleManager();  // krediler adlı dizinin 1.elemanı Vehicle Manager.

        // 12-14. satır'da "Classlar,interfaceler,diziler,abstrack sınıflar" bunların hepsi referans tip olduğu için birbirinin referansını tutabilir.
        for(int i=0;i<krediler.length;i++){ // kredilerin içindeki uzunluğa göre indeks belirle.
            krediler[i].calculate(); // Bana hangi kredi çıkar? Hesaplar mısın?
            //SOLID Prensipleri
        }

        
    }
}