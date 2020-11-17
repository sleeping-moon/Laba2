package com.company;

import javax.swing.*;

//V3

public class Formula extends JFrame {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 420;

    private ButtonGroup radioButtons = new ButtonGroup();
    private Box hboxFormulaType = Box.createHorizontalBox();
    private int formulaId = 1;
    private double sum = 0;
    private boolean flag = false;

    public Double calculate1(Double x, Double y, Double z) {
        if (z == 0){
            JOptionPane.showMessageDialog(Formula.this,
                    "Деление на ноль", "Ошибочный формат числа", JOptionPane.WARNING_MESSAGE);
            return 0.0;
        }
        return Math.sin(Math.log(y) + Math.sin(Math.PI * y * y)) * Math.pow((x * x + Math.sin(z) + Math.pow(Math.E,Math.cos(z))),0.25);
    }

    public Double calculate2(Double x, Double y, Double z) {

        if (z == 0 || y == 0){
            JOptionPane.showMessageDialog(Formula.this,
                    "Деление на ноль", "Ошибочный формат числа", JOptionPane.WARNING_MESSAGE);
            return 0.0;
        }

        return (1+Math.pow(x,z)+Math.log(y*y))*(1-Math.sin(x+z))/ Math.sqrt(x*x*x+1) ;
    }

}
