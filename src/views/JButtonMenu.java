package views;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import java.awt.BorderLayout;
import java.awt.Color;

public class JButtonMenu extends JButton{

    public JButtonMenu(String text, Icon rescaled){
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BorderLayout());
        JLabel txt = new JLabel(text);
        txt.setHorizontalAlignment(SwingConstants.CENTER);
        buttonPanel.add(txt, BorderLayout.CENTER);
        buttonPanel.add(new JLabel(rescaled), BorderLayout.SOUTH);
        buttonPanel.setBackground(Color.WHITE);
        this.add(buttonPanel);
        this.setBorder(new RoundedBorder(15));
        this.setBackground(Color.WHITE);
    }
    
}
