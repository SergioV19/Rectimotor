package views;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.DimensionUIResource;

import controllers.Controller;
import controllers.Commands;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Dimension;

public class JPanelMenu extends JPanel{
    
    private static final long serialVersionUID = 1L;

    public JPanelMenu(Controller control, int width, int height){
        this.setLayout(new GridLayout(1, 3, 15, 15) );
        setPreferredSize(new Dimension((int) (width*0.8), (int) (height*0.5)));
        this.setBorder(new EmptyBorder((int) (height*0.05), (int) (width*0.1),
        (int) (height*0.05), (int) (width*0.1)));
        this.setBackground(Color.WHITE);
        init(control);
        setVisible(true);
    }

    private void init(Controller control) {
        JButton addMotor = new JButton("registrar orden de ingreso");
        addMotor.setBackground(Color.WHITE);
        addMotor.setActionCommand(Commands.ADD_ORDER.name());
        addMotor.addActionListener(control);
        setBorder(new EmptyBorder(10, 50, 10, 50));
        JButton updateMotor = new JButton("Actualizar orden");
        updateMotor.setBackground(Color.WHITE);
        updateMotor.setActionCommand(Commands.UPDATE_ORDER.name());
        updateMotor.addActionListener(control);
        JButton searchMotor = new JButton("Buscar órdenes generadas");
        searchMotor.setBackground(Color.WHITE);
        searchMotor.setActionCommand(Commands.SEARCH_ORDER.name());
        searchMotor.addActionListener(control);

        add(addMotor);
        add(updateMotor);
        add(searchMotor);
    }
}
