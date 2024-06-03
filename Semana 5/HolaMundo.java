public class HolaMundo {
    public static void main(String[] args) {
	int edad = 17;
	boolean esProfesor = false;
	char letra = 'A';
	String mensaje = "Hola soy Manuel y mi edad es " + edad + " y soy profesor de Java:" + esProfesor + " y mi letra favorita es " + letra;
        System.out.println(mensaje);
	int a = 1;
	int b = 2;
	System.out.println(a + b);
	String c = "3";
	System.out.println(b + c);
	System.out.println(mensaje.length());
	int x = mensaje.indexOf("Manuel");
	System.out.println(x);
	System.out.println(mensaje.toUpperCase());
	if (edad >= 18) {
		System.out.println("Puede pasar al parque de atracciones extremas.");
	} else if (edad >= 16 && edad < 18) {
		System.out.println("Puede pasar al parque de atracciones extremas pero con acceso restringido.");
	} else {
		System.out.println("Usted no puede pasar.");
	}
	
	if (esProfesor == true) {
		System.out.println("Gaseosa gratis.");
	} else {
		System.out.println("Cabritas gratis.");
	}
	

    }
}