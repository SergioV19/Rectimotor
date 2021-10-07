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

    public newPart(String name, int parts, String size){
        this.setBackground(Color.WHITE);
        GridLayout grid = new GridLayout(1, 3, 15, 10);
        this.setLayout(grid);
        cBox = new JCheckBox(name);
        cBox.setSelected(true);
        cBox.setEnabled(false);
        cBox.setBackground(Color.WHITE);
        localSpinner = new JSpinner();
        localSpinner.setValue(parts);
        localSpinner.setEnabled(false);
        textF = new JTextField();
        textF.setText(size);
        textF.setEnabled(false);
        this.add(cBox);
        this.add(localSpinner);
        this.add(textF);

        setVisible(true);
    }

    public void setToValidate(){
        cBox.setEnabled(false);
        localSpinner.setEnabled(false);
        textF.setEnabled(false);
    }
}
