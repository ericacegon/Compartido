import java.util.Scanner;

public class Principal {

	public double num1;
	public double num2;
	public double resultado;

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public static double suma(double a, double b) {
		return a + b;
	}

	public static double resta(double a, double b) {
		return a - b;
	}

	public static double multiplicacion(double a, double b) {
		return a * b;
	}

	public static double division(double a, double b) {
		return a / b;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int op, n1, n2;
		double resul;
		String continuar = "";

		do {
			
			System.out.println("¿Qué operación quieres realizar?");
			System.out.println("1. SUMA");
			System.out.println("2. RESTA");
			System.out.println("3. MULTIPLICACIÓN");
			System.out.println("4. DIVISIÓN");
			op = sc.nextInt();

			System.out.println("Introduce el primer número");
			n1 = sc.nextInt();
			System.out.println("Introduce el segundo número");
			n2 = sc.nextInt();

			if (op == 1) {
				resul=suma(n1,n2);
				System.out.println("El resultado de la suma de "+n1+" y "+n2+" es "+resul);
			}
			if (op == 2) {
				resul=resta(n1,n2);
				System.out.println("El resultado de la resta de "+n1+" y "+n2+" es "+resul);
			}
			if (op == 3) {
				resul=multiplicacion(n1,n2);
				System.out.println("El resultado de la multiplicación de "+n1+" y "+n2+" es "+resul);
			}
			if (op == 4) {
				resul=division(n1,n2);
				System.out.println("El resultado de la división de "+n1+" y "+n2+" es "+resul);
			}

			System.out.println();
			System.out.println("¿Quieres realizar otra operación?");
			continuar=sc.next();
			
		} while (continuar.equals("si"));

		System.out.println("== FIN ==");

	}

}
