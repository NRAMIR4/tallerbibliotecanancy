package baselibros;

public class AdmiLibro {

    public static void main(String[] args){

    Libro tituloUno = new Libro("El Principito","Autoine de Saint",96,1943);
    Libro tituloDos = new Libro("Cien años de soledad","Gabriel Garcia Marquez",417,1967);

    System.out.println ("Datos del titulo 1:  ");

    tituloUno.mostrarDatosLibro();
    tituloDos.mostrarDatosLibro();

        System.out.println ("Titulo titulo 1: " + tituloUno.getNumerodepaginas());
        tituloUno.setNumerodepaginas(100);
        System.out.println ("Numero titiulo 1 modificado: " + tituloUno.getNumerodepaginas());

    }
}
