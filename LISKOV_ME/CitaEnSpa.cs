public class CitaEnSpa: Cita,IVerificable
{
    public override void ConfirmarCita()
    {
        Console.WriteLine($"Cita confirmada para {Cliente} en el servicio {Servicio} el {FechaHora}");
    }
    public void VerificarDisponibilidad()
    {
        Console.WriteLine($"Verificando disponibilidad para el servicio {Servicio} en el spa el {FechaHora}");
    }

    
}