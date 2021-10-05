package views;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.GridLayout;

import controllers.Commands;
import controllers.Controller;

public class JFramePrincipal extends JFrame{

    private static final long serialVersionUID = 1L;

    public static Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    public static final int WIDTH_SIZE = (int) (dimension.getWidth());
    public static final int HEIGHT_SIZE = (int) (dimension.getHeight());
	public static final int M_WIDTH_SIZE = (int) (dimension.getWidth()*0.7);
	public static final int M_HEIGHT_SIZE = (int) (dimension.getHeight()*0.5);
    public static final String APP_NAME = "Rectimotor app";

    public JFramePrincipal(Controller control){
        getContentPane().setBackground(Color.WHITE);
        this.setTitle(APP_NAME);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
		setExtendedState(MAXIMIZED_BOTH);
        this.setLayout( new GridLayout(3, 1));
        init(control);
        setVisible(true);
    }

    private void init(Controller control) {
		this.setBackground(Color.white);
        JPanelMenu pane = new JPanelMenu(control, WIDTH_SIZE, HEIGHT_SIZE);
        pane.setSize(60, 60);
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.WHITE);
        this.add(panel1);
		this.add(pane);

	}
    
}
