public class Alumno extends Persona implements Actividad{

    private int calificacion;

    public Alumno(String nombre, int calificacion) {
        super(nombre);
        this.calificacion = calificacion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
    }

    @Override
    public void realizarExamen() {
        System.out.println(getNombre() + " está realizand un examen");
    }
}