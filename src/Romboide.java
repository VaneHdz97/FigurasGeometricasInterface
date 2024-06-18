
public class Romboide implements FiguraGeometrica{
	private String name;
	private double base;
	private double altura;
	public Romboide(String name, double base, double altura) {
		this.name = name;
		this.base = base;
		this.altura = altura;
	}//constructor
	public double calcularPerimetro() {
		return (getBase()*2)+(getAltura()*2);
	}// calcularPerimetro
	@Override
	public double calcularArea() {
			return getBase()*getAltura();
	}//calcularArea
	public String getName() {
		return name;
	}//getName
	public void setName(String name) {
		this.name = name;
	}//setName
	public double getBase() {
		return base;
	}//getBase
	public void setBase(double base) {
		this.base = base;
	}//setBase
	public double getAltura() {
		return altura;
	}//getAltura
	public void setAltura(double altura) {
		this.altura = altura;
	}//setAltura
	@Override
	public String toString() {
		return "Romboide [name=" + name + ", base=" + base + ", altura=" + altura + "]";
	}//toString
	
}//class Romboide
