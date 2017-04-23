/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confirmarcorreo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Jonathan
 */
public class PanelTitulo extends JPanel{
    private JLabel imagen;
    
     private JLabel etiquetaNombre;
     
     private JLabel etiquetaDiscoTienda;

    public PanelTitulo() {
        setBackground(Color.WHITE);
        FlowLayout layout = new FlowLayout();
        layout.setHgap(0);
        layout.setVgap(0);
        setLayout(null);
        
        setBorder(new LineBorder(Color.GRAY));
        
        ImageIcon icon = new ImageIcon("images/logo.JPG");        
        imagen = new JLabel();
        imagen.setIcon(icon);
        imagen.setBounds(10, 10, 100, 130);
        add(imagen);
        
        etiquetaNombre = new JLabel("Jonathan Sosa ");
        etiquetaNombre.setBounds(200, 10, 200, 20);
        etiquetaNombre.setFont(new Font("Serif", Font.BOLD, 18));
        etiquetaNombre.setForeground(Color.red);
        add(etiquetaNombre);
        
        
        
        
    }
     
     
}
