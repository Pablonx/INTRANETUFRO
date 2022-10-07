package gui;

import controller.UniversidadController;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaRegistroCarrera extends ventanamodel {
    private JLabel textoEncabezado,textoNombre,textoCodigo, textoNroSemestres;
    private JTextField camponombre, campoCod, campoNumerosem;
    private JButton btnRegistrar, btnCancelar;

    private UniversidadController uni;
    public VentanaRegistroCarrera(UniversidadController uni) {
        super("REGISTRO DE CARRERA", 500, 520);
        generarElementosVentana();
        this.uni=uni;
    }

    private void generarElementosVentana() {
        generarEncabezado();
        generarBotonCancelar();
        generarBotonRegistrar();
        generarCampoNombre();
        generarCampoCod();
        generarcampoNroSem();
    }
    private void generarEncabezado() {
        String textoCabecera = "Registro de Carerra";
        super.generarJLabelEncabezado(this.textoEncabezado, textoCabecera, 190, 10, 200, 50);
    }
    private void generarBotonRegistrar() {
        String textoBoton= "Registrar Cliente";
        this.btnRegistrar = super.generarBoton(textoBoton, 75, 400, 150, 20);
        this.add(this.btnRegistrar);
        this.btnRegistrar.addActionListener(this);
    }
    private void generarBotonCancelar() {
        String textoBotonCancelar = "Cancelar";
        this.btnCancelar = super.generarBoton(textoBotonCancelar, 275, 400, 150, 20);
        this.add(this.btnCancelar);
        this.btnCancelar.addActionListener(this);
    }

    private void generarCampoNombre(){
        String textoNombre= "Nombre:";
        super.generarJLabel(this.textoNombre,textoNombre,20,50,150,20);
        this.camponombre= super.generarJTextField(200,50,250,20);
        this.add(this.camponombre);
    }
    private void generarCampoCod(){
        String textoCodigo= "Codigo de Carrera:";
        super.generarJLabel(this.textoCodigo,textoCodigo,20,100,150,20);
        this.campoCod= super.generarJTextField(200,100,250,20);
        this.add(this.campoCod);
    }

    private void generarcampoNroSem(){
        String textoNroSem= "Numero de Semestres:";
        super.generarJLabel(this.textoNroSemestres,textoNroSem,20,150,150,20);
        this.campoNumerosem= super.generarJTextField(200,150,250,20);
        this.add(this.campoNumerosem);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.btnRegistrar) {

            if (uni.buscarcarrera(this.campoCod.getText())) {
                    JOptionPane.showMessageDialog(this, "Carrera ya ha sido registrada");
                    VentBienvenida ventanaMenuBienvenida = new VentBienvenida();
                    this.dispose();
            }else{
                    JOptionPane.showMessageDialog(this, "Carrera registrada exitosamente");
                    VentBienvenida ventanaMenuBienvenida = new VentBienvenida();
                    this.dispose();
                }
        }
        if (e.getSource() == this.btnCancelar){
            VentBienvenida ventanaMenuBienvenida = new VentBienvenida();
            this.dispose();
        }
        }
























}