package vista;

import modelo.Estudiante;
import modelo.Persona;
import modelo.Profesor;

public class Main {
    public static void main(String[] args) {
    
    Persona p1=new Persona("Pepe", 24);
    Persona p2=new Persona("ANa", 18);
    Persona p3=new Persona("Pepe", 24);
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p1.equals(p3));

    Estudiante e1=new Estudiante("Luis", 24, "CC.Ambientales");
    System.out.println(e1);
    e1.estudiar();

    Profesor pro1=new Profesor("Juan", 37, "Biología");
    pro1.trabajar();

    
    
 }
 

}
