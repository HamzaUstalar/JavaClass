public class StackVeHeapMantigi {
    public static void main(String[] args){
        // New ile referans alarak Stack ve Heap alanı açtım.
        // Referans tipleri ==> Classlar , Interfaceler , Diziler , Listeler , Enumlar , Nesneler(obj) 
        SVHMclass müşteriCustomer1 = new SVHMclass(); // HN1(Açılan heap numarası)=101
        SVHMclass müşteriCustomer2 = new SVHMclass(); // HN2(Açılan heap numarası)=102
        müşteriCustomer1 = müşteriCustomer2; // Burada HN1 = 102 oldu.
        müşteriCustomer1.Add(); // HN1 Garbage Collector'a gitti. Yani çöp kutusuna. Artık müşteriCustomer1'in heap numarası 102 dir.
        müşteriCustomer1.Remove();

        // Value = Değer tiplerinin stack'te tutulması
        int sayi1=10; // SN1(Açılan stack numarası)=20
        int sayi2=30; // SN2(Açılan stack numarası)=21
        sayi2=sayi1;  // Stack'ta direkt değerler değişti stack numarası değişmedi. Değer tipi olduğu için Heap alanında bir değişiklik yok.
        sayi1=30; // Buradaki değişiklik bir anlam ifade etmedi çünkü direkt stack alanında değişiklik meydana geldi.
        System.out.println(sayi2); // Ekrana verilen değer = 10'dur.

        // Array ile aynı işlemleri yapalım.
        int[] sayilar1 = new int[]{1,2,3}; // heap1=101 , stack1=101
        int[] sayilar2 = new int[]{8,9,10};// heap2=102 , stack2=102
        sayilar2=sayilar1; // stack1=101 , stack2=101 , heap1=101 , heap2=garbage collector(silindi)   
        sayilar1[0]=30; // stackler ve heapler değişti.
        System.out.println(sayilar2[0]); // 101. heap alanındaki 0. indeksi sordu. Bu durumda sonuç 30'dur.


    }
    
}
