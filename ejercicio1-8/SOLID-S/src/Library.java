public class Library {
    private Book book;
    private LibraryMember member;


    public Library(Book book, LibraryMember member)
    {
        this.book = book;
        this.member = member;
    }

    public void lendBook() {
        member.borrowBook(book);
    }

    public void returnBook() {
        member.returnBook(book);
    }

    public void showBookStatus()
    {
        System.out.println("El estado actual del libro '" + book.getTitle() + "' es: " + (book.isAvailable() ? "Disponible" : "No disponible"));
    }
}
