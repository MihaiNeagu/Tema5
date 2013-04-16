package formule_cuadratura_integrale;

@SuppressWarnings("serial")
public class NewtonCotesWrongKException extends Exception {
	NewtonCotesWrongKException () {
		super ("k trebuie sa fie 2 sau 3 in formula Newton-Cotes");
	}	
}
