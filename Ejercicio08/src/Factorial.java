import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int num, fact=1, cont=0;
		System.out.println("Ingrese un número:");
		num=teclado.nextInt();
		for (int i=num; i>0; i--){
			fact=fact*i;
		}
		System.out.println("El factorial de "+num+" es: "+fact);
	}

}
