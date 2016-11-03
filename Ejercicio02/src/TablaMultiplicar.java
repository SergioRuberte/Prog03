import java.util.*;
public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int num, mult=1, resultado;
		do{
			System.out.println("Inserte un número entre 1 y 100");
			num=teclado.nextInt();
			if (num<1 || num>100){
				System.out.println("El número debe de estar entre 1 y 100");
			}
		}while(num<1 || num>100);
		System.out.println("TABLA DE MULTIPLICAR DE "+num);
		for(int i=1; i<=10; i++){
			resultado=num*mult;
			System.out.println(num+" * "+mult+" = "+resultado);
			mult++;
		}
	}

}
