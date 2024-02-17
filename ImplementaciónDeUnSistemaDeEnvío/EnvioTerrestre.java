package ImplementaciónDeUnSistemaDeEnvío;

public class EnvioTerrestre extends Envio {
    public EnvioTerrestre(Servicio servicio) {
        super(servicio);

    }

    @Override
    public void enviar() {
        System.out.println("Enviando el paquete por vía terrestre");
        servicio.realizarEnvio();
    }
}
