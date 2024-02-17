package ImplementaciónDeUnSistemaDeEnvío;

public abstract class Envio {

    protected Servicio servicio;

    public Envio(Servicio servicio) {
        this.servicio = servicio;
    }

    public abstract void enviar(); //Método abstracto que se utilizará por las subclases
}
