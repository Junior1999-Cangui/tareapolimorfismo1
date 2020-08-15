package tareapolimorfismo1;
class Sensor {
     public void MedirValor(){
         System.out.println(" medida");
     }
}
class SensorPotencia extends Sensor {
    public void MedirValor(){
        System.out.println("[W],[HP],[CV]");
    }
}

class SensorTemperatura extends Sensor {
    public void MedirValor(){
        System.out.println("[°C],[°K],[°R]");
    }
}

class SensorRpm extends Sensor {
    public void MedirValor(){
        System.out.println("[rev/min]");
    }
}

class SensorVoltaje extends Sensor {
    public void MedirValor(){
        System.out.println("[V]");
    }
}
/**
 *
 * @author Junior Steven Cangui Toapanta
 */
public class TareaPolimorfismo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\tUniversidad de las Fuerzas Armadas ESPE ");
        System.out.println("\t\tSede Latacunga");
        System.out.println("Estudiante: Junior Cangui");
        System.out.println("Carrera: Ingenieria Automotriz");
        System.out.println("Asignatura: Programacion [7450]");
        System.out.println("Tema: POLIMORFISMO\n");
        
        Sensor medida1= new SensorPotencia();
        Sensor medida2=new SensorTemperatura();
        Sensor medida3= new SensorRpm();
        Sensor medida4=new SensorVoltaje();
      
        System.out.println("Unidades del sensor de potencia: Potencia");
        medida1.MedirValor();
        
        System.out.println("Unidades del sensor de Temperatura: Temperatura");
        medida2.MedirValor();
        
        System.out.println("Unidades del sensor de RPM: RPM");
        medida3.MedirValor();
        
        System.out.println("Unidades del sensor de Voltaje: Voltaje ");
        medida4.MedirValor();
    }
    
}