package talleresSegundoCorte;
import java.util.Scanner;
import java.util.Arrays;

public class ContarAlturaPersonas {

	private Scanner teclado;
	private Arrays lista;
	private float[] altura;
	private float promedioA = 0;
	private float sumaAlturas = 0;
	private float contadorAlturaMax = 0;
	private float contadorAlturasMin = 0;
	
	//Método para ingresar datos de alturas de personas 
		public void ingresoAlturaPersona(){
			
			teclado = new Scanner(System.in);	
			altura = new float[10];
			
			System.out.println("1. Ingrese la altura en cm");
			
			for(int i = 0;  i < altura.length; i++){
				
				System.out.print(" Persona " + i + ":");
				altura[i] = teclado.nextFloat();	
			}
			System.out.println(" __Tabla de alturas__");
			System.out.println("   " + lista.toString(altura));
			System.out.println(" ");
		}
		//Método para calular la altura media 
		public void calcularPromedio() {
				
			for(int i = 0; i < altura.length; i++) {
				
				sumaAlturas = sumaAlturas + altura[i];		
			}
			promedioA = sumaAlturas/altura.length;
			System.out.print("***Resultados***");
			System.out.println("Promedio altura: " + promedioA);		
		}
		//Método para calular cuantas personas superan la altura promedio
		public void contarAlturasMax() {
	      	
			System.out.println("2. Personas que superan la altura promedio");
			
			for(int i = 0; i < altura.length; i++) {
				
				if(altura[i] > promedioA) {
				   System.out.println("Persona " + i +" "+ altura[i]);
				   contadorAlturaMax++;
				}	
			}	
			System.out.println("Total = " + contadorAlturaMax);	
	    }
		//Método para calular cuantas personas no superan la altura promedio
		public void contarAlturasMin () {
			System.out.println("3. Personas que no superan la altura promedio");
			for(int i = 0; i < altura.length; i++) {
				
				if(altura[i] < promedioA) {
				   System.out.println("Persona " + i +" "+ altura[i]);
	               contadorAlturasMin++;			
				}			
			}
			System.out.println("Total = " + contadorAlturasMin);	
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creamos un objeto de la clase Altura persona
		ContarAlturaPersonas cap = new ContarAlturaPersonas();
			
		//Llamada de los métodos
		cap.ingresoAlturaPersona();
		cap.calcularPromedio();
		cap.contarAlturasMax();
		cap.contarAlturasMin();
	}
}
