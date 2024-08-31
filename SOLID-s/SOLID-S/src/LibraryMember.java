import javax.print.attribute.standard.MediaSize.NA;

public class LibraryMember {
    private String Name;
    private String memberId;


    public LibraryMember(String Name, String memberId)
    {
        this.Name = Name;
        this.memberId = memberId;
    }

    public String getName() {
        return Name;
    }

    public String getMemberld() {
        return memberId;
    }


    public void borrowBook(Book book) {
        System.out.println(Name + " (ID: " + memberId + ") está solicitando el préstamo del libro.");
        book.lendBook();
    }

    public void returnBook(Book book) {
        System.out.println(Name + " (ID: " + memberId + ") está devolviendo el libro.");
        book.returnBook();
    }

}
