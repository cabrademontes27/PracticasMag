class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    String getNombre() {
        return this.nombre;
    }

    public void monstrarInfo(){
        System.out.println("Nombre: " + this.nombre);
    }

    public void realizarExamen(){

    }
}


class Alumno extends Persona{
    private int calificacion;

    public Alumno(String nombre, int calificacion) {
        super(nombre);
        this.calificacion = calificacion;
    }

    public int getCalificacion() {
        return this.calificacion;
    }

    @Override
    public void monstrarInfo() {
        super.monstrarInfo();
        System.out.println("Calificacion: " + this.calificacion);
    }

    @Override
    public void realizarExamen() {
        System.out.println(getNombre() + " está realizando examen");
    }
}


class Maestro extends Persona{
    private String materia;

    public Maestro(String nombre, String materia) {
        super(nombre);
        this.materia = materia;
    }

    public String getMateria() {
        return this.materia;
    }

    @Override
    public void monstrarInfo() {
        super.monstrarInfo();
        System.out.println("Materia: " + this.materia);
    }

    @Override
    public void realizarExamen() {
        throw new UnsupportedOperationException("Los maestros no realizan examen");
    }
}

public class Main {
    public static  void realizarActividades(Persona persona){
        persona.realizarExamen();
    }

    public static void main(String[] args) {
        Persona alumno = new Alumno("ALegría", 8);
        Persona maestro = new Maestro("Mag", "Base de datos");
        realizarActividades(alumno);
        realizarActividades(maestro);
    }
}