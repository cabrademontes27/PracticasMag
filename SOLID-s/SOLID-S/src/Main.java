public class Main {
    public static void main(String[] args) {
        Book book = new Book("Cien Años de Soledad", "Gabriel García Márquez");
        LibraryMember member = new LibraryMember("María López", "M001");

        Library library = new Library(book, member);

        library.showBookStatus();  // Muestra si el libro está disponible o no

        library.lendBook();  // Préstamo del libro
        library.showBookStatus();  // Muestra el estado del libro después del préstamo

        library.returnBook();  // Devolución del libro
        library.showBookStatus();  // Muestra el estado del libro después de la devolución
    }
}