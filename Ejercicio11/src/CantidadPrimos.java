import java.util.Scanner;

public class CantidadPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		int a=0, i, n, numprimos=0, contador=0;
		System.out.println("Ingrese número:");
		n=teclado.nextInt();
		for(int u=1;u<n;u++){
			contador=0;
				if(u%n==0){
					contador++;
				}
			if(contador==2){
				System.out.println("es primo");
				contador=0;
				}
		}
	}

}