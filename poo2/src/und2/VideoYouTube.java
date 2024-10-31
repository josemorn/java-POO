package und2;

class VideoYouTube extends ContenidoAudiovisual {
    private String canal;
    
private int reproducciones;

    public VideoYouTube(String titulo, int duracionEnMinutos, String genero, String canal, int reproducciones) {
        super(titulo, duracionEnMinutos, genero);
        this.canal = canal;
        
  
this.reproducciones = reproducciones;
    }

    
    public void mostrarDetalles() {
    	System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
    	System.out.println("Género: " + getGenero());
    	System.out.println("Canal: " + canal);
    	System.out.println("Reproducciones: " + reproducciones);
    	System.out.println();

    }
}
