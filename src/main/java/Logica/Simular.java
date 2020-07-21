/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author lucho
 */
public class Simular {

    private static final String TIPO1 = "TIPO 1";
    private static final String TIPO2 = "TIPO 2";
    private static final String NO_TRABAJO = "-";

    private Double utilidad1, utilidad2;
    private Object[] filaNueva = new Object[15];
    private ArrayList<Prensa> prensas = new ArrayList<>();
    private Integer contadorTrabajo = 0;
    private final Integer[] probTipos;
    private Boolean descartar2;
    private Integer demoraDesde;
    private Integer demoraHasta;

    public Simular(Double utilidad1, Double utilidad2, Integer[] probTipos, Boolean descartar2, Integer demoraDesde, Integer demoraHasta) {
        this.utilidad1 = utilidad1;
        this.utilidad2 = utilidad2;
        this.probTipos = probTipos;
        this.descartar2 = descartar2;
        this.demoraDesde = demoraDesde;
        this.demoraHasta = demoraHasta;
        inicializarPrensas();
    }

    public Object[] simular(Object[] filaAnterior, Integer dia) {
        inicializarFila(filaAnterior);
        this.filaNueva[0] = dia;
        this.filaNueva[1] = generarRandom();
        this.filaNueva[2] = obtenerTipoTrabajo((Integer) this.filaNueva[1]);
        if (!this.filaNueva[2].equals(Simular.NO_TRABAJO)) {
            Trabajo trabajo = new Trabajo(contadorTrabajo + 1, (Integer) this.filaNueva[0]);
            contadorTrabajo++;
            this.filaNueva[3] = "Lleg T " + trabajo.getNro();

            if (puedeAtenderTrabajo()) {

                this.filaNueva[4] = generarRandom();
                this.filaNueva[5] = obtenerDiasDemora((Integer) this.filaNueva[4]);
                Integer indexPrensa = this.prensas.indexOf(this.prensas.stream().
                        filter(x -> x.getEstado().equals(Prensa.LIBRE)).findFirst().get());

                if (indexPrensa == 0) {
                    this.filaNueva[6] = Prensa.OCUPADA;
                    this.filaNueva[7] = dia + (Integer) this.filaNueva[5];
                    this.filaNueva[8] = this.filaNueva[2];
                    this.filaNueva[9] = filaAnterior[9];
                    this.filaNueva[10] = filaAnterior[10];
                    this.filaNueva[11] = filaAnterior[11];
                    this.prensas.get(0).setDiaFinTrabajo((Integer) this.filaNueva[7]);
                    this.prensas.get(0).setNroTrabajo(trabajo.getNro());
                    this.prensas.get(0).setTipo(this.filaNueva[2].toString().equals(Simular.TIPO1) ? 1 : 2);
                    this.prensas.get(0).setEstado(Prensa.OCUPADA);
                } else {
                    this.filaNueva[6] = filaAnterior[6];
                    this.filaNueva[7] = filaAnterior[7];
                    this.filaNueva[8] = filaAnterior[8];
                    this.filaNueva[9] = Prensa.OCUPADA;
                    this.filaNueva[10] = dia + (Integer) this.filaNueva[5];
                    this.filaNueva[11] = this.filaNueva[2];
                    this.prensas.get(1).setDiaFinTrabajo((Integer) this.filaNueva[10]);
                    this.prensas.get(1).setNroTrabajo(trabajo.getNro());
                    this.prensas.get(1).setTipo(this.filaNueva[2].toString().equals(Simular.TIPO1) ? 1 : 2);
                    this.prensas.get(1).setEstado(Prensa.OCUPADA);
                }
                this.filaNueva[12] = filaAnterior[12];
                this.filaNueva[13] = filaAnterior[13];
                this.filaNueva[14] = filaAnterior[14];
                verificarFinTrabajos((Integer) this.filaNueva[0], filaAnterior);

            } else { // DESCARTAR TRABAJO.
                this.filaNueva[4] = "-";
                this.filaNueva[5] = "-";
                this.filaNueva[6] = filaAnterior[6];
                this.filaNueva[7] = filaAnterior[7];
                this.filaNueva[8] = filaAnterior[8];
                this.filaNueva[9] = filaAnterior[9];
                this.filaNueva[10] = filaAnterior[10];
                this.filaNueva[11] = filaAnterior[11];
                this.filaNueva[12] = filaAnterior[12];
                this.filaNueva[13] = filaAnterior[13];
                this.filaNueva[14] = filaAnterior[14];

                llenarFilasSinTrabajo(filaAnterior);
                verificarFinTrabajos((Integer) this.filaNueva[0], filaAnterior);

            }

        } else { // NO HAY TRABAJOS NUEVOS.
            llenarFilasSinTrabajo(filaAnterior);
            verificarFinTrabajos((Integer) this.filaNueva[0], filaAnterior);

        }
        return this.filaNueva;
    }

    private void llenarFilasSinTrabajo(Object[] filaAnterior) {
        this.filaNueva[4] = "-";
        this.filaNueva[5] = "-";
        this.filaNueva[6] = filaAnterior[6];
        this.filaNueva[7] = filaAnterior[7];
        this.filaNueva[8] = filaAnterior[8];
        this.filaNueva[9] = filaAnterior[9];
        this.filaNueva[10] = filaAnterior[10];
        this.filaNueva[11] = filaAnterior[11];
        this.filaNueva[12] = filaAnterior[12];
        this.filaNueva[13] = filaAnterior[13];
        this.filaNueva[14] = filaAnterior[14];
    }

    private Integer obtenerDiasDemora(Integer rnd) {
        float random = (float) rnd / 100;
        float x = this.demoraDesde + random * (this.demoraHasta - this.demoraDesde);
        return Math.round(x);
    }

    private Boolean puedeAtenderTrabajo() {
        if (this.prensas.stream().anyMatch(x -> x.getEstado().equals(Prensa.LIBRE))) {
            return true;
        }
        return false;
    }

    private String obtenerTipoTrabajo(Integer random) {
        if (this.descartar2) {
            if (random <= this.probTipos[0]) {
                return Simular.TIPO1;
            } else {
                return Simular.NO_TRABAJO;
            }
        } else {
            if (random <= this.probTipos[0]) {
                return Simular.TIPO1;
            } else {
                if (random <= this.probTipos[1]) {
                    return Simular.TIPO2;
                } else {
                    return Simular.NO_TRABAJO;
                }
            }
        }
    }

    private Integer generarRandom() {
        Integer random = Integer.parseInt(new DecimalFormat("0").format(Math.random() * 100));
        if (random == 100) {
            random--;
        }
        return random;

    }

    private void inicializarFila(Object[] filaAnterior) {
        this.filaNueva[0] = 0; // dia
        this.filaNueva[1] = "-"; //RND Tipo
        this.filaNueva[2] = "-";//Tipo Trabajo
        this.filaNueva[3] = "-"; //Evento
        this.filaNueva[4] = "-"; //RND Demora
        this.filaNueva[5] = "-"; // Dia Demora
        this.filaNueva[6] = "LIBRE"; //Estado
        this.filaNueva[7] = 0; // Dia Finaliza
        this.filaNueva[8] = "-"; // Atendiendo tipo.
        this.filaNueva[9] = "LIBRE"; // Estado
        this.filaNueva[10] = "-"; // Dia Finaliza
        this.filaNueva[11] = "-"; // Atendiendo tipo.
        this.filaNueva[12] = filaAnterior[12];//Acum Tipo 1;
        this.filaNueva[13] = filaAnterior[13]; //Acum Tipo 2;
        this.filaNueva[14] = filaAnterior[14];//Acum Total;

    }

    private void inicializarPrensas() {
        this.prensas.add(new Prensa(1));
        this.prensas.add(new Prensa(2));
    }

    private void verificarFinTrabajos(Integer diaActual, Object[] filaAnterior) {

        for (int i = 0; i < this.prensas.size(); i++) {
            if (this.prensas.get(i).getEstado().equals(Prensa.OCUPADA)) {
                if (this.prensas.get(i).getDiaFinTrabajo().equals(diaActual)) {
                    if (i == 0) {
                        this.filaNueva[6] = Prensa.LIBRE;
                        this.filaNueva[7] = "-";
                        this.filaNueva[8] = "-";
                    } else {
                        this.filaNueva[9] = Prensa.LIBRE;
                        this.filaNueva[10] = "-";
                        this.filaNueva[11] = "-";
                    }
                    this.prensas.get(i).setEstado(Prensa.LIBRE);
                    this.prensas.get(i).setDiaFinTrabajo(null);

                    if (this.prensas.get(i).getTipo() == 1) {
                        this.filaNueva[12] = (Integer) this.filaNueva[12] + 1;
                        this.filaNueva[14] = (Double) filaNueva[14] + this.utilidad1;
                    } else {
                        this.filaNueva[13] = (Integer) this.filaNueva[13] + 1;
                        this.filaNueva[14] = (Double) filaNueva[14] + this.utilidad2;
                    }

                }
            }
        }
    }
}
