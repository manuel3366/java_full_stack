public class TestAnimal {
	public static void main(String[] args) {
		
		Animal perro = new Animal();
		perro.setFamilia("caninos");		
		perro.setNumeroPatas(4);		
		perro.alimentarse();
		perro.imprimirFamilia();

		Animal gato = new Animal();
		gato.setFamilia("felinos");		
		gato.setNumeroPatas(4);		
		gato.alimentarse();
		gato.imprimirFamilia();
		System.out.println(gato.getFamilia());
	}
	
}