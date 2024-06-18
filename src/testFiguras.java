
public class testFiguras {
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		Cuadrado c1 = new Cuadrado("Pants", 127);
		Rectangulo r = new Rectangulo("Rec", 25, 12);
		Rombo rom = new Rombo ("Rom", 10, 16, 12);
		Romboide romb = new Romboide ("Romb", 8,4);
		Trapecio trapea = new Trapecio ("Trapea", 6, 6, 12, 15, 6);
		imprimirCalculo(t1); 
		imprimirCalculo(t2);
		imprimirCalculo(c1);
		imprimirCalculo(r);
		imprimirCalculo(rom);
		imprimirCalculo(romb);
		imprimirCalculo(trapea);

	}//main
	public static void imprimirCalculo(FiguraGeometrica t) {
		System.out.println(t);
		System.out.println("+========================================");
		System.out.println("|El área de ["+t.getName()+"] es: " + t.calcularArea() + 
				"\n" + "|El perímetro de ["+t.getName()+"] es: " + t.calcularPerimetro());
		System.out.println("+========================================");
	}//imprimirCalculo
}//class testFiguras