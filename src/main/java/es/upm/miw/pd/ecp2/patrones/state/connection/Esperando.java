package es.upm.miw.pd.ecp2.patrones.state.connection;


public class Esperando extends Fase{

	@Override
	public void abrir(Conexion conexion) {
		throw new UnsupportedOperationException("AcciÃ³n no permitida... ");	
	}

	@Override
	public void cerrar(Conexion conexion) {
		throw new UnsupportedOperationException("AcciÃ³n no permitida... ");
	}

	@Override
	public void parar(Conexion conexion) {
		throw new UnsupportedOperationException("AcciÃ³n no permitida... ");
	}

	@Override
	public void iniciar(Conexion conexion) {
		throw new UnsupportedOperationException("AcciÃ³n no permitida... ");
	}

	@Override
	public void enviar(Conexion conexion, String cadena) {
		throw new UnsupportedOperationException("AcciÃ³n no permitida... ");
	}

	@Override
	public void recibir(Conexion conexion, int valor) {
		if (valor == 0) {
			conexion.setEstado(Estado.PREPARADO);
			conexion.setFase(new Preparado());
        } else {
        	conexion.setEstado(Estado.CERRADO);
    		conexion.setFase(new Cerrado());
        }
		
	}

}
