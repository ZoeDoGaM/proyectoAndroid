package com.example.joseluis.rmw;

/**
 * Created by Jose Luis on 27/06/2017.
 */

public class claseCredito {
    int imagenFoto;
    String tipoPersona, descripcion;

    public claseCredito(int imagenFoto, String tipoPersona, String descripcion) {
        this.imagenFoto = imagenFoto;
        this.tipoPersona = tipoPersona;
        this.descripcion = descripcion;
    }

    public int getImagenFoto() {
        return imagenFoto;
    }

    public void setImagenFoto(int imagenFoto) {
        this.imagenFoto = imagenFoto;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
