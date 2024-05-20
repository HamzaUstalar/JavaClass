public class BankaHesaplama {
    public static void main(String[] args){
        KrediYöneticisi krediYöneticisi=new KrediYöneticisi();
        krediYöneticisi.add();
        krediYöneticisi.calculate();

        MortgageManager mortgageManager=new MortgageManager(); // extends kullandığımız için mortgageManager'da add ve calculate kullabiliyoruz.
        mortgageManager.add();
        mortgageManager.calculate();
        
    }
}
