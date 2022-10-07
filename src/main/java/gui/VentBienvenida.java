package gui;
import controller.UniversidadController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import model.Carrera;
public class VentBienvenida extends ventanamodel{

    private JButton botonRegistrarEst,botonRegistrarCarr,botonBuscarest,botonSalir;
    private UniversidadController uni;
    public VentBienvenida() {
        super("INTRANET UFRO", 500, 520);
        generarElementosVentana();
        ArrayList<Carrera>carrera= new ArrayList<>();
        this.uni = new UniversidadController(carrera);
    }
    private void generarElementosVentana(){
        generarbtnRegistrarCarrera();
        generarbtnRegistrarEst();
        generarbtnBuscarest();
        generarbtnSalir();
    }

    private void generarbtnRegistrarEst() {
        String textoBoton = "Registrar Estudiante";
        this.botonRegistrarEst = super.generarBoton(textoBoton, 175, 100, 150, 40);
        this.add(this.botonRegistrarEst);
        this.botonRegistrarEst.addActionListener(this);

    }
    private void generarbtnRegistrarCarrera() {
        String textoBoton = "Registrar Carrera";
        this.botonRegistrarCarr = super.generarBoton(textoBoton, 175, 200, 150, 40);
        this.add(this.botonRegistrarCarr);
        this.botonRegistrarCarr.addActionListener(this);
    }

    private void generarbtnBuscarest(){
        String textoBoton = "Buscar Estudiante";
        this.botonBuscarest = super.generarBoton(textoBoton, 175, 300, 150, 40);
        this.add(this.botonBuscarest);
        this.botonBuscarest.addActionListener(this);
    }

    private void generarbtnSalir(){
        String textoBoton = "Salir";
        this.botonSalir = super.generarBoton(textoBoton, 175, 400, 150, 40);
        this.add(this.botonSalir);
        this.botonSalir.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonRegistrarCarr) {
            VentanaRegistroCarrera ventanaRegistrarCarr= new VentanaRegistroCarrera(uni);
            //Cierra la ventana actual
            this.dispose();
        }
        if(e.getSource() == this.botonRegistrarEst){
            VentanaRegistroEstudiante ventanaRegistroEst= new VentanaRegistroEstudiante();
            this.dispose();
        }
        if(e.getSource() == this.botonBuscarest){
            VentanaBusquedaCliente ventanaBusquedaEst= new VentanaBusquedaCliente();
            this.dispose();
        }

        if(e.getSource() == this.botonSalir){
            this.dispose();
            System.exit(0);
        }
    }


}