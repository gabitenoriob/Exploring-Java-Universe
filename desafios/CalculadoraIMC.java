
package desafios;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class CalculadoraIMC {

    Double peso;
    Double altura;

    public CalculadoraIMC(Double peso,Double altura)
    {
        this.peso = peso;
        this.altura = altura;
    }

    public String getImc(Double peso, Double altura)
    {

    Double imc = peso / (altura * altura);
    
    DecimalFormat formato = new DecimalFormat("#.##");

    String imcString = formato.format(imc);



    if(imc < 18.5){return "ABAIXO DO PESO:" + "\nIMC: " +imcString ;}
    else if(imc >= 18.5 && imc <= 24.9){return "NORMAL:" + "\nIMC: " + imcString;}
    else if(imc >= 25 && imc <= 29.9){return "ACIMA DO PESO" +"\nIMC: " + imcString;}
    else{
            return "\nOBESO" + "IMC: " + imcString;}
    }


    public static void main(String[] args)
    {
        //1 pegar o kg e a altura do user
        JOptionPane.showMessageDialog(null, "Bem vindo a calculadora de IMC");
        String kilosString = JOptionPane.showInputDialog("Qual seu peso em kilos?");
        Double kilos = Double.parseDouble(kilosString);

        String alturaString = JOptionPane.showInputDialog("Qual sua altura em metros?");
        Double altura = Double.parseDouble(alturaString);

        Double imc = kilos / (altura * altura);

        if(imc < 18.5){JOptionPane.showMessageDialog(null,"ABAIXO DO PESO");}
        else if(imc >= 18.5 && imc <= 24.9){JOptionPane.showMessageDialog(null, "NORMAL");}
        else if(imc >= 25 && imc <= 29.9){JOptionPane.showMessageDialog(null,"ACIMA DO PESO");}
        else{
            JOptionPane.showMessageDialog(null,"OBESO");
        


    }
}
 
}  
