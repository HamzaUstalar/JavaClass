/*public class KrediYöneticisi {
    public void calculate(){
        System.out.println("Kredi Hesaplandi");
    }
    public void add(){
        System.out.println("Kredi Eklendi.");
    }
}*/

// class kullanırsak ve inherit yaparken "extends" kullanırdık.
// fakat interface kullanınca extends yerine "implements" kullanırız.
// İnterface'i new'leyemeyiz yani tek başına anlamı olmadığı için.
interface KrediYöneticisi{ 
    void calculate(); // method signature = metod imzası
    void add();
}
