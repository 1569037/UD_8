enum COLOR
{
		BLANCO,NEGRO,ROJO,AZUL,GRIS;
}
public class Electrodomestico {

	//atributos
	
	protected float precioBase;
	protected COLOR color;
	protected char consumo;
	protected float peso;
	protected static final char[] CONSUMO = {'A', 'F'};
	protected static final float PRECIO_BASE = 100f;
	protected static final float PESO = 5f;
	
	
	//metodos
	
	public Electrodomestico()
	{
		this.color =  COLOR.BLANCO;
		this.consumo = CONSUMO[1];
		this.precioBase = PRECIO_BASE;
		this.peso=PESO;
	}
	
	public Electrodomestico(float precio, float peso)
	{
		this();
		this.precioBase = precio;
		this.peso = peso;
	}
	public Electrodomestico (float precio, String color, char consumo, float peso)
	{
		this.precioBase=precio;
		String c = color.toUpperCase(); //pasar color a mayuscula
		boolean comp = false;
		for (COLOR i: COLOR.values()) //comprovar si el color es valido en caso contrario coger el color por defecto
		{
			if(i.name().equals(c))
			{
				this.color= COLOR.valueOf(c);
				comp = true;
			}
		}
		if (comp == false)
			this.color = COLOR.BLANCO;
		this.consumo=consumo;
		this.peso=peso;	
	}
	
	//getters y setters
	
	public float getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}

	public COLOR getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = COLOR.valueOf(color);
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	//mostrar resultado por pantalla
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumo=" + consumo + ", peso="
				+ peso + "]";
	}
	
}
