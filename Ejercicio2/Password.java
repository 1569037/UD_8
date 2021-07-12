import java.util.Random;
public class Password {
	
	//atributos
	
	private int longitud = 8;
	private String contrasena;
	
	//metodos 
	
	public Password()
	{
		contrasena = "12345678"; //he decidido que la contraseña por defecto sea esta, puesto que tiene que cumplir una longitud de 8 catacteres
	}
	public Password(int lon)
	{
		this.longitud = lon;
		Random r = new Random();
		StringBuilder s = new StringBuilder();
		for (int i=0; i<lon; i++)
		{
			int ran = r.nextInt(3);
			switch(ran) //algoritmo para añadir a la contraseña un numero un caracter en minuscula o uno en mayuscula aleatoriamente
			{
			case 0:
				s.append((char)(r.nextDouble()*9+48));
				break;
			case 1:
				s.append((char)(r.nextDouble()*25+65));
				break;
			case 2:
				s.append((char)(r.nextDouble()*25+97));
				break;
			default:
				break;
			}
		}
		this.contrasena = s.toString();
	}
	
	//setters y getters
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	//metodo para facilitar la correccion
	
	public void mostrar()
	{
		System.out.println("El password es: "+ this.contrasena+ " y mide "+this.longitud);
	}
	

}
