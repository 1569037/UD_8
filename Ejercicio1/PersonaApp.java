/***
 * @author evelyn
 * Version 1 clase Persona
 * Fecha de edicion: 12/07/2021
 */
public class PersonaApp {

	public static void main(String[] args) {
		Persona p1 = new Persona(); //recuerdo que he decidido que el ssexo por defecto sera femenino, no es un error de codigo
		Persona p2 = new Persona("Paula",12,'F');
		Persona p3 = new Persona("Pepe",41,"435673P",'M',80f,1.82f);
		
		//llamada a metodos que facilitan la correccion 
		
		p1.mostrarAtributos();
		p2.mostrarAtributos();
		p3.mostrarAtributos();
	}

}
