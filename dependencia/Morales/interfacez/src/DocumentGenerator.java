public class DocumentGenerator {
    private InputReader reader = new InputReader();
    private TxtFileCreator txt = new TxtFileCreator();

    public void makeTxtFile() {
        String content = reader.getContent();
        String name = reader.getFileName();

        this.txt.createFile(content, name);

        System.out.println("Archivo creado exitosamente");
    }
}