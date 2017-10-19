package imfe;

public class main {

	public static void main(String[] args) {
		//Declaramos los 2 objetos
		Persona alumno1 = new Persona();
		Persona alumno2 = new Persona();
		
		
		//Inicializamos los objetos
		alumno1.edad = 31;
		alumno1.nombre = "Salva";
		alumno1.apellidos = "Márquez Marín";
		alumno1.notaMedia = (float) 7.8; //Hacemos una conversión explícita a float

		alumno2.nombre = "Juanma";
		alumno2.apellidos = "Salas Cruz";
		alumno2.edad = 23;
		alumno2.notaMedia = 9.5f; //Así tb se hace una conversión explícita
		
		
		System.out.println("Hola, " + alumno1.nombre + " " + alumno1.apellidos);
		System.out.println("Tienes de media " + alumno1.notaMedia);
		if (alumno1.edad >= 18) {
			System.out.println("Vente a la fiesta");
		}
		
		
		System.out.println("Hola, " + alumno2.nombre + " " + alumno2.apellidos);
		System.out.println("Tienes de media " + alumno2.notaMedia);
		if (alumno2.edad >= 18) {
			System.out.println("Vente a la fiesta");
		}
		
		
		//Si la media de sus medias, es mayor o igual a 5, les aprobamos
		if (((alumno1.notaMedia + alumno2.notaMedia) / 2)>=5) {
			System.out.println("Vuestras medias superan el 5");
		}

	}

}
