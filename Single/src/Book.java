public class Book {
    private final String title;
    private final String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;  // El libro está disponible por defecto
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void lendBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("El libro '" + title + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + title + "' no está disponible.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("El libro '" + title + "' ha sido devuelto.");
    }
}


