package views;

import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.*;

import java.awt.*;

import controllers.Controller;

public class JFramePrincipal extends JFrame{

    private static final long serialVersionUID = 1L;

    public static Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    public static final int WIDTH_SIZE = (int) (dimension.getWidth());
    public static final int HEIGHT_SIZE = (int) (dimension.getHeight());
	public static final int M_WIDTH_SIZE = (int) (dimension.getWidth()*0.7);
	public static final int M_HEIGHT_SIZE = (int) (dimension.getHeight()*0.5);
    public static final String APP_NAME = "Rectimotor app";
    public JPanel principalPanel;

    public JFramePrincipal(Controller control){
        this.principalPanel = new JPanel (new BorderLayout());
        getContentPane().setBackground(Color.WHITE);
        principalPanel.setBackground(Color.WHITE);
        this.setTitle(APP_NAME);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
		setExtendedState(MAXIMIZED_BOTH);
        // this.setLayout( new GridLayout(3, 1));
        this.setLayout( new BorderLayout());
        init(control);
        setVisible(true);
        this.add(principalPanel, BorderLayout.CENTER);
    }

    private void init(Controller control) {
        principalPanel.setLayout(new GridLayout(3,1));
		this.setBackground(Color.white);
        JPanelMenu pane = new JPanelMenu(control, WIDTH_SIZE, HEIGHT_SIZE);
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.WHITE);
        principalPanel.add(panel1, BorderLayout.NORTH);
		principalPanel.add(pane, BorderLayout.CENTER);

	}

    public void loadAddOrderPanel(Controller control){
        JPanelOrder pane = new JPanelOrder(control);
        principalPanel.removeAll();
        principalPanel.setLayout(new BorderLayout());
        principalPanel.add(pane, BorderLayout.CENTER);
        principalPanel.repaint();
        principalPanel.revalidate();
    }

    public void loadSelectOrderPanel(Controller control){
        ArrayList<Object[]> objList = new ArrayList<Object[]>();
        objList.add(new Object[]{2,2});
        objList.add(new Object[]{1,2});
        objList.add(new Object[]{2,2});
        objList.add(new Object[]{1,2});
        objList.add(new Object[]{2,2});
        objList.add(new Object[]{1,2});
        objList.add(new Object[]{2,2});
        objList.add(new Object[]{1,2});
        objList.add(new Object[]{2,2});
        objList.add(new Object[]{1,2});
        objList.add(new Object[]{2,2});
        objList.add(new Object[]{1,2});
        objList.add(new Object[]{2,2});
        objList.add(new Object[]{1,2});
        objList.add(new Object[]{2,2});
        objList.add(new Object[]{1,2});
        objList.add(new Object[]{2,2});
        objList.add(new Object[]{1,2});
        objList.add(new Object[]{2,2});
        objList.add(new Object[]{1,2});
        objList.add(new Object[]{2,2});
        objList.add(new Object[]{1,2});
        JPanel selectOrder = new JPanelListOrder("holi", "1212", objList);

        principalPanel.removeAll();
        principalPanel.setLayout(new BorderLayout());
        principalPanel.add(selectOrder, BorderLayout.CENTER);
        principalPanel.repaint();
        principalPanel.revalidate();
    }
    
}
