package views;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.Controller;
import controllers.Commands;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridLayout;

public class JPanelMenu extends JPanel{
    
    private static final long serialVersionUID = 1L;

    public JPanelMenu(Controller control){
        this.setLayout(new GridLayout(1, 3, 15, 15) );
        this.setBorder(new EmptyBorder(80, 80, 80, 80));
        this.setBackground(Color.WHITE);
        init(control);
        setVisible(true);
    }

    private void init(Controller control) {
        JButton addMotor = new JButton("registrar orden de ingreso");
        addMotor.setBackground(Color.WHITE);
        addMotor.setActionCommand(Commands.ADD_ORDER.name());
        addMotor.addActionListener(control);
        JButton deleteMotor = new JButton("Actualizar orden");
        deleteMotor.setBackground(Color.WHITE);
        deleteMotor.setActionCommand(Commands.UPDATE_ORDER.name());
        deleteMotor.addActionListener(control);
        JButton showMotor = new JButton("Buscar órdenes generadas");
        showMotor.setBackground(Color.WHITE);
        showMotor.setActionCommand(Commands.SEARCH_ORDER.name());
        showMotor.addActionListener(control);

    }
}
