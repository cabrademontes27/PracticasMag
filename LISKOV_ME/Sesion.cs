public class Sesion
{
    private string _usuario;
    private string _contraseña;


    public Sesion(string  usuario, string contraseña)
    {
        this._usuario = usuario;
        this._contraseña = contraseña;
    }

    public bool IniciarSesion()
    {
        return _usuario == "pepe" && _contraseña == "4444";
    }



}