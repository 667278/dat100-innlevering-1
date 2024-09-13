import static javax.swing.JOptionPane.*;

public class OppgaveO2 {

	public static void main(String[] args) {
		for(int elever=1; elever<=10;elever++) {
			boolean running = false;
			while (!running) {
		
		String poengtxt= showInputDialog("Skriv in poengsummen her " + elever + " av 10");
				int poeng= Integer.parseInt(poengtxt);
				
				if (100 >= poeng && poeng >=90) {
					System.out.println("A");}
				else if (89 >= poeng && poeng >=80) {
					System.out.println("B");}
				else if (79 >= poeng && poeng >=60) {
					System.out.println("C");}
				else if (59 >= poeng && poeng >=50) {
					System.out.println("D");}
				else if (49 >= poeng && poeng >=40) {
					System.out.println("E");}
				else if (39 >= poeng && poeng >=0) {
					System.out.println("F");}
				else
					showMessageDialog(null,"Du har skrevet en ugyldig poengsum!");
				
				if (0 <= poeng && poeng <=100) {
					running = true;}
				}
	}
  }
}
