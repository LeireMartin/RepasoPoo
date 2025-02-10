package vista;

import java.util.ArrayList;
import java.util.List;

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

    List<Persona> lista=null;
    lista=new ArrayList<Persona>();
    lista.add(e1);
    lista.add(p1);
    lista.add(pro1);
    
    java.util.Iterator<Persona> iter=lista.iterator();
    while (iter.hasNext()) {
       iter.next().muestraInformacion();
    }

 }
 

}
