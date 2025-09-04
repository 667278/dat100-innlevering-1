import static javax.swing.JOptionPane.*;

public class OppgaveO1 {

	public static void main(String[] args) {
		
		String inntekt= showInputDialog("Skriv in inntekt her");
		  int inntekter = Integer.parseInt(inntekt);
		
		if (217400 >= inntekter && inntekter >=0) {
			System.out.println("Med denne inntekten betaler du ingen trinnskatt");}
		else if (306050 >= inntekter && inntekter >=217401) {
			System.out.println("Med denne inntekten betaler du 1,7% trinnskatt som gir deg ein skatt på "+(inntekter*0.017)+"kr");}
		else if (697150 >= inntekter && inntekter >=306051) {
			System.out.println("Med denne inntekten betaler du 4,0% trinnskatt som gir deg ein skatt på "+(inntekter*0.04)+"kr");}
		else if (942400 >= inntekter && inntekter >=697151) {
			System.out.println("Med denne inntekten betaler du 13,7% trinnskatt som gir deg ein skatt på "+(inntekter*0.136)+"kr");}
		else if (1410750 >= inntekter && inntekter >=942401) {
			System.out.println("Med denne inntekten betaler du 16,7% trinnskatt som gir deg ein skatt på "+(inntekter*0.166)+"kr");}
		else if (inntekter >=1410751) {
			System.out.println("Med denne inntekten betaler du 17,7% trinnskatt som gir deg ein skatt på "+(inntekter*0.176)+"kr");}
		else
			showMessageDialog(null, "Du har skrevet en ugyldig sum!");
	}

	}


