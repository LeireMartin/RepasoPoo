package modelo;

public class Persona implements Comparable{
    private String nombre;
    private int edad;
    private Direccion direccion;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.setNombre(nombre);
        this.setEdad(edad);
    }
    public Persona(String nombre, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + edad;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (edad != other.edad)
            return false;
        return true;
    }

    public void muestraInformacion(){
        System.out.println( nombre + " tiene " + edad + " años.");
    }
    public void mostrarDireccion(){
        System.out.println(this.direccion);
    }

    

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Persona)) {
            throw new IllegalArgumentException("El objeto no es una instancia de Persona");
        }
        Persona otraPersona = (Persona) o;
        return Integer.compare(this.edad, otraPersona.edad);
    }
}
