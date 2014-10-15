package es.upm.miw.pd.ecp2.patrones.state.connection;

public class Parado extends Fase{

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
	}

	@Override
	public void iniciar(Conexion conexion) {
		conexion.setEstado(Estado.PREPARADO);
		conexion.setFase(new Preparado());
	}

	@Override
	public void enviar(String cadena) {
		throw new UnsupportedOperationException("AcciÃ³n no permitida... ");
	}

	@Override
	public void recibir(int valor) {
		throw new UnsupportedOperationException("AcciÃ³n no permitida... ");
	}

}
