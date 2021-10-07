package views;

import javax.swing.*;
import java.awt.*;

public class newPart extends JPanel{
     public JCheckBox cBox;
     public JSpinner localSpinner;
     public JTextField textF;

    public newPart(String name){
        this.setLayout(new BorderLayout());
        cBox = new JCheckBox(name);
        localSpinner = new JSpinner();
        textF = new JTextField();
        this.add(cBox, BorderLayout.WEST);
        // this.add(localSpinner, BorderLayout.CENTER);
        this.add(textF, BorderLayout.WEST);
    }
}
