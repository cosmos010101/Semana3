package cl.LlanquihueTour.gestion.model;

import cl.LlanquihueTour.gestion.Exceptions.DatosInvalidosException;

public class Persona {

    private String nombre;
    private int edad;
    private Direccion direccion;
    private Rol rol;

    public Persona(String nombre, int edad) throws DatosInvalidosException {

        if(nombre.isEmpty()){
            throw new DatosInvalidosException("Ingrese un nombre.");
        }
        if(edad <0 ){
            throw new DatosInvalidosException("Ingrese una edad válida");
        }

        this.nombre=nombre;
        this.edad=edad;
        this.rol = new Rol ("Cliente, Proveedor, Operador o Guía", "15248626-5");
        this.direccion = new Direccion("Los Olivos", "895B", "Puerto Montt", "Chile");

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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nEdad: " + edad +
                "\nRol: " + rol +
                "\nDireccion: " + direccion;

    }
}
