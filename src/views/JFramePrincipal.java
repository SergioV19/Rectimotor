package views;

import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

import controllers.*;

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
        getContentPane().setBackground(Color.BLACK);
        principalPanel.setBackground(Color.WHITE);
        this.setTitle(APP_NAME);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
		setExtendedState(MAXIMIZED_BOTH);
        this.setUndecorated(true);
        // this.setLayout( new GridLayout(3, 1));
        this.setLayout( new BorderLayout());
        init(control);
        setVisible(true);
        this.add(principalPanel, BorderLayout.CENTER);
    }

    private void init(Controller control) {
        JPanel miniPanel = new JPanel(new BorderLayout());
        miniPanel.setBorder(new EmptyBorder(0,0, (int)HEIGHT_SIZE/4, 0));
        JButton closeButton = new JButton("cerrar");
        closeButton.setBorder(new RoundedBorder(15));
        closeButton.setBackground(Color.WHITE);
        closeButton.setActionCommand(Commands.CLOSE.name());
        
        miniPanel.add(closeButton, BorderLayout.EAST);
        miniPanel.setBackground(Color.WHITE);
        miniPanel.setSize(new Dimension(1,1));
        principalPanel.setLayout(new GridLayout(3,1));
		this.setBackground(Color.white);
        JPanelMenu pane = new JPanelMenu(control, WIDTH_SIZE, HEIGHT_SIZE);
        principalPanel.add(miniPanel, BorderLayout.NORTH);
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
        JPanel selectOrder = new JPanelListOrder("holi", "1212", objList);

        principalPanel.removeAll();
        principalPanel.setLayout(new BorderLayout());
        principalPanel.add(selectOrder, BorderLayout.CENTER);
        principalPanel.repaint();
        principalPanel.revalidate();
    }
    
}
