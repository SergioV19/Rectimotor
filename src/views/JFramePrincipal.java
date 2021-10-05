package views;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.BorderLayout;

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
        this.setTitle("APP_NAME");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(M_WIDTH_SIZE, M_HEIGHT_SIZE));
		setPreferredSize(new Dimension((int) (WIDTH_SIZE*0.6), (int) (HEIGHT_SIZE*0.4)));
		setExtendedState(MAXIMIZED_BOTH);
        BorderLayout borderL = new BorderLayout(30, 50);
        this.setLayout(borderL);
        init(control);
        setVisible(true);
    }

    private void init(Controller control) {
		this.setBackground(Color.white);
        JPanelMenu pane = new JPanelMenu(control, WIDTH_SIZE, HEIGHT_SIZE);
        pane.setSize(60, 60);
		this.add(pane, BorderLayout.CENTER);

	}
    
}
