package com.severity.calculator.gui;

import com.severity.calculator.assign.AssignSeverityLevel;
import com.severity.calculator.assign.CalculateSeverityValue;
import com.severity.calculator.exception.OptionNotSelectedException;
import com.severity.calculator.exception.SumOutOfAllowedRangeException;
import com.severity.calculator.model.options.CriteriaQuestionOptions;
import com.severity.calculator.model.options.ImpactQuestionOptions;
import com.severity.calculator.model.options.ReleaseQuestionOptions;
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

    public static Container c;
    private JLabel title;
    private JLabel impactQuestionLabel;
    private JComboBox impactQuestionDropDownOptions;
    private JLabel criteriaQuestionLabel;
    private JComboBox criteriaQuestionDropDownOptions;
    private JLabel releaseQuestionLabel;
    private JComboBox releaseQuestionDropDownOptions;
    private JButton calculate;
    private JButton reset;
    private JTextArea textOutput;
    private JLabel severityLabel;
    private JTextArea calculatedSeverity;

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

        optionList.clear();
        ImpactQuestionOptions[] impactQuestionOptions = ImpactQuestionOptions.values();
        for (ImpactQuestionOptions options : impactQuestionOptions) {
            optionList.add(options.getOption());
        }

        impactQuestionDropDownOptions = new JComboBox(Utility.arrayListToStrArrayConverter(optionList));
        impactQuestionDropDownOptions.setRenderer(new PromptComboBoxRenderer("Please Select"));
        impactQuestionDropDownOptions.setFont(new Font("Arial", Font.PLAIN, 14));
        impactQuestionDropDownOptions.setSize(500, 30);
        impactQuestionDropDownOptions.setLocation(100, 120);
        impactQuestionDropDownOptions.setSelectedIndex(-1);
        c.add(impactQuestionDropDownOptions);

        criteriaQuestionLabel = new JLabel(Questions.QUESTION_2.getQuestion());
        criteriaQuestionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        criteriaQuestionLabel.setSize(1000, 20);
        criteriaQuestionLabel.setLocation(100, 160);
        c.add(criteriaQuestionLabel);

        optionList.clear();
        CriteriaQuestionOptions[] criteriaQuestionOptions = CriteriaQuestionOptions.values();
        for (CriteriaQuestionOptions options : criteriaQuestionOptions) {
            optionList.add(options.getOption());
        }

        criteriaQuestionDropDownOptions = new JComboBox(Utility.arrayListToStrArrayConverter(optionList));
        criteriaQuestionDropDownOptions.setRenderer(new PromptComboBoxRenderer("Please Select"));
        criteriaQuestionDropDownOptions.setFont(new Font("Arial", Font.PLAIN, 14));
        criteriaQuestionDropDownOptions.setSize(500, 30);
        criteriaQuestionDropDownOptions.setLocation(100, 180);
        criteriaQuestionDropDownOptions.setSelectedIndex(-1);
        c.add(criteriaQuestionDropDownOptions);

        releaseQuestionLabel = new JLabel(Questions.QUESTION_3.getQuestion());
        releaseQuestionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        releaseQuestionLabel.setSize(1000, 20);
        releaseQuestionLabel.setLocation(100, 220);
        c.add(releaseQuestionLabel);

        optionList.clear();
        ReleaseQuestionOptions[] releaseQuestionOptions = ReleaseQuestionOptions.values();
        for (ReleaseQuestionOptions options : releaseQuestionOptions) {
            optionList.add(options.getOption());
        }

        releaseQuestionDropDownOptions = new JComboBox(Utility.arrayListToStrArrayConverter(optionList));
        releaseQuestionDropDownOptions.setRenderer(new PromptComboBoxRenderer("Please Select"));
        releaseQuestionDropDownOptions.setFont(new Font("Arial", Font.PLAIN, 14));
        releaseQuestionDropDownOptions.setSize(500, 30);
        releaseQuestionDropDownOptions.setLocation(100, 240);
        releaseQuestionDropDownOptions.setSelectedIndex(-1);
        c.add(releaseQuestionDropDownOptions);

        calculate = new JButton("Calculate");
        calculate.setFont(new Font("Arial", Font.PLAIN, 18));
        calculate.setSize(150, 30);
        calculate.setLocation(100, 300);
        calculate.addActionListener(this);
        c.add(calculate);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 18));
        reset.setSize(150, 30);
        reset.setLocation(275, 300);
        reset.addActionListener(this);
        c.add(reset);

        textOutput = new JTextArea();
        textOutput.setFont(new Font("Arial", Font.PLAIN, 15));
        textOutput.setSize(500, 150);
        textOutput.setLocation(100, 350);
        textOutput.setLineWrap(true);
        textOutput.setEditable(false);
        c.add(textOutput);

        severityLabel = new JLabel("Calculated Severity: ");
        severityLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        severityLabel.setSize(400, 25);
        severityLabel.setLocation(100, 520);
        c.add(severityLabel);

        calculatedSeverity = new JTextArea();
        calculatedSeverity.setFont(new Font("Arial", Font.PLAIN, 20));
        calculatedSeverity.setSize(500, 40);
        calculatedSeverity.setLocation(300, 510);
        textOutput.setLineWrap(true);
        textOutput.setEditable(false);
        c.add(calculatedSeverity);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String severityLevel = "";
        if (e.getSource() == calculate) {
            if (impactQuestionDropDownOptions.getSelectedIndex() == -1 || criteriaQuestionDropDownOptions.getSelectedIndex() == -1 || releaseQuestionDropDownOptions.getSelectedIndex() == -1) {
                try {
                    throw new OptionNotSelectedException("All the questions must be answered");
                } catch (OptionNotSelectedException optionNotSelectedException) {
                    optionNotSelectedException.printStackTrace();
                    severityLevel = optionNotSelectedException.getMessage();
                }
            } else {
                amswers.clear();
                amswers.add((String)impactQuestionDropDownOptions.getSelectedItem());
                amswers.add((String)criteriaQuestionDropDownOptions.getSelectedItem());
                amswers.add((String)releaseQuestionDropDownOptions.getSelectedItem());

                int severityValue = 0;
                try {
                    String text = "";
                    for (int i = 0; i < amswers.size(); i++) {
                        text += "Your answer to question no " + (i + 1) + " : " + amswers.get(i) + "\n";
                    }
                    textOutput.setText(text);
                    textOutput.setEditable(false);

                    severityValue = CalculateSeverityValue.severityValue(amswers);
                    severityLevel = AssignSeverityLevel.severityLevel(severityValue);
                } catch (SumOutOfAllowedRangeException sumOutOfAllowedRangeException) {
                    sumOutOfAllowedRangeException.printStackTrace();
                    severityLevel = sumOutOfAllowedRangeException.getMessage();
                }

            }
            calculatedSeverity.setText(severityLevel);
        } else if (e.getSource() == reset) {
            impactQuestionDropDownOptions.setSelectedIndex(-1);
            criteriaQuestionDropDownOptions.setSelectedIndex(-1);
            releaseQuestionDropDownOptions.setSelectedIndex(-1);
            textOutput.setText("");
            calculatedSeverity.setText("");
        }
    }
}
