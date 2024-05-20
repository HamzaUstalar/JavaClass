public class RCDdortislem {
    public int Topla(int sayi1 , int sayi2){
        return sayi1+sayi2;
    }
    public int Cikar(int sayi1 , int sayi2){
        return sayi1-sayi2;
    }
    public int Carp(int sayi1, int sayi2){
        return sayi1*sayi2;
    }
    public int Bol(int sayi1, int sayi2){ // Normalde hata yönetimi ile sayi2'nin 0 almamasını sağlamamız lazım fakat ilerde gelicez.
        return sayi1/sayi2;

    }
}
