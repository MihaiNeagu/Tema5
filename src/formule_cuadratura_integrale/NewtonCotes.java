package formule_cuadratura_integrale;

public class NewtonCotes extends FormulaCuadratura {
	private int k;
	public NewtonCotes (Type t) throws NuAiDatNException {
		super (t);
	}
	
	public NewtonCotes (Type t, double n) throws NEsteNegativException,AiDatNException {
		super (t,n);
	}
	
	public void setK (int kk) throws NewtonCotesWrongKException {
		if (kk != 2 || kk != 3)
			throw new NewtonCotesWrongKException ();
		this.k = kk;
	}
	
	@Override
	public double compute () {
		//Verifica daca k este 2 sau 3 pentru a putea aplica formula Newton-Cotes
		try {
			if (k != 2 || k != 3)
				throw new NewtonCotesWrongKException ();
		}
		
		switch (this.type) {
		case SIMPLA:
			switch (this.k) {
			case 2:
				return (b-a)/2 * ( f((2*a+b)/3) + f((a+2*b)/3) );
			case 3:
				return (b-a)/5 * ( 2 * f((3*a+b)/4) - f((a+b)/2) + 2*f((a+3*b)/2) );
			default:
				return -1;
			}
		case SUMATA:
			switch (this.k) {
			case 2:
				double xi0,xi1;
				double h = (a+b)/n;
				double sigma_f = 0;
				
				xi0 = a;
				
				for (int i = 1; i<=n; i++) {
					xi1 = a + i * h;
					sigma_f += f((xi0 + xi1) / 2);				
					xi0 = xi1;
				}
				return ((b-a)/n) * sigma_f;

			case 3:
				return (b-a)/5 * ( 2 * f((3*a+b)/4) - f((a+b)/2) + 2*f((a+3*b)/2) );
			default:
				return -1;
			}
			default:
				break;
		}
	}
}
