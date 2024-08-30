// Código en Java

// Definición de la clase abstracta Pago
public abstract class Pago {
    // Método abstracto que debe ser implementado por las clases derivadas
    public abstract void procesarPago();
}

// Clase que representa un pago con tarjeta de crédito
class TarjetaDeCredito extends Pago {
    private String numeroTarjeta;
    private String fechaExpiracion;  // "fechaExpiracion" en lugar de "fechaExploracion"
    private String codigoSeguridad;

    // Constructor para inicializar los campos
    public TarjetaDeCredito(String numeroTarjeta, String fechaExpiracion, String codigoSeguridad) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    // Implementación del método abstracto procesarPago
    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta de crédito");
    }
}

// Clase que representa un pago con PayPal
class Paypal extends Pago {
    private String emailUsuario;

    // Constructor para inicializar el campo
    public Paypal(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    // Implementación del método abstracto procesarPago
    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con PayPal");
    }

    // Método adicional para enviar recibo por correo
    public void enviarRecibo() {
        System.out.println("Enviando recibo por correo");
    }
}

// Clase que procesa diferentes tipos de pagos
class ProcesadorDePago {
    public void procesar(Pago pago) {
        pago.procesarPago();

        // Casteo para operaciones específicas de subclases
        if (pago instanceof TarjetaDeCredito) {
            TarjetaDeCredito tarjeta = (TarjetaDeCredito) pago;
            // Operaciones adicionales con tarjeta de crédito
        } else if (pago instanceof Paypal) {
            Paypal paypal = (Paypal) pago;
            paypal.enviarRecibo();
        }
    }
}

// Clase principal para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando el procesamiento de pagos");

        // Ejemplo de uso
        Pago pago1 = new TarjetaDeCredito("1234567890123456", "12/25", "123");
        Pago pago2 = new Paypal("usuario@example.com");

        ProcesadorDePago procesador = new ProcesadorDePago();
        procesador.procesar(pago1);
        procesador.procesar(pago2);
    }
}
