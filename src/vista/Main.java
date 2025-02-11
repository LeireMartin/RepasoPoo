package vista;

import java.util.ArrayList;
import java.util.List;

import modelo.Direccion;
import modelo.Estudiante;
import modelo.Persona;
import modelo.Profesor;

public class Main {
    public static void main(String[] args) {
    
    Persona p1=new Persona("Pepe", 24);
    Persona p2=new Persona("ANa", 18);
    Persona p3=new Persona("Pepe", 28);
    Direccion d1=new Direccion("Calle", "Cuidad", "CodPos");
    Persona p4=new Persona("Jose", 6, d1);

    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p1.equals(p3));
    p4.mostrarDireccion();

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
    for (Persona persona : lista) {
      System.out.println(persona);
    }
    java.util.Iterator<Persona> iter=lista.iterator();
    while (iter.hasNext()) {
       iter.next().muestraInformacion();
    }




    int resultado = p1.compareTo(p3);

    if (resultado == 0) {
        System.out.println(p1.getNombre() + " y " + p3.getNombre() + " tienen la misma edad.");
    } else if (resultado > 0) {
        System.out.println(p1.getNombre() + " es mayor que " + p3.getNombre() + ".");
    } else {
        System.out.println(p1.getNombre() + " es menor que " + p3.getNombre() + ".");
    }
 }
 

}
