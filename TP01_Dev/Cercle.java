import java.util.Scanner;
public class Cercle {
	final static double PI=3.14;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useDelimiter("\n");
		
		double rayon;
		double resultat;
		double Circonference;
		double Aire;

		System.out.print("Rayon du cercle : ");
		rayon = scanner.nextDouble();
		
		System.out.println();

		Circonference = (rayon*PI*2);
		
		Aire = (PI*rayon*rayon);

		System.out.println("Circonférence =" + Circonference);

		System.out.println("Aire =" + Aire);
		
		scanner.close();

	}
}		


		

		

		

		

