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
class Trabajo {
    public static final String IMPRIMIENDO = "IMPRIMIENDO";
    public static final String DESCARTADO = "DESCARTADO";
    public static final String FUERA_SISTEMA = "FUERA_SISTEMA";
    
    private Integer diaLlegada;
    
    private String estado;
    private Integer nro;

    public Trabajo(Integer nro,Integer diaLlegada) {
        this.nro = nro;
        this.diaLlegada = diaLlegada;
    }

    
    
    public Integer getDiaLlegada() {
        return diaLlegada;
    }

    public void setDiaLlegada(Integer diaLlegada) {
        this.diaLlegada = diaLlegada;
    }


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getNro() {
        return nro;
    }

    public void setNro(Integer nro) {
        this.nro = nro;
    }
    
    
    
    
    
    
}
