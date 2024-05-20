class OOP{
    public static void main(String[] args){
        int[] dizi=new int[]{1,2,3,4,5,6,0};
        int aranan=5;
        boolean cevap=false;
        for(int a : dizi ){
            if(a==aranan){
                cevap=true;
                break;
            }
        }
        String mesaj=" ";
        if(cevap==true){
            mesaj="Aranan Sayi Dizinin Icerisindedir.";
            mesajVer(mesaj);
        }else {
            mesaj="Aranan Sayi Dizinin Icerisinde Yok.";
            mesajVer(mesaj);
        }
    }
    public static void mesajVer(String x){
        System.out.println(x);
    }
} 