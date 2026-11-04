public class App {
    public static void main(String[] args) throws Exception {
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro ("El amor en los tiempos de cólera", "Gabriel García Márquez");
        Libro libro3 = new Libro("El principito", "Antonie de Saint-Exupéry");


        Biblioteca biblioteca = new Biblioteca("Biblioteca Luis Ángel Arango");
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);


        System.out.println();
        biblioteca.mostrarCatalogo();

        biblioteca.buscarAutor("Gabriel Garcáa Márquez");
        System.out.println();
        biblioteca.buscarAutor("Jorge Luis Borges");

    }
}
