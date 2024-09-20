package baselibros;

public class Libro {

    String titulo;
    String autor;
    int numerodepaginas;
    int anodepublicacion;

    public Libro (String titulo, String autor, int numerodepaginas, int anodepublicacion){
        this.titulo =titulo;
        this.autor =autor;
        this.numerodepaginas =numerodepaginas;
        this.añodepublicacion =anodepublicacion;

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumerodepaginas() {
        return numerodepaginas;
    }

    public void setNumerodepaginas(int numerodepaginas) {
        this.numerodepaginas = numerodepaginas;
    }

    public int getAnodepublicacion() {
        return anodepublicacion;
    }

    public void setAñodepublicacion(int anodepublicacion) {
        this.añodepublicacion = anodepublicacion;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String Titulo){
        this.titulo =titulo;
    }

    //Mostrar datos libro
    public void mostrarDatosLibro (){
        System.out.println("Titulo:  " + titulo);
        System.out.println("Autor:  " + autor);
        System.out.println("Numerodepaginas:  " + numerodepaginas);
        System.out.println("Anodepublicacion:  " + anodepublicacion);
    }
}

