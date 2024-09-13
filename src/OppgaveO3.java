
import static javax.swing.JOptionPane.*;

public class OppgaveO3 {

	public static void main(String[] args) {
		
		boolean validInput = false;
		while (!validInput) {
			
			String Fakultetantall= showInputDialog("Skriv in eit heltall n>0");
			
		try {
			int n = Integer.parseInt(Fakultetantall);
			if (n>0) {
				int Fakultet = 1;
				for (int i =1;i <= n; i++ ) {
					Fakultet *=i;
				}
				showMessageDialog(null, "Verdien av " + n + "! er " + Fakultet);
				validInput = true;
			}
			else
				showMessageDialog(null,"Du har skrevet en ugyldig verdi for n");
	} catch (NumberFormatException e) {
				showMessageDialog(null, "Du har skrevet inn eit ugyldig heltall over 0");
		}
	}
 }
}
