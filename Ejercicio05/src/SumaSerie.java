import java.util.*;
public class SumaSerie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int num, suma=0;
		do{
			System.out.println("Inserte un número: (Introduzca '0' para acabar)");
			num=teclado.nextInt();
			suma=suma+num;
		}while (num!=0);
		System.out.println("La suma de los números es: "+suma);
	}

}
