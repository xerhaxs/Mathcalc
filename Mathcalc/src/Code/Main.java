package Code;

import GUI.CalcGUI;

import javax.swing.*;

public class Main {
    public static void main(String [] args) {
        JFrame frame = new JFrame("Calc");
        frame.setContentPane(new CalcGUI().panelMain);
        frame.setSize(500,800);
        frame.pack();
        frame.setVisible(true);
    }
}
