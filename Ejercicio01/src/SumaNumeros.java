import java.util.*;
public class SumaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int numA=0, numB=0, resultado = 0;
		do{
			System.out.println("Inserte un valor A:");
			numA=teclado.nextInt();
			System.out.println("Inserte un valor B:");
			numB=teclado.nextInt();
			if (numA>numB){
				System.out.println("El valor B debe de ser mayor que el valor A");
			}
		}while(numA>numB);
		
		while (numA!=numB-1){
			 numA++;
			 resultado=resultado+numA;
		}
		System.out.println("El resultado de la suma es: "+resultado);
	}

}
