package modelo;

public class Estudiante extends Persona {
    private String carrera;
public Estudiante(){
    
}
public Estudiante(String carrera) {
    this.carrera = carrera;
}

public Estudiante(String nombre, int edad, String carrera) {
    super(nombre, edad);
    this.carrera = carrera;
}

@Override
public String toString() {
    return "Estudiante [carrera=" + carrera + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + "]";
}

public void estudiar(){
    System.out.println(" El alumno "+ getNombre() + " estudia: "+ carrera);
 }


}
