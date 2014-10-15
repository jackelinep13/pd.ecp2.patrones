package es.upm.miw.pd.ecp2.patrones.state.connection;

import es.upm.miw.pd.ecp2.patrones.state.connection.Conexion;

public abstract class Fase {

	public abstract void abrir(Conexion conexion);
	
	public abstract void cerrar(Conexion conexion);

	public abstract void parar(Conexion conexion);
	
	public abstract void iniciar(Conexion conexion);
	
	public abstract void enviar(String cadena);
	
	public abstract void recibir(int valor);
	
}
