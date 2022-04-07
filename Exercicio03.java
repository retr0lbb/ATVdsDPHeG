package AtvDsGuilherme_e_henrique;
import java.util.*; 
public class Exercicio03 {
public static void main(String []args) {
	int idade;
	String nome;
	String lazer;
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	try {
		System.out.println ("Entre com sua idade : ");
		idade = input.nextInt();
		System.out.println ("Entre com seu nome : ");
		nome = input.next();
		System.out.println ("Entre com seu lazer : ");
		lazer = input.next();
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(lazer);
	}finally {
		
	}
}
}
