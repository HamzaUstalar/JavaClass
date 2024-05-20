public class VehicleManager implements KrediYöneticisi{  // Vehicle,Krediyi tutuyor. Yani inherit ediyor(Miras Alıyor)
    // Vehicle'ın babası=Kredi Yöntecisi.
    // Vehicle Manager = Araç Yöneticisi 
    public void calculate(){ // Overwrite yapıyoruz. Yani üstüne yazıyoruz.
        System.out.println("Vehicle Kredi Hesaplandi"); // Taşıt Kredisi.
    }
    
    }
    

