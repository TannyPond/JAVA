
public class TesteTriangulo {

	public static void main(String[] args) {
		Triangulo t = new Triangulo();
		t.lado = 10;
		t.area();
		t.perimetro();
	}

}

public class Triangulo {

	float lado;
	float area;
	float perimetro;
	
	void area(){
		System.out.println((lado*Math.sqrt(3))/2);
	}
	
	void perimetro() {
		System.out.println(3*lado);
	}
	
}
