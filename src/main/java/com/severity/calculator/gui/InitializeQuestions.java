package com.severity.calculator.gui;

import com.severity.calculator.utils.PromptComboBoxRenderer;
import com.severity.calculator.utils.Utility;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class InitializeQuestions extends SeverityCalculatorForm {

    public static void initializeQuestions(JComboBox dropDownOptions, String labelValue, ArrayList<String> optionList, int xLocation, int yLocation) {
        JLabel label = new JLabel(labelValue);
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        label.setSize(1000, 20);
        label.setLocation(100, 100);
        c.add(label);

        dropDownOptions = new JComboBox(Utility.arrayListToStrArrayConverter(optionList));
        dropDownOptions.setRenderer(new PromptComboBoxRenderer("Please Select"));
        dropDownOptions.setFont(new Font("Arial", Font.PLAIN, 14));
        dropDownOptions.setSize(300, 30);
        dropDownOptions.setLocation(xLocation, yLocation);
        dropDownOptions.setSelectedIndex(-1);
        c.add(dropDownOptions);
    }
}
