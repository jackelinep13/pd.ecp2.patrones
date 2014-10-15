package es.upm.miw.pd.ecp2.patrones.state.connection;


public class Cerrado extends Fase{

	Estado estado;
	
	@Override
	public void abrir(Conexion conexion) {
		conexion.setEstado(Estado.PREPARADO);
		conexion.setFase(new Preparado());
	}

	@Override
	public void cerrar(Conexion conexion) {		
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
		throw new UnsupportedOperationException("AcciÃ³n no permitida... ");
	}

}
