import java.util.Scanner;

public class InputReader {
    Scanner sc = new Scanner(System.in);

    public String getFileName() {
        System.out.println("Ingresa el nombre de tu archivo:");
        return sc.nextLine();
    }

    public String getContent() {
        System.out.println("Ingresa el contenido de tu archivo:");
        return sc.nextLine();
    }
}