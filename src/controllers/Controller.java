package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.JFramePrincipal;
public class Controller implements ActionListener{

    private JFramePrincipal view;

    public Controller(){
        view = new JFramePrincipal(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            
            switch (Commands.valueOf(e.getActionCommand())) {
                case ADD_ORDER:
                    view.loadAddOrderPanel(this);
                    break;
                
                case UPDATE_ORDER:

                    break;
                
                case SEARCH_ORDER:
                    view.loadSelectOrderPanel(this);
                    break;
            
                default:
                    break;
            }
        } catch (Exception f) {
            f.printStackTrace();
        }
    }
    
}
