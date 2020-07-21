/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author lucho
 */
class Prensa {
    
    public static final String LIBRE = "LIBRE";
    public static final String OCUPADA = "OCUPADA";
    public static final String FIN_TRABAJO = "FIN_TRABAJO";
    
    private Integer nroPrensa;
    private Integer diaFinTrabajo;
    private Integer nroTrabajo;
    private String estado;
    private Integer tipo;

    public Prensa(Integer nroPrensa) {
        this.nroPrensa = nroPrensa;
        this.estado = LIBRE;
    }
    
    

    public Integer getNroPrensa() {
        return nroPrensa;
    }

    public void setNroPrensa(Integer nroPrensa) {
        this.nroPrensa = nroPrensa;
    }

    public Integer getDiaFinTrabajo() {
        return diaFinTrabajo;
    }

    public void setDiaFinTrabajo(Integer diaFinTrabajo) {
        this.diaFinTrabajo = diaFinTrabajo;
    }

    public Integer getNroTrabajo() {
        return nroTrabajo;
    }

    public void setNroTrabajo(Integer nroTrabajo) {
        this.nroTrabajo = nroTrabajo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }
    
    
    
    
    
}
