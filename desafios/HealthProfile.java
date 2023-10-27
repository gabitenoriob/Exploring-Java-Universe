package desafios;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import desafios.RegistroSaude.Sexo;

       
public class HealthProfile {

    public static void main(String[] args)
    {

    //RegistroSaude meuRegistro = new RegistroSaude("Gabriela", "Batista", RegistroSaude.Sexo.Feminino, LocalDate.parse("2003-11-14"), 1.71, 62.5);
    /*JOptionPane.showMessageDialog(null, meuRegistro.getImc(62.5, 1.71));
    JOptionPane.showMessageDialog(null, meuRegistro.getIdade(LocalDate.parse("2003-11-14")));*/


    // ou faça o seu proprio
    JOptionPane.showMessageDialog(null, "Bem vindo ao Registro de saude");
    String name = JOptionPane.showInputDialog("Digite seu 1 nome:");
    String last_name = JOptionPane.showInputDialog("Digite seu sobrenome:");
    String nascimentoString = JOptionPane.showInputDialog("Digite sua data de nascimento no formato ano-mes-dia:");
    LocalDate nascimento = LocalDate.parse(nascimentoString);
    String sexoString = JOptionPane.showInputDialog("Digite seu sexo:(Feminino,Masculino ou Não Binário)");
    Sexo sexo = RegistroSaude.Sexo.Feminino;
    if(sexoString == "Feminino" || sexoString == "feminino")
    {
        sexo = RegistroSaude.Sexo.Feminino;
    }
    else if(sexoString == "Masculino" || sexoString == "masculino"){
        sexo = RegistroSaude.Sexo.Masculino;
    }
    else if(sexoString == "Não binário" || sexoString == "não binário" || sexoString == "nao binario" || sexoString == "Não binario")
    {
        sexo = RegistroSaude.Sexo.NaoBinario;
    }
    String alturaString = JOptionPane.showInputDialog("Digite sua altura:");
    Double altura = Double.parseDouble(alturaString);
    String pesoString = JOptionPane.showInputDialog("Digite seu peso:");
    Double peso = Double.parseDouble(pesoString);

    RegistroSaude pessoa = new RegistroSaude(name, last_name, sexo, nascimento, altura, peso);
     int imcOption = JOptionPane.showConfirmDialog(null, "Deseja saber seu IMC?", "Pergunta", JOptionPane.YES_NO_OPTION);

        if (imcOption == JOptionPane.YES_OPTION) {

            String imc = pessoa.getImc(peso, altura);

      String messageImc = String.format("Seu IMC está : %s%n", imc);
      JOptionPane.showMessageDialog(null, messageImc);

           
        } 

     int idadeOption = JOptionPane.showConfirmDialog(null, "Deseja conferir sua idade?", "Pergunta", JOptionPane.YES_NO_OPTION);

        if (idadeOption == JOptionPane.YES_OPTION) {

                  int age = pessoa.getIdade(nascimento);

      String messageAge = String.format("Sua idade é : %d%n", age);
      JOptionPane.showMessageDialog(null, messageAge);

           
        } 

        









    }
    
}
