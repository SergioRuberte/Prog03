import java.util.*;
public class EsPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		int a=0, i, n;
		System.out.println("Ingrese número:");
		n=teclado.nextInt();
		for(i=1; i<(n+1);i++){
			if(n%i==0){
				a++;
			}
		}
		if(a!=2){
			System.out.println("No es primo");
			}else{
				System.out.println("Sí es primo");
		}
	}

}
