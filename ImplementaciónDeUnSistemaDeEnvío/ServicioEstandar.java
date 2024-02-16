package ImplementaciónDeUnSistemaDeEnvío;

public class ServicioEstandar implements Servicio {


    @Override
    public void realizarEnvio() {
        System.out.println("Realizando servicio de entrega normal");
    }
}
