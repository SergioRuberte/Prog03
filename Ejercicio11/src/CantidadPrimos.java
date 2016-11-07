import java.util.Scanner;

public class CantidadPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		int a=0, i, n, numprimos=0;
		System.out.println("Ingrese número:");
		n=teclado.nextInt();
		for(int u=1;u<n;u++){
			System.out.println(u);
			for(i=1; i<(u+1);i++){
				if(u%i==0){
					a++;
				}
				if(a==2){
					numprimos++;
					System.out.println("Primo");
					System.out.println(i+" "+u);
			}
			}


		}
		System.out.println(numprimos);
	}

}
