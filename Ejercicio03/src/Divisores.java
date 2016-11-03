import java.util.*;
public class Divisores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int num, n2;
		System.out.println("Inserte un número");
		num=teclado.nextInt();
		for (int i=1; i<num; i++){
			if (num%i==0){
				System.out.print(i+" ");
			}
		}
	}

}
