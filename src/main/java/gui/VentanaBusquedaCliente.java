package gui;

import controller.UniversidadController;
import model.Carrera;
import model.Estudiante;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class VentanaBusquedaCliente extends ventanamodel{
    private JButton botonBuscar, botonRegresar;
    private JLabel textoEncabezado, textoNombre, textoCarr;
    private JComboBox listaCarr;
    private JTextField campoNombre;
    private UniversidadController uni;
    private ArrayList<String> carreras;
    public VentanaBusquedaCliente(UniversidadController uni) {
        super("Búsqueda de Vehículo", 500, 520);
        this.uni= uni;
        generarElementosVentana();
    }
    private void generarElementosVentana() {
        generarCampoNombre();
        generarBotonBuscarEst();
        generarBotonCancelar();
        generarListaCarr();
    }
    private void generarCampoNombre(){
        String textoNombre= "Modelo Vehículo:";
        super.generarJLabel(this.textoNombre,textoNombre,20,50,150,20);
        this.campoNombre= super.generarJTextField(200,50,250,20);
        this.add(this.campoNombre);
    }
    private void generarListaCarr(){
        super.generarJLabel(this.textoCarr,"Carrera:",20,100,100,20);
        for(Carrera auto : uni.getCarrerasList()){

        }
        this.listaCarr=super.generarListaDesplegable(uni.getCarrerasList(),120,100, 100, 20);
        this.add(this.listaCarr);
    }
    private void generarBotonBuscarEst() {
        String textoBoton= "Buscar Estudiante";
        this.botonBuscar = super.generarBoton(textoBoton, 75, 400, 150, 20);
        this.add(this.botonBuscar);
        this.botonBuscar.addActionListener(this);
    }
    private void generarBotonCancelar() {
        String textoBotonRegresar = "Regresar";
        this.botonRegresar = super.generarBoton(textoBotonRegresar, 275, 400, 150, 20);
        this.add(this.botonRegresar);
        this.botonRegresar.addActionListener(this);
    }
  public void registrarEst(){

  }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.botonBuscar){
            String[] nombreColumnas={"Modelo","Marca","Año","Color","Precio","Kilómetros Recorridos"};
            VentanaTabla ventanaTabla= new VentanaTabla(registrarEst(),nombreColumnas);
        }
        if (e.getSource() == this.botonRegresar){
            VentBienvenida ventanaMenuBienvenida = new VentBienvenida();
            this.dispose();
        }

    }








}