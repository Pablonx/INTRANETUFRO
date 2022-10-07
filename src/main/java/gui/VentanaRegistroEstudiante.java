package gui;

import model.*;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaRegistroEstudiante extends ventanamodel {
    private JLabel textoEncabezado,textoNombre,textoApellido, textoRut, textoNromat;
    private JTextField camponombre, campoApellido, campoRut,campoNromat;
    private JButton btnRegistrar, btnCancelar;

    private Carrera carrera;

    public VentanaRegistroEstudiante(Carrera carrera) {
        super("Registro de Estudiante", 500, 520);
        this.carrera=carrera;
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarEncabezado();
        generarBotonCancelar();
        generarBotonRegistrar();
        generarCampoNombre();
        generarCampoApellido();
        generarcampoRut();
        generarcampoNroMat();
    }
    private void generarEncabezado() {
        String textoCabecera = "Registro de Estudiante";
        super.generarJLabelEncabezado(this.textoEncabezado, textoCabecera, 190, 10, 200, 50);
    }
    private void generarBotonRegistrar() {
        String textoBoton= "Registrar Estudiante";
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
    private void generarCampoApellido(){
        String textoApellido= "Apellido:";
        super.generarJLabel(this.textoApellido,textoApellido,20,100,150,20);
        this.campoApellido= super.generarJTextField(200,100,250,20);
        this.add(this.campoApellido);
    }

    private void generarcampoRut(){
        String textoRut= "Rut:";
        super.generarJLabel(this.textoRut,textoRut,20,100,150,20);
        this.campoRut= super.generarJTextField(200,100,250,20);
        this.add(this.campoRut);
    }
    private void generarcampoNroMat(){
        String NroMat= "Número de Matricula:";
        super.generarJLabel(this.textoNromat,NroMat,20,100,150,20);
        this.campoNromat= super.generarJTextField(200,100,250,20);
        this.add(this.campoNromat);
    }
    private boolean registrarEstudiante(){
        return carrera.añadirEstudiante(this.camponombre.getText(),this.campoApellido.getText(),this.campoRut.getText(),
                this.campoNromat.getText(), this.CAMPOCARRERA);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.btnRegistrar) {
            if(registrarEstudiante()==true) {
                JOptionPane.showMessageDialog(this,"Estudiante registrado correctamente");
                VentBienvenida ventanaMenuBienvenida = new VentBienvenida();
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this,"Número de matricula ya inscrito");
            }

        }
        if (e.getSource() == this.btnCancelar){
            VentBienvenida ventanaMenuBienvenida = new VentBienvenida();
            this.dispose();
        }

    }















}