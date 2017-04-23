/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confirmarcorreo;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;

/**
 *
 * @author Jonathan
 */
public class VentanaPrincipal extends JFrame implements Interface {
    /**
     * atributo que hace referencia a la barra de menu
     */
    private JMenuBar menuBar;
    /**
     * atribbuto que hace referencia al menu especifico
     */
    private JMenu menu;
    
    private PanelTitulo panelImagen;
   
/**
 * constructor de la clase
 * */
    public VentanaPrincipal() {
        setTitle("Confirmar Correo");
        setSize(800, 600);
        setLocationRelativeTo(null);        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        
        menuBar = new JMenuBar();
        
        
        
        
        
        panelImagen = new PanelTitulo( );
        panelImagen.setBounds(10, 10, 780, 200);
        add(panelImagen);
        
        
       
        
        setVisible(true);
    }//constructor
/**
 * metodo de la clase interface que valiuda el correo
 */
    @Override
    public void ValidarCorreo() {
        
    }//ValidarCorreo
/**
 * metodo de la clase interface que retorna el mensaje de validacion del correo
 */
    @Override
    public void RetornarRespuesta() {
       
    }//RetornarRespuesta

    
    
    
    
}//VentanaPrincipal
