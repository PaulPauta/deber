/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LAB-2
 */
public class Eleccion {
    private String canton;
    private int mesas;
    private Candidato candidato;
    private int numeroVotos;
    private String lugarVotacion;

    public Eleccion(String canton, int mesas, Candidato candidato, int numeroVotos, String lugarVotacion) {
        this.canton = canton;
        this.mesas = mesas;
        this.candidato = candidato;
        this.numeroVotos = numeroVotos;
        this.lugarVotacion = lugarVotacion;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public int getMesas() {
        return mesas;
    }

    public void setMesas(int mesas) {
        this.mesas = mesas;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public int getNumeroVotos() {
        return numeroVotos;
    }

    public void setNumeroVotos(int numeroVotos) {
        this.numeroVotos = numeroVotos;
    }

    public String getLugarVotacion() {
        return lugarVotacion;
    }

    public void setLugarVotacion(String lugarVotacion) {
        this.lugarVotacion = lugarVotacion;
    }

    @Override
    public String toString() {
        return "Eleccion{" + "canton=" + canton + ", mesas=" + mesas + ", candidato=" + candidato + ", numeroVotos=" + numeroVotos + ", lugarVotacion=" + lugarVotacion + '}';
    }
    
    
}
