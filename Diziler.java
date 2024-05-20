class Main{
    public static void main(String[] args){
        // Diziler
        String[] sehirler1=new String[]{"Izmir","Istanbul","Antalya"};
        for(String x : sehirler1){
            System.out.println(x);
        }
        for(int i=0;i<3;i++){
            System.out.println(sehirler1[i]);
        }
    }
}