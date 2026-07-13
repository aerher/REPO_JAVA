import Gym.Recepcionista;
import Gym.SistemaAutenticacion;
import Gym.Cliente;
import Gym.Datafast;

public class AppGym {
    public static void main(String[] args) throws Exception {
        Cliente c = new Cliente();
        c.setNombre("Samuel");
        c.setApellido("Andres");
        Recepcionista r = new Recepcionista();
        r.setNombre("Lucero");
        r.setApellido("Velepucha");
        SistemaAutenticacion s = new SistemaAutenticacion();
        Datafast d = new Datafast();

        System.out.println("Nombre Cliente:" + c.getNombre() + " " + c.getApellido());
        System.out.println("Nombre Recepcionista:" + r.getNombre() + " " + r.getApellido());

        System.out.println("Verificar Pago");
        d.Encender();
        boolean pagoVerificado = d.ProcesarTransaccion(50);
        if(pagoVerificado){
            System.out.println("Verificando Credenciales");
            s.Encender();
            s.VerificarCredenciales("Platino");
            s.Apagar();
            System.out.println("Ingreso exitoso");
        } else {
            System.out.println("Pago no verificado, no ingresa al gimnasio");
        }
        d.Apagar();

    }
}
