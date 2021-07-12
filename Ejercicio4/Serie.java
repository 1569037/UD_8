
public class Serie {

	//atributos
	private String titulo;
	private int numTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	//metodos (constructores)
	public Serie()
	{
		this.titulo="";
		this.numTemporadas = 3;
		boolean entregado = false;
		this.genero="";
		this.creador="";
	}
	public Serie(String titulo, String creador)
	{
		this();
		this.titulo=titulo;
		this.creador=creador;
	}
	public Serie(String titulo, int temp,String genero, String creador)
	{
		this();
		this.titulo=titulo;
		this.numTemporadas=temp;
		this.genero = genero;
		this.creador=creador;
	}
	//getters y setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumTemporadas() {
		return numTemporadas;
	}
	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}
	public boolean isEntregado() {
		return entregado;
	}
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	@Override
	//mostrar por pantalla
	public String toString() {
		return "Serie [titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}
	
}
