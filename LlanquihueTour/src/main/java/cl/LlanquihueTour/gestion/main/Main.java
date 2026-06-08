package cl.LlanquihueTour.gestion.main;

import cl.LlanquihueTour.gestion.Exceptions.DatosInvalidosException;
import cl.LlanquihueTour.gestion.model.Direccion;
import cl.LlanquihueTour.gestion.model.Persona;
import cl.LlanquihueTour.gestion.model.Rol;

/**
 *  @Author Lorena Padilla
 */

public class Main {
    public static void main(String[] args) {

        try {
            Persona persona1 = new Persona("Vicente Huidobro", 58);
            persona1.setRol(new Rol("Cliente", "8654789-2"));
            persona1.setDireccion(new Direccion("Aquiles Bailo", "420A", "Renca", "Chile"));

            Persona persona2 = new Persona("Gabriela Mistral", 35);
            persona2.setRol(new Rol("Poveedor", "76895742-3"));
            persona2.setDireccion(new Direccion("Elvis Tek", "666G", "Peor es nada", "Chile"));

            Persona persona3 = new Persona("María Luisa Bombal", 23);
            persona3.setRol(new Rol("Empleado", "17658942-3"));
            persona3.setDireccion(new Direccion("Zoila Mesa", "88", "Salsipuedes", "Chile"));

            System.out.println(persona1.toString());
            System.out.println(persona2.toString());
            System.out.println(persona3.toString());

        } catch (DatosInvalidosException e) {
            System.out.println("Ingrese datos válidos");
        }


    }
}