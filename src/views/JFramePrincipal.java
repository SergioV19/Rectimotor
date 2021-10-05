package views;

import java.awt.Toolkit;
import java.lang.reflect.Constructor;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Color;

import controllers.Commands;
import controllers.Controller;

public class JFramePrincipal extends JFrame{

    private static final long serialVersionUID = 1L;

    private static Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	public static final int M_WIDTH_SIZE = (int) (dimension.getWidth()*0.7);
	public static final int M_HEIGHT_SIZE = (int) (dimension.getHeight()*0.5);
    public static final String APP_NAME = "Rectimotor app";

    public JFramePrincipal(Controller control){
        this.setTitle("APP_NAME");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(M_WIDTH_SIZE, M_HEIGHT_SIZE));
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setExtendedState(MAXIMIZED_BOTH);

    }

    private void init(Controller control) {
		this.setBackground(Color.white);
		add(new JPanelMenu(control));
	}
    
}
