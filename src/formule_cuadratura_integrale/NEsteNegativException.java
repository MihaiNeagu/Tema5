package formule_cuadratura_integrale;

@SuppressWarnings("serial")
public class NEsteNegativException extends Exception {
	NEsteNegativException () {
		super("Ai dat n negativ sau zero !");
	}
}