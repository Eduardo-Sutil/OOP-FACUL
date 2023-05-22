class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        // Métodos Set:
        p1.setIdade(20);
        p1.setNome("Eduardo");
        p1.setPeso(62);
        p1.setSexo('m');

        // Métodos:
        p1.fazerAniversario();
        p1.aumentarPeso(3);
        p1.diminuirPeso(10);

        // Métodos Get:
        System.out.println("Você Nasceu em: " + p1.informarAnoNascimento());
        System.out.println("Você tem " + p1.informarIdade() + "anos de idade!");
        System.out.println("Seu nome é: " + p1.informarNome());
        System.out.println("Você pesa: " + p1.informarPeso() + "quilos!");
        System.out.println("Seu gênero é: " + p1.informarSexo());
    }
}