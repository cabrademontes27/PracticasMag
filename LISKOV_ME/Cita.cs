public abstract class Cita
{
    public string? Cliente {get; set;}
    public DateTime FechaHora {get; set;}
    public string? Servicio {get; set;}

    public abstract void ConfirmarCita();
}