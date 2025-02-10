package modelo;

public class Profesor extends Persona implements Trabajador{
 private String especialidad;
    @Override
    public void trabajar() {
        System.out.println(getNombre()+" está enseñando "+especialidad);
    }
    public Profesor(String especialidad) {
        this.especialidad = especialidad;
    }
    public Profesor(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }
    public void muestraInformacion(){
        System.out.println("Persona [nombre=" + getNombre() + ", especialidad=" + especialidad + "]");
    }

}
