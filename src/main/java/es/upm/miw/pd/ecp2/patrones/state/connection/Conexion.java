package es.upm.miw.pd.ecp2.patrones.state.connection;

import es.upm.miw.pd.ecp2.patrones.state.connection.Estado;
import es.upm.miw.pd.ecp2.patrones.state.connection.Link;
import es.upm.miw.pd.ecp2.patrones.state.connection.Fase;

public class Conexion {

	private Estado estado;
    private Link link;
    private Fase fase;

      
    public Link getLink() {
        return link;
    }

    public Estado getEstado() {
        return this.estado;
    }
    
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    protected void setFase(Fase fase) {
        this.fase = fase;
    }

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.estado = Estado.CERRADO;
        this.setFase(new Cerrado());
    }
    	
	public void abrir(){
		this.fase.abrir(this);
	}
	
	public void cerrar(){
		this.fase.cerrar(this);
	}

	public void parar(){
		fase.parar(this);
	}
	
	public void iniciar(){
		fase.iniciar(this);
	}
	
	public void enviar(String msg){
		fase.enviar(msg);
	}
	
	public void recibir(int valor){
		fase.recibir(valor);
	}
}