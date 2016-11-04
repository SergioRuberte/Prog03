import java.util.*;
public class HacerMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int num, suma=0, cont=0;
		float media=0;
		do{
			System.out.println("Inserte un número: (Introduzca '0' para acabar)");
			num=teclado.nextInt();
			suma=suma+num;
			if (num!=0){
				cont++;
			}
		}while (num!=0);
		media=(float)suma/cont;
		System.out.println("La media de la suma de los números es: "+media);
	}

}
