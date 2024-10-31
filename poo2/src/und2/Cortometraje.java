package und2;

public class Cortometraje extends ContenidoAudiovisual {
    private String director;
    private String paisDeProduccion;

    public Cortometraje(String titulo, int duracionEnMinutos, String genero, String director, String paisDeProduccion) {
        super(titulo, duracionEnMinutos, genero);
        this.director = director;
        this.paisDeProduccion = paisDeProduccion;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del cortometraje:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Director: " + director);
        System.out.println("País de Producción: " + paisDeProduccion);
        System.out.println();
    }
}
