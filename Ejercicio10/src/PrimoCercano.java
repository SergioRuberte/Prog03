import java.util.Scanner;

public class PrimoCercano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, nprimo,cdiv=0;
		boolean esprimo;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame el numero para empezar a probar: ");
		nprimo=teclado.nextInt();
		nprimo++;
		do
		{
			cdiv=0;
			esprimo=false;
// esprimo vale false cuando no lo encuentro y true cuando si
			for (x=2;x<=nprimo/2;x++)
			{// este bucle mira los divisores
				if (nprimo%x==0)
				{
					cdiv++;
					x=nprimo;
				}
			}
			if (cdiv==0)// si los divisiores son cero ya lo hemos encontrado
			{
				esprimo=true;
				System.out.println("El primo cercano es: "+nprimo);
			}
			
			else
				esprimo=false;

			nprimo++;
		}while (esprimo==false);// el bucle se hace hasta que esprimno sea true
	}

}
