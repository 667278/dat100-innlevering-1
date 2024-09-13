

import static javax.swing.JOptionPane.*;

public class OppgaveO1 {

	public static void main(String[] args) {
		
		String inntekt= showInputDialog("Skriv in inntekt her");
		  int inntekter = Integer.parseInt(inntekt);
		
		if (208050 >= inntekter && inntekter >=0) {
			System.out.println("Med denne inntekten betaler du ingen trinnskatt");}
		else if (292850 >= inntekter && inntekter >=208051) {
			System.out.println("Med denne inntekten betaler du 1,7% trinnskatt som gir deg ein skatt på "+(inntekter*0.017)+"kr");}
		else if (670000 >= inntekter && inntekter >=292851) {
			System.out.println("Med denne inntekten betaler du 4,0% trinnskatt som gir deg ein skatt på "+(inntekter*0.04)+"kr");}
		else if (937900 >= inntekter && inntekter >=670001) {
			System.out.println("Med denne inntekten betaler du 13,6% trinnskatt som gir deg ein skatt på "+(inntekter*0.136)+"kr");}
		else if (1350000 >= inntekter && inntekter >=937901) {
			System.out.println("Med denne inntekten betaler du 16,6% trinnskatt som gir deg ein skatt på "+(inntekter*0.166)+"kr");}
		else if (inntekter >=1350001) {
			System.out.println("Med denne inntekten betaler du 17,6% trinnskatt som gir deg ein skatt på "+(inntekter*0.176)+"kr");}
		else
			showMessageDialog(null, "Du har skrevet en ugyldig sum!");
	}

	}


