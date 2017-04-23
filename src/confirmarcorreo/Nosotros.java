/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confirmarcorreo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jonathan
 */
public class Nosotros extends JDialog implements ActionListener{

    private static final String SALIR = "SALIR";
    
    private JLabel mensaje;
    
    private JButton salir;
    
    JPanel panel;

    public Nosotros() {
        
        setSize(400, 300);
       
        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        add(panel);
      
        setTitle( "Nosotros" );
        setLocationRelativeTo(null);
        setDefaultCloseOperation( JDialog.DISPOSE_ON_CLOSE);
        setLayout( null);
   
        
        mensaje = new JLabel ("Nombre estudiante: Jonathan Stit Sosa Cortes."
                + "Version: 1.0"
                + "Materia: Programacion 2");
        mensaje.setBounds(20, 20, 50, 20);
        add(mensaje);
        
        salir = new JButton( "Salir" );
        salir.setActionCommand( SALIR );
        salir.addActionListener(this);
        salir.setBounds(100, 130, 100, 20);
        add( salir );
        setVisible(true);
         
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }
    
}
