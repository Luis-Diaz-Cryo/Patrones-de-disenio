package ImplementaciónDeUnSistemaDeEnvío;

public class Main {
    public static void main(String[] args) {
        Servicio servicioEstandar = new ServicioEstandar();
        Servicio servicioExpress = new ServicioExpress();

        Envio envioTerrestre = new EnvioTerrestre(servicioEstandar);
        Envio envioAereo = new EnvioAereo(servicioExpress);

        envioTerrestre.enviar();
        envioAereo.enviar();

    }
}
