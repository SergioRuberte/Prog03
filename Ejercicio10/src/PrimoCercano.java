import java.util.Scanner;

public class PrimoCercano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		int a=0, i, n, n1, n2;
		int contx=0, conty=0;
		System.out.println("Ingrese número:");
		n=teclado.nextInt();
		
		for(i=n; i<=n; i--) {
			if(n%i==0){
				System.out.println(i);
				a++;
				contx++;
			}
		}
		if(a!=2){
			System.out.println("");
		}
		
		
		/*for(i=1; i<(n+1);i++){
			if(n%i==0){
				a++;
			}
		}
		if(a!=2){
			System.out.println("No es primo");
			}else{
				System.out.println("Sí es primo");
		}*/
	}

}
