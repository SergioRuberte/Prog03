import java.util.Scanner;

public class Perfectos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner teclado=new Scanner(System.in);
			int num, suma=0;
			System.out.println("Inserte un n�mero");
			num=teclado.nextInt();
			for (int i=1; i<num; i++){
				if (num%i==0){
					suma=suma+i;
				}
			}
			if(suma==num){
				System.out.println("El n�mero es perfecto");
			}else{
				System.out.println("El n�mero no es perfecto");
			}
		}

	}

