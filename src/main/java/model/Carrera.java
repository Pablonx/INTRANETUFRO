package model;

import java.util.ArrayList;

public class Carrera {
    private String nombrecarrera, códigocarrera;
    private int nrosemestres;
    private ArrayList<Estudiante> estudianteslist;

    public Carrera(ArrayList<Estudiante> estudianteslist) {
        this.estudianteslist = estudianteslist;
    }

    public Carrera(String nombrecarrera, String códigocarrera, int nrosemestres,ArrayList<Estudiante> estudiantesList) {
        this.nombrecarrera = nombrecarrera;
        this.códigocarrera = códigocarrera;
        this.nrosemestres = nrosemestres;
        this.estudianteslist = estudiantesList;
    }
    public Estudiante buscarCliente(String nromat) {
        Estudiante estudiante = null;
        for (Estudiante estaux : this.getEstudianteslist()) {
            if (estaux.getNúmeromat().equals(nromat)) {
                estudiante = estaux;
                break;
            }
        }
        return estudiante;
    }

    public boolean añadirEstudiante(String nombre, String apellido, String rut, String nromat) {

        if (buscarCliente(nromat) == null) {
            Estudiante estudiante = new Estudiante(nombre,apellido,rut,nromat);
            this.estudianteslist.add(estudiante);
            return true;
        }
        else{ return false;}
    }

    public String getNombrecarrera() {
        return nombrecarrera;
    }

    public void setNombrecarrera(String nombrecarrera) {
        this.nombrecarrera = nombrecarrera;
    }

    public String getCódigocarrera() {
        return códigocarrera;
    }

    public void setCódigocarrera(String códigocarrera) {
        this.códigocarrera = códigocarrera;
    }

    public int getNrosemestres() {
        return nrosemestres;
    }

    public void setNrosemestres(int nrosemestres) {
        this.nrosemestres = nrosemestres;
    }

    public ArrayList<Estudiante> getEstudianteslist() {
        return estudianteslist;
    }

    public void setEstudianteslist(ArrayList<Estudiante> estudianteslist) {
        this.estudianteslist = estudianteslist;
    }
}