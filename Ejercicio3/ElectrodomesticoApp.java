/***
 * @author evelyn
 * Version 1 clase Electrodomestico
 * Fecha de edicion: 12/07/2021
 */
public class ElectrodomesticoApp {

	public static void main(String[] args) {
		Electrodomestico e = new Electrodomestico();
		Electrodomestico e1 = new Electrodomestico(200,103.2f);
		Electrodomestico e2 = new Electrodomestico (300, "NeGro",'F',150.1f);
		System.out.println(e.toString());
		System.out.println(e1.toString());
		System.out.println(e2.toString());
	}
}
