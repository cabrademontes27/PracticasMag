public  class SistemasDeCitas 
{
    private List<Cita> _citas = new List<Cita>();

    public void AgregarCIta(Cita cita)
    {
        _citas.Add(cita);
    }

    public void ProcesarCitas()
    {
        foreach(var cita in _citas)
        {
            if(cita is IVerificable verificableCita)
            {
                verificableCita.VerificarDisponibilidad();
            }
            cita.ConfirmarCita();
        }
    }


}