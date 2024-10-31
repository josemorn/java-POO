package und2;

//Clase principal de prueba para los contenidos audiovisuales
public class PruebaAudioVisual {
 public static void main(String[] args) {
     System.out.println("Hello from Eclipse!");

     // Crear instancias de ContenidoAudiovisual
     ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
     contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
     contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
     contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy");
     contenidos[3] = new VideoYouTube("Introducción a la Programación", 15, "Educativo", "CodeAcademy", 2000);
     contenidos[4] = new Cortometraje("La Huella", 25, "Drama", "Pedro Almodóvar", "España");

     // Mostrar detalles de cada contenido
     for (ContenidoAudiovisual contenido : contenidos) {
         contenido.mostrarDetalles();
     }
 }
}
