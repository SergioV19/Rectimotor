package views;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.DimensionUIResource;

import controllers.Controller;
import controllers.Commands;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class JPanelMenu extends JPanel{
    
    private static final long serialVersionUID = 1L;
    public static final String PATH_IMAGE_ADD_ORDER = "src/images/Image_Add_Order.png";
    public static final String PATH_IMAGE_SEARCH_ORDER = "src\images\Image_Search_Order.png";
    public static final String PATH_IMAGE_UPDATE_ORDER = "src\images\Image_Update_Order.png";

    public int WIDTH = 0;
    public int HEIGHT = 0;

    public JPanelMenu(Controller control, int width, int height){
        this.WIDTH = width;
        this.HEIGHT = height;
        this.setLayout(new GridLayout(1, 3, 15, 15) );
        setPreferredSize(new Dimension((int) (width*0.8), (int) (height*0.5)));
        this.setBorder(new EmptyBorder((int) (height*0.05), (int) (width*0.1),
        (int) (height*0.05), (int) (width*0.1)));
        this.setBackground(Color.WHITE);
        init(control);
        setVisible(true);
    }

    private void init(Controller control) {
        Image addImage = new ImageIcon(getClass().getResource(PATH_IMAGE_ADD_ORDER)).getImage();
		Icon rescaledAdd = new ImageIcon(addImage.getScaledInstance((int) (WIDTH * 0.03),
					(int) (WIDTH * 0.03), Image.SCALE_SMOOTH));
        JButton addMotor = new JButtonMenu("Registrar orden de ingreso", rescaledAdd);
        addMotor.setActionCommand(Commands.ADD_ORDER.name());
        addMotor.addActionListener(control);

        JButton updateMotor = new JButtonMenu("Actualizar orden", null);
        updateMotor.setActionCommand(Commands.UPDATE_ORDER.name());
        updateMotor.addActionListener(control);
        JButton searchMotor = new JButtonMenu("Buscar órdenes generadas", null);
        searchMotor.setActionCommand(Commands.SEARCH_ORDER.name());
        searchMotor.addActionListener(control);

        add(addMotor);
        add(updateMotor);
        add(searchMotor);
    }
}
