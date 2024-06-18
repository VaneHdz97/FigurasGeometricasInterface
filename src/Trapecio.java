
public class Trapecio implements FiguraGeometrica {
	private String name;
	private double ladoL;
	private double ladoM;
	//private double ladoN;
	//private double ladoO;
	private double baseMenor;
	private double baseMayor;
	private double altura;
	public Trapecio(String name, double ladoL, double ladoM, double baseMenor, double baseMayor, double altura) {
		this.name = name;
		this.ladoL = ladoL;
		this.ladoM = ladoM;
		this.baseMenor = baseMenor;
		this.baseMayor = baseMayor;
		this.altura = altura;
	}//constructor
	public double calcularPerimetro() {
		return getLadoL()+ getLadoM() + getBaseMayor() + getBaseMenor();
	}// calcularPerimetro
	@Override
	public double calcularArea() {
			return (getAltura()*(getBaseMayor()+getBaseMenor()))/2;
	}//calcularArea
	public String getName() {
		return name;
	}//getName
	public void setName(String name) {
		this.name = name;
	}//setName
	public double getLadoL() {
		return ladoL;
	}//getLadoL
	public void setLadoL(double ladoL) {
		this.ladoL = ladoL;
	}//setLadoL
	public double getLadoM() {
		return ladoM;
	}//getLadoM
	public void setLadoM(double ladoM) {
		this.ladoM = ladoM;
	}//setLadoM
	
	public double getBaseMenor() {
		return baseMenor;
	}//getBaseMenor
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}//setBaseMenor
	public double getBaseMayor() {
		return baseMayor;
	}//getBaseMayor
	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}//setBaseMayor
	public double getAltura() {
		return altura;
	}//getAltura
	public void setAltura(double altura) {
		this.altura = altura;
	}//setAltura
	@Override
	public String toString() {
		return "Trapecio [name=" + name + ", ladoL=" + ladoL + ", ladoM=" + ladoM +  ", baseMenor=" + baseMenor + ", baseMayor=" + baseMayor + ", altura=" + altura + "]";
	}//toString

}//class Trapecio
