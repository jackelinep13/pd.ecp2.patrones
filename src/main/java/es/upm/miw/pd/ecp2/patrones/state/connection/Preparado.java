package es.upm.miw.pd.ecp2.patrones.state.connection;

import es.upm.miw.pd.ecp2.patrones.state.connection.Estado;

public class Preparado extends Fase{
	
	@Override
	public void abrir(Conexion conexion) {
		
	}

	@Override
	public void cerrar(Conexion conexion) {
		conexion.setEstado(Estado.CERRADO);
		conexion.setFase(new Cerrado());
	}

	@Override
	public void parar(Conexion conexion) {
		conexion.setEstado(Estado.PARADO);
		conexion.setFase(new Parado());
	}

	@Override
	public void iniciar(Conexion conexion) {
	}

	@Override
	public void enviar(Conexion conexion, String cadena) {
		conexion.getLink().enviar(cadena);
		conexion.setEstado(Estado.ESPERANDO);
		conexion.setFase(new Esperando());
	}

	@Override
	public void recibir(Conexion conexion, int valor) {
		throw new UnsupportedOperationException("AcciÃ³n no permitida... ");
	}

}
