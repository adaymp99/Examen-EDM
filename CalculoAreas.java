/**
 * Clase que sirve para calcular areas
 * @author Aday Mercado
 * @version 1.0
 *
 */
public class CalculoAreas {
	
	/**
	 * Metodo que calcula el area de un triangulo
	 * @param base valor de la base
	 * @param altura valor de la altura
	 * @return el area del triangulo
	 */
	public static int calcularAreaTriangulo(int base, int altura) {
		return ((base*altura)/2);
	}
	
	/**
	 * Metodo que calcula el area de un trapecio
	 * @param base valor de la base
	 * @param altura valor de la altura
	 * @return el area del trapecio
	 */
	public static int calcularAreaTrapecio(int base, int altura) {
		int mediana=(base+altura)/2;
		return ((mediana*altura));
	}
	
	/**
	 * Metodo que calcula el area de un rectangulo
	 * @param base valor de la base
	 * @param altura valor de la altura
	 * @return el area del rectangulo
	 */
	public static int calcularAreaRectangulo(int base, int altura) {
		return (base*altura);
	}
}
