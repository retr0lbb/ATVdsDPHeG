package AtvDsGuilherme_e_henrique;
import java.util.*; 
public class Exercicios05 {
	public static void main(String[]args) {
	double c, total; 
	Scanner input = new Scanner(System.in);
	try{
		System.out.println ("Entre com °C : ");
		c = input.nextDouble();
		total = (c*9/5)+32;
		System.out.println(total+"°F");
		
	}catch (NumberFormatException e) {
				System.out.println("Houve um erro na conversão, digite apenas caracteres numéricos");
		}
	}
}
