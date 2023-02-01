package Daily;

import java.util.Iterator;
import java.util.Scanner;

public class CalculProgramm {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entrer un nombre");
		int numb = scanner.nextInt();
		
		System.out.println("La table de multiplication de " + numb + " est :\n");
		for (int x = 1; x <= 10; x++) {
			for(int y = 0; y < 1; y++) {
				int res = numb * x;
				System.out.println(numb + " * " + x + " = " + res );
			}
		}
		System.out.println("\n");
		
		int fact = numb;
		
		int result = 1;
		if (numb == 0) {
			System.out.println("Le factoriel de " + fact + " est : " + result + "\n");
		} else {
			while (numb >= 1) {
				result = result * numb;
				numb--;
			}
			System.out.println("Le factoriel de " + fact + " est : " + result + "\n");
		}
		
		int a = 0;
		int b = 1;
		int c = 0;
		int n = 3;
		System.out.println("La séquence de Fibonacci\n");
		System.out.println(a);
		System.out.println(b);
		do {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
			n = n +1;
			
		} while (n <= fact);
	}

}
