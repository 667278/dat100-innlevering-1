//Denne versjonen bruker int, noko som gjer at den er meir begrensa.
//Ein mulig forbetring kunne vere å bruke long.

import java.util.Scanner;

public class OppgaveO3 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		boolean validInput = false;
		
    while (!validInput) {
			System.out.print("Skriv inn eit heltall n>0: ");
      String input = sc.nextLine();

		
		try {
			int n = Integer.parseInt(input.trim());
			if (n>0) {
				int Fakultet = 1;
				for (int i =1;i <= n; i++ ) {
					Fakultet *=i;
				}
				System.out.println("Verdien av " + n + "! er " + Fakultet);
				validInput = true;
			}
			else
				System.out.println("Du har skrevet en ugyldig verdi for n");
	} catch (NumberFormatException e) {
				System.out.println("Du har skrevet inn eit ugyldig heltall over 0");
		}
	}

  sc.close();
 }
}
