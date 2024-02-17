package ImplementaciónDeUnSistemaDeEnvío;

public class EnvioMaritimo extends Envio {

    public EnvioMaritimo(Servicio servicio) {

        super(servicio);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando el paquete en canoa");
        servicio.realizarEnvio();
    }


}
