import java.util.Scanner;

public class Menu {
	
	public static void main(String[]args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Cálculo de áreas");
			System.out.println("====================================");
			System.out.println("1. Calcular el área de un triángulo");
			System.out.println("2. Calcular el área de un trapecio");
			System.out.println("3. Calcular el área de un rectángulo");
			System.out.println("4. Salir");
			int opcion=sc.nextInt();
			System.out.println("Introduce los valor de la base");
			int base=sc.nextInt();
			System.out.println("Introduce los valor de la altura");
			int altura=sc.nextInt();
			sc.close();
	
		if(opcion==1 && base>0 && altura>0) {
			System.out.println("El área del triángulo es "+CalculoAreas.calcularAreaTriangulo(base, altura));	
		}

	
		if(opcion==2 && base>altura | altura>base) {
			System.out.println("El área del trapecio es "+CalculoAreas.calcularAreaTrapecio(base, altura));
		}

		
		if(opcion==3 && base>=2 && base<=10 && altura>=2 && altura<=10) {
			System.out.println("El área del rectángulo es "+CalculoAreas.calcularAreaRectangulo(base, altura));
		}

			
		if(opcion==4) {
			return;
		}
	}
}