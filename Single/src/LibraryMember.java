public class LibraryMember {
    private final String name;
    private final String memberId;

    public LibraryMember(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public void borrowBook(Book book) {
        System.out.println(name + " (ID: " + memberId + ") está solicitando el préstamo del libro.");
        book.lendBook();
    }

    public void returnBook(Book book) {
        System.out.println(name + " (ID: " + memberId + ") está devolviendo el libro.");
        book.returnBook();
    }
}


