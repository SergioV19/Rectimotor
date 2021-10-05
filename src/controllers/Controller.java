package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.ViewManager;

public class Controller implements ActionListener{

    private ViewManager view;

    public Controller(){
        this.view = new ViewManager();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            
            switch (Commands.valueOf(e.getActionCommand())) {
                case ADD_ORDER:
                    
                    break;
                
                case UPDATE_ORDER:
    
                    break;
                
                case SEARCH_ORDER:
    
                    break;
            
                default:
                    break;
            }
        } catch (Exception f) {
            f.printStackTrace();
        }
    }
    
}
