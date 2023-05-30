/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jegyzet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.JegyzetModel;
import view.JegyzetForm;

/**
 *
 * @author g
 */
public class Main {
    private static JegyzetForm view;
    public static void main(String[] args) {
       JegyzetModel model = new JegyzetModel();
        view = new JegyzetForm(model.getJegyzeteim());
        view.setVisible(true);
        
        
        
        view.addKepListener(new KepListener());
    
    }
    public static class KepListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.showImg();
        }
    }
}
