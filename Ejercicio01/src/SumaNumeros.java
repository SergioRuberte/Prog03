import java.util.*;
public class SumaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int numA=0, numB=0, resultado = 0, indice;
		do{
			System.out.println("Inserte un valor A:");
			numA=teclado.nextInt();
			System.out.println("Inserte un valor B:");
			numB=teclado.nextInt();
			if (numA>numB){
				System.out.println("El valor B debe de ser mayor que el valor A");
			}
		}while(numA>numB);
		indice=numA+1;
		while (indice<=numB-1){
			 resultado=resultado+indice;
			 indice++;
		}
		System.out.println("El resultado de la suma es: "+resultado);
	}

}
