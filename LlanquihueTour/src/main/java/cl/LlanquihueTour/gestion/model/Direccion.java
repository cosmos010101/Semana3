package cl.LlanquihueTour.gestion.model;

public class Direccion {

    private String calle;
    private String numero;
    private String comuna;
    private String pais;

    public Direccion(String calle, String numero, String comuna, String pais){
        this.calle=calle;
        this.numero=numero;
        this.comuna=comuna;
        this.pais=pais;
    }

    @Override
    public String toString(){
        return calle + " " + numero + ", " + comuna + ", " + pais + ".\n";
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


}
