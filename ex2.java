import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		
		double numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o numero: ");
		
		numero = sc.nextDouble();
		
		sc.close();
		
		System.out.println("O numero informado foi : " + numero);
		
		

	}

}
