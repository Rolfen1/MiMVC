package mimvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Pc
 */
public class Controlador1 implements ActionListener{
    private Ventana1 ventana;

    public Controlador1(Ventana1 ventana){
        this.ventana=ventana;
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("boton1")){
            ventana.settxtLabel1("Criss hijo e la perra");
        }
        if(ae.getActionCommand().equals("boton2")){
            ventana.settxtLabel1("Maldito culiao");
        }
    }
    
}
