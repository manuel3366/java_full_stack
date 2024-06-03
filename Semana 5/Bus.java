public class Bus {
	public static int suma(int a, int b) {
		return a + b;
	}
	public static void main(String[] args){
		System.out.println("Nro parametros:" + args.length);
		if (args.length > 0) {
			int edad = new Integer(args[0]);
			if ( edad >= 18) {
				System.out.println("Puede subir al bus");
			} else {
				System.out.println("Necesita un adulto para subir al bus");
			}
		} else {
			System.out.println("El pasajero debe tener una edad definida.");
		}
		System.out.println(suma(4, 5));
	}
	
	public static void main(String args){
		System.out.println("Yo soy el nuevo main");
	}
}