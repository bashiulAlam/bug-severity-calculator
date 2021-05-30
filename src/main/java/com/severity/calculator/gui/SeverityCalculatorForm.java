package com.severity.calculator.gui;

import com.severity.calculator.assign.AssignSeverityLevel;
import com.severity.calculator.assign.CalculateSeverityValue;
import com.severity.calculator.model.options.ImpactQuestionOptions;
import com.severity.calculator.model.questions.Questions;
import com.severity.calculator.utils.PromptComboBoxRenderer;
import com.severity.calculator.utils.Utility;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SeverityCalculatorForm extends JFrame implements ActionListener {
    private ArrayList<String> optionList = new ArrayList<String>();
    public ArrayList<String> amswers = new ArrayList<String>();

    private Container c;
    private JLabel title;
    private JLabel impactQuestionLabel;
    private JComboBox impactQuestionDropDownOptions;
    private JButton calculate;
    private JButton reset;
    private JLabel calculatedSeverity;

    public SeverityCalculatorForm() {
        setTitle("Severity Calculator");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Severity Calculator");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        impactQuestionLabel = new JLabel(Questions.QUESTION_1.getQuestion());
        impactQuestionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        impactQuestionLabel.setSize(1000, 20);
        impactQuestionLabel.setLocation(100, 100);
        c.add(impactQuestionLabel);

        ImpactQuestionOptions[] impactQuestionOptions = ImpactQuestionOptions.values();
        for (ImpactQuestionOptions options : impactQuestionOptions) {
            optionList.add(options.getOption());
        }
        impactQuestionDropDownOptions = new JComboBox(Utility.arrayListToStrArrayConverter(optionList));
        impactQuestionDropDownOptions.setRenderer(new PromptComboBoxRenderer("Please Select"));
        impactQuestionDropDownOptions.setFont(new Font("Arial", Font.PLAIN, 14));
        impactQuestionDropDownOptions.setSize(300, 30);
        impactQuestionDropDownOptions.setLocation(100, 140);
        impactQuestionDropDownOptions.setSelectedIndex(-1);
        c.add(impactQuestionDropDownOptions);

        calculate = new JButton("Calculate");
        calculate.setFont(new Font("Arial", Font.PLAIN, 15));
        calculate.setSize(100, 20);
        calculate.setLocation(150, 450);
        calculate.addActionListener(this);
        c.add(calculate);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);

        calculatedSeverity = new JLabel("");
        calculatedSeverity.setFont(new Font("Arial", Font.PLAIN, 20));
        calculatedSeverity.setSize(500, 25);
        calculatedSeverity.setLocation(100, 500);
        c.add(calculatedSeverity);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculate) {

            String selectedValue = (String)impactQuestionDropDownOptions.getSelectedItem();
            amswers.clear();
            amswers.add(selectedValue);
            int severityValue = CalculateSeverityValue.severityValue(amswers);
            String severityLevel = AssignSeverityLevel.severityLevel(severityValue);

            calculatedSeverity.setText(severityLevel);
        }
    }
}
