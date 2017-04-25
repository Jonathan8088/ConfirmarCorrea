/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confirmarcorreo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;


/**
 *
 * @author Jonathan
 */
public class PanelCorreo extends JPanel implements Interface, ActionListener{
    
    
    
     /**
     * area donde sera escrito el correo
     */
    private JTextArea areaCorreo;
    /**
     * etiqueta que mostrara el mensaje digite su correo
     */
    private JLabel digitar;
    /**
     * etiqueta que mostrara el menaje validando el correo
     */
    private JLabel aviso;

    public PanelCorreo() {
        
        setBackground(Color.lightGray);
        FlowLayout layout = new FlowLayout();
        layout.setHgap(0);
        layout.setVgap(0);
        setLayout(null);
        
        setBorder(new LineBorder(Color.GRAY));
        
        digitar = new JLabel("Digite su correo: ");
        digitar.setBounds(100, 100, 100, 20);
        digitar.setForeground(Color.darkGray);
        add(digitar);
        
        areaCorreo = new JTextArea();
        areaCorreo.setBounds(250, 100, 200, 20);
        add(areaCorreo);
        boolean r = ValidarCorreo(areaCorreo.getText());
        RetornarRespuesta(r);
        
        aviso = new JLabel("Digite su correo: ");
        aviso.setBounds(250, 130, 100, 20);
        add(aviso);
      
        
    }

    
    

    @Override
    public boolean ValidarCorreo(String email) {
        Pattern p = Pattern.compile("[a-zA-Z0-9]+[.[a-zA-Z0-9_-]+]*@[a-z0-9][\\w\\.-]*[a-z0-9]\\.[a-z][a-z\\.]*[a-z]$");
        Matcher m = p.matcher(email);
        return m.matches();
    }

    @Override
    public void RetornarRespuesta(boolean r) {
       if(r==true){
           aviso = new JLabel("correo valido ");
           aviso.setBounds(250, 130, 100, 20);
           add(aviso);
       }else{
           aviso = new JLabel("correo invalido ");
           aviso.setBounds(250, 130, 100, 20);
           add(aviso);
       } 
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
    }
}
