import Zoologico.Datafast;
import Zoologico.Sistema;
import Zoologico.Trabajador;
import Zoologico.Visitante;

public class AppZoologico {
    public static void main(String[] args) throws Exception {
            Visitante v = new Visitante();
            v.setNombre("Samuel");
            v.setApellido("Andres");
        
            Trabajador t = new Trabajador();
            t.setNombre("Lucero");
            t.setApellido("Velepucha");
        
            Datafast d = new Datafast();
            Sistema s = new Sistema();
        
            System.out.println("Nombre Visitante:" + v.getNombre() + " " + v.getApellido());
            System.out.println("Nombre Trabajador:" + t.getNombre() + " " + t.getApellido());
        
            double Ticket = 20;
        
            System.out.println("Verificar Pago");
            boolean pagoVerificado = d.VerificarPago();
            if(pagoVerificado){
                d.ProcesarPago(Ticket);
                System.out.println("Imprimiendo Ticket");
                s.encender();
                s.imprimir(" Pase de Adulto, Valor:" + Ticket + "$");
                s.apagar();                System.out.println("Ingreso exitoso");
        } else {
            System.out.println("Pago no verificado, no ingresa al zoologico");
        }
    }
}
