/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jegyzet;

import model.JegyzetModel;
import view.JegyzetForm;

/**
 *
 * @author g
 */
public class Main {
    public static void main(String[] args) {
       JegyzetModel model = new JegyzetModel();
        JegyzetForm view = new JegyzetForm(model.getJegyzeteim());
        view.setVisible(true);
        
    }
}
