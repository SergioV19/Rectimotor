package views;

import javax.swing.*;
import java.awt.*;

public class newPart extends JPanel{
     public JCheckBox cBox;
     public JSpinner localSpinner;
     public JTextField textF;

    public newPart(String name){
        this.setBackground(Color.WHITE);
        GridLayout grid = new GridLayout(1, 3, 15, 10);
        this.setLayout(grid);
        cBox = new JCheckBox(name);
        cBox.setBackground(Color.WHITE);
        localSpinner = new JSpinner();
        textF = new JTextField();
        this.add(cBox);
        this.add(localSpinner);
        this.add(textF);

        setVisible(true);
    }
}
