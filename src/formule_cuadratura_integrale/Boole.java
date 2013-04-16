package formule_cuadratura_integrale;

public class Boole extends FormulaCuadratura {
		public Boole (Type t) throws NuAiDatNException {
			super(t);
		}
		
		public Boole (Type t, double n) throws NEsteNegativException,AiDatNException {
			super (t,n);
		}
		
		@Override
		public double compute() {
			switch (this.type) {
			case SIMPLA:
				return (b-a) * (f(a) + 32 * f((3*a + b)/4) + 12*f((a+b)/2) + 32*f((a+3*b)/4) + 7*f(b));    
			case SUMATA:
				double xi1,xi0;
				double h = (b-a)/n;
				double sigma_f = 0;
				
				xi0 = a;
				
				for (int i = 1; i<=n; i++) {
					xi1 = a + i * h;
					sigma_f += 7 * f(xi0) + 32 * f((3 * xi0 + xi1) / 4) + 12 * f((xi0 + xi1) / 2) + 32 * f((xi0 + 3 * xi1)/4) + 7 * f(xi1);
					xi0 = xi1;
				}
				return ((b - a) / (90 * n)) * sigma_f;
				default:
					return -1;
			}
		}
	}

