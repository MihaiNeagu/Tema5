package main;

import formule_cuadratura_integrale.*;

public class Main {
	/**
	 * @param args
	 */
	
	static FormulaCuadratura pb = null;
	static int i = 0;
	
	public static void main(String[] args) throws NuAiDatNException,NEsteNegativException,AiDatNException {
		// TODO Auto-generated method stub
		
	//	boole();	
		
		System.out.println ("----------------------------------------------------");
		
	//	dreptunghiului();
		
		System.out.println ("----------------------------------------------------");
		
		
		
	}

	private static void dreptunghiului() throws NuAiDatNException,
			NEsteNegativException, AiDatNException {
		//Formula dreptunghiului simpla si sumata
		pb = new FDreptunghiului (Type.SIMPLA);
		pb.setA(-1);
		pb.setB(1);
		
		System.out.println ("Dreptunghiului simpla: " + pb.computeCuAfisare());
		
		pb = new FDreptunghiului (Type.SUMATA,10);
		i = 10;
		do {
			i *= 10;
			pb.setN(i);
			System.out.println ("Dreptunghiului sumata (n = " + i + ") = " + pb.compute());
		} while (i <= 100000);
	}

	private static void boole() throws NuAiDatNException,
			NEsteNegativException, AiDatNException {
		//Formula Boole simpla si sumata
		pb = new Boole (Type.SIMPLA);
		pb.setA(-1);
		pb.setB(1);
		
		System.out.println ("Boole simpla: " + pb.compute());		
		
		pb = new Boole (Type.SUMATA,10);
		
		pb.setA(-1);
		pb.setB(1);
		
		i = 10;
		do {
			i *= 10;
			pb.setN(i);
			System.out.println ("Boole sumata (n = " + i + ") = " + pb.compute());
		} while (i <= 100000);
	}

}
