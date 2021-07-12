//archivo que contiene la clase Persona
public class Persona {

	//atributos
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private float peso;
	private float altura;
	private static final char SEXO = 'F';  //a pesar de lo que dice el enunciado he decidido que el sexo por defecto sera femenino
	
	
	//metodos
	
	public Persona() //constructor por defecto
	{
		this.nombre = "";
		this.edad = 0;
		this.sexo= SEXO;
		this.peso = 0;
		this.altura = 0;
	}
	public Persona(String nombre, int edad, char sexo) //constructor por algunos parametros
	{
		this();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;	
	}
	public Persona(String nombre, int edad,String dni, char sexo, float peso, float altura)//constructor por parametros
	{
		this(nombre,edad,sexo);
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
	}
	
	//getters y setters de los atributos
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	//metodo para facilitar la correccion del ejercicio y comprobar que todo se genera de forma adecuada
	public void mostrarAtributos()
	{
		System.out.println("El nombre de la persona es: "+this.nombre);
		System.out.println("La edad de "+this.nombre+" es: "+this.edad);
		System.out.println("El DNI de "+this.nombre+" es: "+this.dni);
		System.out.println("El sexo de "+this.nombre+" es: "+this.sexo);
		System.out.println("El peso de "+this.nombre+" es: "+this.peso);
		System.out.println("La altura "+this.nombre+" es: "+this.altura);
	}
}
