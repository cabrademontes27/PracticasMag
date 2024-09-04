public class CitaEnLinea : Cita
{
    public override void ConfirmarCita()
    {
        Console.WriteLine($"Cita en linea confirmada para {Cliente} para el servicio de {Servicio} en la fecha {FechaHora}");
    }
}