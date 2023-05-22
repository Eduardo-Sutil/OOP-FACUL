public class Pessoa {

  private String nome;
  private int idade;
  private double peso;
  private char sexo;

  void setIdade(int idade) {
    if (idade > 0 && idade < 110) {
      this.idade = idade;
      System.out.println("Idade Salva!");
    } else {
      System.out.println("Idade inválida!");
    }
  }

  void setNome(String nome) {
    this.nome = nome;
    System.out.println("Nome Salvo!");
  }

  void setPeso(int peso) {
    this.peso = peso;
    System.out.println("Peso Salvo!");
  }

  void setSexo(char sexo) {
    this.sexo = sexo;
    System.out.println("Sexo Salvo!");
  }

  void fazerAniversario() {
    this.idade += 1;
    System.out.println("Parabéns você completou " + idade + "anos!");
  }

  void aumentarPeso(double peso1) {
    peso += peso1;
    System.out.println("Você aumentou de peso, está pesando: " + peso + "atualmente!");
  }

  void diminuirPeso(double peso2) {
    peso -= peso2;
    System.out.println("Você perdeu peso, está pesando: " + peso + "atualmente!");
  }

  String informarNome() {
    return nome;
  }

  int informarIdade() {
    return idade;
  }

  char informarSexo() {
    return sexo;
  }

  double informarPeso() {
    return peso;
  }

  int informarAnoNascimento() {
    return 2023 - idade;
  }
}