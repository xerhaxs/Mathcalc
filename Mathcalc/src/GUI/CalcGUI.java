package GUI;

import Code.Fracture;
import Code.Calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class CalcGUI {
    public JPanel panelMain;
    private JButton setInputDenominatorButton;
    private JButton setInputNumeratorButton;
    private JTextField setInputNumeratorTextField;
    private JTextField setInputDenominatorTextField;
    private JTextField OutputNumeratorTextField;
    private JButton setCalcFractureReciprocalButton;
    private JTextField OutputDenominatorTextField;
    private JTextField setExpandValueTextField;
    private JButton setExpandButton;
    private JTextField setShortenValueTextField;
    private JButton setShortenButton;
    private JTextField OutputDecimalNumberTextField;
    private JButton setShortCompletleyButton;
    private JTextField numerator2JTextField;
    private JTextField denominator2JTextField;
    private JTextField numerator3JTextField;
    private JTextField denominator3JTextField;
    private JTextField operationJTextField;
    private JTextField numerator4JTextField;
    private JTextField denominator4JTextField;
    private JButton calcFractureJButton;
    private JTextField greatestDividerTextField;

    Fracture fracture1 = new Fracture(1, 1);
    Calc Calc1 = new Calc();
    Fracture fracture2 = new Fracture(1, 1);
    Fracture fracture3 = new Fracture(1, 1);


    public CalcGUI() {
        setInputNumeratorButton.addActionListener(e -> {
            fracture1.setNumerator(Integer.parseInt(setInputNumeratorTextField.getText()));
            OutputNumeratorTextField.setText(String.valueOf(fracture1.getNumerator()));
            OutputDenominatorTextField.setText(String.valueOf(fracture1.getDenominator()));
            OutputDecimalNumberTextField.setText(String.valueOf(fracture1.getDecimal()));
        });
        setInputDenominatorButton.addActionListener(e -> {
            fracture1.setDenominator(Integer.parseInt(setInputDenominatorTextField.getText()));
            OutputNumeratorTextField.setText(String.valueOf(fracture1.getNumerator()));
            OutputDenominatorTextField.setText(String.valueOf(fracture1.getDenominator()));
            OutputDecimalNumberTextField.setText(String.valueOf(fracture1.getDecimal()));
        });
        setExpandButton.addActionListener(e -> {
            fracture1.expand(Integer.parseInt(setExpandValueTextField.getText()));
            OutputNumeratorTextField.setText(String.valueOf(fracture1.getNumerator()));
            OutputDenominatorTextField.setText(String.valueOf(fracture1.getDenominator()));
            OutputDecimalNumberTextField.setText(String.valueOf(fracture1.getDecimal()));
        });
        setShortenButton.addActionListener(e -> {
            fracture1.shorten(Integer.parseInt(setShortenValueTextField.getText()));
            OutputNumeratorTextField.setText(String.valueOf(fracture1.getNumerator()));
            OutputDenominatorTextField.setText(String.valueOf(fracture1.getDenominator()));
            OutputDecimalNumberTextField.setText(String.valueOf(fracture1.getDecimal()));
        });

        setCalcFractureReciprocalButton.addActionListener(e -> {
            fracture1.reciprocal();
            OutputNumeratorTextField.setText(String.valueOf(fracture1.getNumerator()));
            OutputDenominatorTextField.setText(String.valueOf(fracture1.getDenominator()));
            OutputDecimalNumberTextField.setText(String.valueOf(fracture1.getDecimal()));
        });
        setShortCompletleyButton.addActionListener(e -> {
            greatestDividerTextField.setText(String.valueOf(fracture1.getGCD()));
            fracture1.shortenCompleteley();
            OutputNumeratorTextField.setText(String.valueOf(fracture1.getNumerator()));
            OutputDenominatorTextField.setText(String.valueOf(fracture1.getDenominator()));
            OutputDecimalNumberTextField.setText(String.valueOf(fracture1.getDecimal()));
        });

        calcFractureJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calc1.connectFracture1(fracture2);
                Calc1.connectFracture2(fracture3);
                fracture2.setNumerator(Integer.parseInt(numerator2JTextField.getText()));
                fracture2.setDenominator(Integer.parseInt(denominator2JTextField.getText()));
                fracture3.setNumerator(Integer.parseInt(numerator3JTextField.getText()));
                fracture3.setDenominator(Integer.parseInt(denominator3JTextField.getText()));
                if (Objects.equals(operationJTextField.getText(), "+")) {
                    numerator4JTextField.setText(String.valueOf(Calc1.getSum().getNumerator()));
                    denominator4JTextField.setText(String.valueOf(Calc1.getSum().getDenominator()));
                    System.out.println("Calc: +");
                } else if (Objects.equals(operationJTextField.getText(), "-")) {
                    numerator4JTextField.setText(String.valueOf(Calc1.getDiff().getNumerator()));
                    denominator4JTextField.setText(String.valueOf(Calc1.getDiff().getDenominator()));
                    System.out.println("Calc: -");
                } else if (Objects.equals(operationJTextField.getText(), "*")) {
                    numerator4JTextField.setText(String.valueOf(Calc1.getProduct().getNumerator()));
                    denominator4JTextField.setText(String.valueOf(Calc1.getProduct().getDenominator()));
                    System.out.println("Calc: *");
                } else if (Objects.equals(operationJTextField.getText(), "/")) {
                    numerator4JTextField.setText(String.valueOf(Calc1.getQuotient().getNumerator()));
                    denominator4JTextField.setText(String.valueOf(Calc1.getQuotient().getDenominator()));
                    System.out.println("Calc: /");
                }
            }
        });
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panelMain = new JPanel();
        panelMain.setLayout(new GridBagLayout());
        panelMain.setEnabled(true);
        setInputDenominatorTextField = new JTextField();
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(setInputDenominatorTextField, gbc);
        setInputNumeratorTextField = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(setInputNumeratorTextField, gbc);
        setInputDenominatorButton = new JButton();
        setInputDenominatorButton.setText("Set Denominator");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(setInputDenominatorButton, gbc);
        setInputNumeratorButton = new JButton();
        setInputNumeratorButton.setText("Set Numerator");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(setInputNumeratorButton, gbc);
        final JPanel spacer1 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(spacer1, gbc);
        setCalcFractureReciprocalButton = new JButton();
        setCalcFractureReciprocalButton.setText("Calc Reciprocal");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 11;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(setCalcFractureReciprocalButton, gbc);
        OutputNumeratorTextField = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 11;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(OutputNumeratorTextField, gbc);
        OutputDenominatorTextField = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 12;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(OutputDenominatorTextField, gbc);
        final JPanel spacer2 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelMain.add(spacer2, gbc);
        final JPanel spacer3 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelMain.add(spacer3, gbc);
        final JPanel spacer4 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 10;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(spacer4, gbc);
        setExpandValueTextField = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(setExpandValueTextField, gbc);
        final JPanel spacer5 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(spacer5, gbc);
        final JPanel spacer6 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 9;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(spacer6, gbc);
        setExpandButton = new JButton();
        setExpandButton.setText("Set Expand");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(setExpandButton, gbc);
        setShortenValueTextField = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 7;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(setShortenValueTextField, gbc);
        setShortenButton = new JButton();
        setShortenButton.setText("Set Shorten");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(setShortenButton, gbc);
        OutputDecimalNumberTextField = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 14;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(OutputDecimalNumberTextField, gbc);
        numerator2JTextField = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(numerator2JTextField, gbc);
        denominator2JTextField = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(denominator2JTextField, gbc);
        numerator3JTextField = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 10;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(numerator3JTextField, gbc);
        denominator3JTextField = new JTextField();
        denominator3JTextField.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 10;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(denominator3JTextField, gbc);
        operationJTextField = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 2;
        gbc.weightx = 0.5;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(operationJTextField, gbc);
        final JPanel spacer7 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(spacer7, gbc);
        final JPanel spacer8 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelMain.add(spacer8, gbc);
        numerator4JTextField = new JTextField();
        numerator4JTextField.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 13;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(numerator4JTextField, gbc);
        denominator4JTextField = new JTextField();
        denominator4JTextField.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 13;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(denominator4JTextField, gbc);
        calcFractureJButton = new JButton();
        calcFractureJButton.setText("Calc Fracture");
        gbc = new GridBagConstraints();
        gbc.gridx = 13;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(calcFractureJButton, gbc);
        final JPanel spacer9 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 8;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelMain.add(spacer9, gbc);
        setShortCompletleyButton = new JButton();
        setShortCompletleyButton.setText("Short Completley");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(setShortCompletleyButton, gbc);
        greatestDividerTextField = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 8;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(greatestDividerTextField, gbc);
        final JPanel spacer10 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelMain.add(spacer10, gbc);
        final JPanel spacer11 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelMain.add(spacer11, gbc);
        final JPanel spacer12 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelMain.add(spacer12, gbc);
        final JPanel spacer13 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 13;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(spacer13, gbc);
        final JPanel spacer14 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 8;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelMain.add(spacer14, gbc);
        final JLabel label1 = new JLabel();
        label1.setText("Fracture Calc");
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 0;
        panelMain.add(label1, gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panelMain;
    }

}
