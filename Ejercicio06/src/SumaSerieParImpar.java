import java.util.*;
public class SumaSerieParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int num, sumapar=0, sumaimpar=0, cont=1;
		do{
			System.out.println("Inserte un n�mero: (Introduzca '0' para acabar)");
			num=teclado.nextInt();
			if (cont%2==0){
				sumapar=sumapar+num;
			}else{
				sumaimpar=sumaimpar+num;
			}
			cont++;
		}while (num!=0);
		System.out.println("La suma de los n�meros impares es: "+sumaimpar);
		System.out.println("La suma de los n�meros pares es: "+sumapar);	
	}

}
