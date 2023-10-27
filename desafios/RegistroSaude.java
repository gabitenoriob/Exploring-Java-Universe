/*Neste exercício, você projetará uma classe HealthProfile inicial para uma 
pessoa. Os atributos da classe devem incluir nome, sobrenome, sexo, data de nascimento (consistindo em atributos separados para mes, dia 
e ano de nascimento), altura (em metros) e peso (em quilogramas) da pessoa. Sua classe deve ter um construtor que receba esses dados. 
Para cada atributo, forneça métodos set e get. A classe também deve incluir metodos que calculem e retornem a idade do usuário em anos, 
intervalo de frequência cardíaca máxima e frequência cardíaca alvo e o imc*/

package desafios;

import java.time.LocalDate;


public class RegistroSaude {

    
    private String name;
    private String last_name;
    private Sexo sexo;
    private LocalDate nascimento;
    private Double altura;
    private Double peso;

    public RegistroSaude(String name, String last_name, Sexo sexo, LocalDate nascimento, Double altura, Double peso)
    {
        this.altura = altura;
        this.last_name = last_name;
        this.name = name;
        this.nascimento = nascimento;
        this.peso = peso;
        this.sexo = sexo;
    } 


   public void setName(String name)
   {
      this.name = name; 
   } 

   public String getName()
   {
      return name; 
   } 
   public void setLastName(String last_name)
   {
      this.last_name = last_name; 
   } 

   public String getLastName()
   {
      return last_name; 
   } 
   
   public void setNascimento(LocalDate nascimento)
   {
      this.nascimento= nascimento; 
   } 

   public LocalDate getNascimento()
   {
      return nascimento; 
   } 
   public void setAltura(Double altura)
   {
      this.altura = altura; 
   } 

   public Double getAltura()
   {
      return altura; 
   } 
   public void setPeso(Double peso)
   {
      this.peso = peso; 
   } 

   public Double getPeso()
   {
      return peso; 
   } 

   public void setSexo(Sexo sexo)
   {
      this.sexo = sexo; 
   } 

   public Sexo getSexo()
   {
      return sexo; 
   } 

   public int getIdade(LocalDate nascimento){

    LocalDate hoje = LocalDate.now();
    

    return hoje.getYear() - nascimento.getYear(); //melhorar para calcular baseado em dia e mes tb
    
    
   }

    public String getImc(Double peso,Double altura)
    {
        CalculadoraIMC imc = new CalculadoraIMC(peso,altura);
        String resultado = imc.getImc(peso, altura);
        return resultado;

    }
   public enum Sexo{
    Feminino,
    Masculino,
    NaoBinario;
   }

   


    
   

   
    
    
    

    
}
