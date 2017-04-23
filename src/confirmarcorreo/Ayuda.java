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

/**
 *
 * @author Jonathan
 */
public class Ayuda extends JDialog implements ActionListener{
 private static final String SALIR = "SALIR";
    
    private JLabel mensaje;
    
    private JButton salir;
    
    JPanel panel;   

    public Ayuda() {
         setSize(400, 300);
       
        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        add(panel);
      
        setTitle( "Ayuda" );
        setLocationRelativeTo(null);
        setDefaultCloseOperation( JDialog.DISPOSE_ON_CLOSE);
        setLayout( null);
   
        
        mensaje = new JLabel ("Bienvenido, a continuacion se dara una breve explicacion del funcionamiento del programa."
                + " en el espacio de texto que puede observar, podra ingresar su direccion de correo electronico "
                + "despues de ingresar la cuarta letra de su correo se evaluara si es o no una direccion valida"
                + " lo sabra pues en la parte inferior del espacion aparecera un mensaje de ayuda "
                + "en el mostrara si es una direccion valida o no,"
                + " en caso de no ser valida, mostrara por que no se considera una direccion de correo valida,"
                + " al momento de digitar una direccion valida se guardara automaticamente en nuestro sistema,"
                + " la lista de las direcciones de correo validas, se podran observar dando click en la pestaña ver opcion info,"
                + " espero le disfrute del funcionamiento del programa.");
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
     
    }
    
    


}
