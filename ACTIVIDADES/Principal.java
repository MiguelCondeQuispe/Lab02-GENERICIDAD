
public class Principal {

	public static void main(String[] args) {
		Bolsa <Chocolatina> bolsaChocolates = new Bolsa <Chocolatina>(2);
		Chocolatina c1 = new Chocolatina("La Iberica");
		Chocolatina c2 = new Chocolatina("Milky");
		Chocolatina c3 = new Chocolatina("Sublime");
		
		Bolsa <Golosina> bolsaGolosinas = new Bolsa <Golosina>(2);
		Golosina g1 = new Golosina("Gomitas",2.8);
		Golosina g2 = new Golosina("Chisitos",8.5);
		Golosina g3 = new Golosina("CuaCua",1.7);
		
		bolsaChocolates.add(c1);
		bolsaChocolates.add(c2);
		bolsaChocolates.add(c3);
		
		bolsaGolosinas.add(g1);
		bolsaGolosinas.add(g2);
		bolsaGolosinas.add(g3);
		
		for (Chocolatina chocolatina : bolsaChocolates) {
			System.out.println(chocolatina.getMarca());
		}
		
		for(Golosina golosinas : bolsaGolosinas) {
			System.out.println(golosinas.getNombre() + golosinas.getPeso());
		}
	}

}
