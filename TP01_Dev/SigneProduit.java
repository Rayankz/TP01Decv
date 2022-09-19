import java.util.Scanner;
public class SigneProduit {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in).useDelimiter("\n");
		int Valeurs1;
		int Valeurs2;

		System.out.print("Valeurs 1 : ");
		Valeurs1 = scanner.nextInt();

		System.out.print("Valeurs 2 : ");
		Valeurs2 = scanner.nextInt();

		System.out.println();

		if (Valeurs1*Valeurs2 >= 0) {
			System.out.println("Le produit de ces deux valeurs est positif.");
		}
		else {
			System.out.println("Le produit de ces deux valeurs est négatif.");
		}
		scanner.close();
	}
}
