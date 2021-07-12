/***
 * @author evelyn
 * Version 1 clase Serie
 * Fecha de edicion: 12/07/2021
 */
public class SerieApp {

	public static void main(String[] args) {
		Serie s = new Serie();
		Serie s1 = new Serie("La marmota timida", "Pablo Garcia");
		Serie s2 = new Serie("La marmota timida",2,"terror","Pablo Garcia");
		System.out.println(s.toString());
		System.out.println(s1.toString());
		System.out.println(s2.toString());

	}

}
