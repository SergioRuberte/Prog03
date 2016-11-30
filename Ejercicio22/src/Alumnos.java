import java.util.*;
public class Alumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		String nombre, nombremayor="";
		int edad, mayores=0, cont=0, lamayor=0;
		do{
			System.out.println("Introduce un nombre:");
			nombre=teclado.next();
			System.out.println("Introduce una edad");
			edad=teclado.nextInt();
			if(edad>=18){
				mayores++;
			}
			if(edad>lamayor){
				lamayor=edad;
				nombremayor=nombre;
			}
			cont++;
		}while(cont<10);
		System.out.println(mayores);
		System.out.println(nombremayor+ " "+lamayor);
	}

}
