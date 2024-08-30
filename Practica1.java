class Logger {
    public void log(String... messages) {
        System.out.println("Múltiples mensajes:");
        for (String message : messages) {
            System.out.println(message);
        }
    }

    public <T> void log(T message) {
        System.out.println("Mensaje genérico: " + message);
    }

    public void log(int level, String... messages) {
        System.out.println("Múltiples mensajes con niveles: " + level);
        for (String message : messages) {
            System.out.println(message);
        }
    }
}

public class Practica1 {
    public static void main(String[] args) {
        Logger log = new Logger();
        log.log("Hola", "Adiós", "Sebastian");
        log.log("Rafa y los perros");
        log.log(4);
        log.log(true);
    }
}
