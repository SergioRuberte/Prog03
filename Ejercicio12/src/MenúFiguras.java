import java.util.*;
public class Men�Figuras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int n, base, altura, area;
		System.out.println("Elija una opci�n: ");
		System.out.println("1.- Tri�ngulo");
		System.out.println("2.- Cuadrado");
		System.out.println("3.- Rect�ngulo");
		n=teclado.nextInt();
		switch (n){
		case 1:
			System.out.println("Introduzca la base:");
			base=teclado.nextInt();
			System.out.println("Introduzca la altura:");
			altura=teclado.nextInt();
			area=(base*altura)/2;
			System.out.println(area);
			break;
		}
		
	}

}
