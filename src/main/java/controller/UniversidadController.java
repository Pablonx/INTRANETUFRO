package controller;

import model.*;

import java.util.ArrayList;

public class UniversidadController {
    private ArrayList<Carrera> CarrerasList;

    public UniversidadController(ArrayList<Carrera> carrerasList) {
        CarrerasList = carrerasList;
    }

    public ArrayList<Carrera> getCarrerasList() {
        return CarrerasList;
    }

    public void setCarrerasList(ArrayList<Carrera> carrerasList) {
        CarrerasList = carrerasList;
    }

    public boolean buscarcarrera (String A){
        for( Carrera carrera : this.getCarrerasList()){
            if(carrera.getCódigocarrera().equals(A)){

                return true;
            }
        }
        return false;
        }
    }



}