class Test {
    public static void main(String[] args) {
        //DRY - Do not Repeat Yourself
        // Clean kod için return ifadesini kullanmayi unutma!!
        // Bir fonksiyon sadece bir işi yapabilir.
        // return ifadesini kullanicaksak public static void yerinde public static int kullan!
        mesajver("Hamza");
        mesajver("Susan");
        mesajver("Keke");
        System.out.println(yüzdehesapla(10, 30));; // fonksiyonun içinden farklı bir fonkisyon çağırdık.
        System.out.println(topla(10,20));
    }
    public static void mesajver(String isim){
        System.out.println("Merhaba "+isim);
    }
    public static void hesapla(String a){
        System.out.println(a + " Hesaplandi");
    }
    public static int topla(int sayi1, int sayi2){
        int toplama=sayi1+sayi2;
        hesapla("Toplama");
        return toplama;
    }
    public static double yüzdehesapla(int sayi1, int sayi2){
        int toplam=topla(sayi1, sayi2);
        double sonuc=(toplam*10)/100;
        return sonuc;
    }
    public static double kredihesapla(double krediMiktari){
    }
}