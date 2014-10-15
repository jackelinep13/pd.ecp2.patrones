package es.upm.miw.pd.ecp2.patrones.state.connection;

import es.upm.miw.pd.ecp2.patrones.state.connection.Estado;
import es.upm.miw.pd.ecp2.patrones.state.connection.Link;

public class Conexion {

	private Estado estado;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.estado = Estado.CERRADO;
    }
    
	public Estado getEstado(){
		return null;
	}
	
	public void abrir(){
	}
	
	public void cerrar(){
	}

	public void parar(){
	}
	
	public void iniciar(){
	}
	
	public void enviar(String msg){
	}
	
	public void recibir(int valor){
	}
}