package br.com.visao;

import br.com.controle.Dobro;

import javax.swing.JOptionPane;

public class Objeto {
    public static void main(String[] args) {
        Dobro d = new Dobro();
        d.setValor(Integer.valueOf(JOptionPane.showInputDialog("Digite um valor")));
        JOptionPane.showMessageDialog(null,d.calcularDobro());
    }
}