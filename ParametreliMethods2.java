public class ParametreliMethods2 { // Class'ı tanımlarken Pascal Casing yaptım. Yani başlangıç ve ortası büyük olucak şekilde.
    public static void main(String[] args){
        String mesaj="Bugün Hava Çok güzel";
        String yeniMesaj = mesaj.substring(0,2); // 0. indeksten 2. indekse kadarını yeniMesaj'a kaydet.(2 dahil değil.)
        System.out.println(yeniMesaj);
        String sehir=sehirVer(); // Burada herhangi bir sorun çıkmadı. Çünkü String sehir'i string döndüren(return eden) bir fonksiyona atadım.
        // Döndürme (return etme) işlemi olmasaydı yani direkt "void" olsaydı o zaman sehir'e eşitleyemezdik.

        int sonuc = topla2(10,87);

        yaz("Toplama İşleminin Sonucu: "+sonuc);

        int variableToplami=topla3(10,20,30,300); // Camel Casing kullandim.
        yaz("Variable Arguments toplama sonucumuz: "+ variableToplami);
    }
    // Bu fonksiyonlar ileride yaşanıcak senaryolara örnek niteliğinde yazılmıştır.
    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static int topla1(){ // int türünde bir değer döndür. Ve bu değeri bir atama ile atayabilelim.
        return 6;
    }
    public static String sehirVer(){ // Genelde emir kipi kullanılır. Daha iyi bir şekilde anlaşılsın diye.
        return "Ankara";
    }
    public static int topla2(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public static void yaz(String yazilicak){
        System.out.println(yazilicak);
    }
    // Variable Arguments nedir? Öğrenelim.
    public static int topla3(int... sayilar){ // Burada int... sayilar = sayilari bir array'a çeviriyor yani sayilari diziye çeviriyor.
        // Yukarıdaki fonksiyon Array'a yani diziye çevirdiği için foreach yapabildim.
        int toplam=0;
        for (int i : sayilar) {
            toplam+=i; // toplam=toplam+i , her turda gelen sayıyı toplama ekle.
        }
        return toplam;
    }
    
    
    
}
