package formule_cuadratura_integrale;

public class FormulaCuadratura {

	protected double a;
	protected double b;
	protected Type type;
	protected double n;

	
	public FormulaCuadratura (Type t) throws NuAiDatNException {
		this.type = t;
		if (t == Type.SUMATA) throw new NuAiDatNException ();
	}
	
	public FormulaCuadratura (Type t, double n) throws NEsteNegativException,AiDatNException {
		if (t == Type.SIMPLA) throw new AiDatNException ();
		this.type = t;			
		if (n <= 0) throw new NEsteNegativException ();
		this.n = n;
		
	}
	
	
	public FormulaCuadratura() {
		super();
	}

	public Type getType() {
		return type;
	}
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public void setN(double n) {
		this.n = n;
	}

	double f(double x) {
		return (Math.pow(x, 7) * Math.sqrt(1 - Math.pow(x, 2))) / Math.sqrt(Math.pow((2-x), 13));
	}

	public double compute() {
		return -1;
	}

	public double computeCuAfisare() {
		return -1;
	}

}