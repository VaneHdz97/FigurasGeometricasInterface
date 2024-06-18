
public class Rombo implements FiguraGeometrica {
	private String name;
	private double lado;
	private double diagonalMenor;
	private double diagonalMayor;
	public Rombo(String name, double lado, double diagonalMenor, double diagonalMayor) {
		super();
		this.name = name;
		this.lado = lado;
		this.diagonalMenor = diagonalMenor;
		this.diagonalMayor = diagonalMayor;
	}//constructor
	@Override
	public double calcularPerimetro() {
		return getLado()*4;
	}// calcularPerimetro
	@Override
	public double calcularArea() {
			return (getDiagonalMayor()*getDiagonalMenor())/2;
	}//calcularArea
	public String getName() {
		return name;
	}//getName
	public void setName(String name) {
		this.name = name;
	}//setName
	public double getLado() {
		return lado;
	}//getLado
	public void setLado(double lado) {
		this.lado = lado;
	}//setLado
	public double getDiagonalMenor() {
		return diagonalMenor;
	}//getDiagonalMenor
	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}//setDiagonalMenor
	public double getDiagonalMayor() {
		return diagonalMayor;
	}//getDiagonalMayor
	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}//setDiagonalMayor
	
	@Override
	public String toString() {
		return "Rombo [name=" + name + ", lado=" + lado + ", diagonalMenor=" + diagonalMenor + ", diagonalMayor="
				+ diagonalMayor + "]";
	}//toString	

}//class Rombo
