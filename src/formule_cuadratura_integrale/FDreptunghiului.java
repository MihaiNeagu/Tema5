package formule_cuadratura_integrale;

import java.util.*;

public class FDreptunghiului extends FormulaCuadratura {
	public FDreptunghiului (Type t) throws NuAiDatNException {
		super (t);
	}
	
	public FDreptunghiului (Type t, double n) throws NEsteNegativException,AiDatNException {
		super (t,n);
	}
	
	@Override
	public double compute () {
		switch (this.type) {
		case SIMPLA:
			return (b-a) * f((a+b)/2);
		case SUMATA:
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
			default:
				return -1;
		}
	}
	
	@Override
	public double computeCuAfisare () {
		switch (this.type) {
		case SIMPLA:
			System.out.println ("(" + b + " - " + a + ") * " + f((a+b)/2));
			return (b-a) * f((a+b)/2);
		case SUMATA:
			double xi0,xi1;
			double h = (a+b)/n;
			System.out.println ("h = " + h);
			double sigma_f = 0;
			
			xi0 = a;
			System.out.println ("xi0 initial = " + xi0);
			
			for (int i = 1; i<=n; i++) {
				xi1 = a + i * h;
				System.out.println ("xi1 = " + xi1);
				
				sigma_f += f((xi0 + xi1) / 2);
				System.out.println ("sigma_f = f((" + xi0 + " + " + xi1 + ") / 2)" + sigma_f);
				
				xi0 = xi1;
				System.out.println ("xi0 devine = " + xi0);
				System.out.println();
			}
			return ((b-a)/n) * sigma_f;
			default:
				return -1;
		}
	}
}
