public class Book {

    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }


    public void lendBook()
    {
        if(isAvailable)
        {
            isAvailable = false;
            System.out.println("el libro " + title + "ha sido prestado");
        }else 
        {
            System.out.println("El libro no esta disponible");
        }
    };
    public void returnBook()
    {
        System.out.println("El libro '" + title + "' ha sido devuelto.");
    };




}