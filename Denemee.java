class Denemee{
    public static void main(String[] args){
        // Interface hakkında bazı bilgiler.
        // Sonradan fazladan yer açmak istersek yaşanıcak senaryolar.
        String[] dizi = new String[]{"Merhaba","Dünya"};
        dizi = new String[3]; // String[] içerisi index mantığı ile çalışmaz bu yüzden ona göre hsaplamanı yap.
        dizi[2]="Izmir";
        System.out.println(dizi[0]); // heap alanında temsil ettiği yerde 0.indeks boş(null)tur.
        
        // Dizileri birbirine eşitlemeye çalışırsak yaşanıcak senaryorlar.
        String[] isimler1=new String[]{"Hamza","Susan","Jack"};
        String[] isimler2=new String[]{"Beta","Teta","Mark"};
        isimler1=isimler2; // Burada heap alanında isimler1 artık isimler2'yi temsil etmektedir.
        System.out.println(isimler1[0]);
        






    }
}