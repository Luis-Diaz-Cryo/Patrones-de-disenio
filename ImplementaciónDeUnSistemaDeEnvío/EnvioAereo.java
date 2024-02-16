package ImplementaciónDeUnSistemaDeEnvío;

public class EnvioAereo extends Envio{

    public EnvioAereo(Servicio servicio){
        super(servicio);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando el paquete en avión");
        servicio.realizarEnvio();
    }


}
