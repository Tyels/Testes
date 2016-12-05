 
public class Exer12Funcions {
	
	int potencia (int x, int n) {
	
		int aux = x;
		
		if (n == 0 ) { // se n = 0 
				x = 1;
				return x;
		}
		if (n % 2 == 0) { // se n = par
			n = n / 2;
			int b = aux;

			while (n != 0) {	
				b = b*aux;
				n--;
			}
			x = x*b;
			x *= 2; 
			return x;
		}
		
		if (n % 2 != 0) { // se n = impar
			int a = x;
			n--;
			if (n == 0 )
					x = 1;
			while (n != 0) {
				a = x;
				a = x * a;
				n--;
			}
			x = x*a;
			return x;
		}
		return x;	
	}
}
