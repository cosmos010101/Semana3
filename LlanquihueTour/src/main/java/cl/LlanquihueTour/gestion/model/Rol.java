package cl.LlanquihueTour.gestion.model;

import cl.LlanquihueTour.gestion.Exceptions.DatosInvalidosException;

public class Rol {

    private String rol;
    private String id;

    public Rol(String rol, String id) throws DatosInvalidosException {

        if(rol.isEmpty()){
            throw new DatosInvalidosException("Ingrese el rol de la persona(Cliente, proveedor, guía, operador, etc y un ID");
        }
        this.rol = rol;
        this.id = id;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return rol + "\nID: " + id;
    }
}
