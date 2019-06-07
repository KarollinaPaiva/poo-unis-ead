package massacorp1;

import javax.swing.JOptionPane;

public class MassaCorp1 {

    public static void main(String[] args) {

        double peso;
        double altura;
        double imc;
        int resultado;

        do {
            peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu Peso em KG!"));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua Altura em Metros!"));

            resultado = JOptionPane.showConfirmDialog(null, "Peso: " + peso + " Kg" + "\n" + "Altura: " + altura + " m" + "\n" + "\n" + "Os dados digitados estão Corretos? ");
           } 
        
        while (resultado != JOptionPane.YES_OPTION);

        imc = peso / (altura * altura);

        if (imc <= 17) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc + "\n" + "Muito Abaixo do Peso!");
        } else if (imc > 17 && imc <= 18.499999999) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc + "\n" + "Abaixo do Peso!");
        } else if (imc > 18.500000000 && imc <= 24.999999999) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc + "\n" + "Peso Normal!");
        } else if (imc > 25 && imc <= 29.999999999) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc + "\n" + "Acima do Peso!");
        } else if (imc > 30 && imc <= 34.999999999) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc + "\n" + "Obesidade I!");
        } else if (imc > 35 && imc <= 39.999999999) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc + "\n" + "Obesidade II (severa)");
        } else {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc + "\n" + "Obesidade III (mórbida)");
        }

    }
}
