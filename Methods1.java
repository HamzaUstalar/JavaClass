public class Methods1 {
    public static void main(String[] args){
        sayiBulmaca();
    }
    
    public static void sayiBulmaca(){ // Fonksiyon isimleri Camel Casing yazılır. Küçük başlar boşluk olan yer büyük yazılır
                                      // Class isimleri Pascal Casing yazılır.
        int[] sayilar=new int[]{1,2,3,4,5,6,7};
        int aranacak=6;
        boolean a=false; // a' burada atama yapmadan kodu çalıştıramayız.
        for (int i : sayilar) { // foreach kullandım ve hızlı bir şekilde bu kodu yazdı.
            if(i==aranacak){
                a=true;
                break;
            }
            else{
                a=false; // buradaki else biraz fazlalık gibi oldu ama daha net görmek adına yazmış bulundum.
            }
        }
        String mesaj=" "; // mesajı if'in üstünde tanımlayarak daha okunaklı hale getirdim.
        if(a){ // if(true) => yani if'in içine gir.
            mesaj=aranacak + " Sayisi dizinin içinde bulundu.";
            mesajVer(aranacak + " Sayisi dizinin içinde bulundu.");
            // System.out.println(aranacak + " Sayisi dizinin içinde bulundu.");
        }
        else{
            mesaj=aranacak +" Sayisi dizinin içinde bulunamadi";
            mesajVer(mesaj);
            // System.out.println(aranacak +" Sayisi dizinin içinde bulunamadi");
        }
    }

    public static void mesajVer(String mesaj){ // Yine fonksiyon kullandığım için camel casing kullandım.
        System.out.println(mesaj);
    }
    
    
}
