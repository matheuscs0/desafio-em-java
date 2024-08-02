import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Matheus";
        String tipoConta = "Corrente";
        double saldo = 2500.00;

        System.out.println("\n------------------------------------");
        System.out.println(String.format("\nNome do cliente: %s \nTipo da conta: %s \nSaldo do cliente: %f", nome, tipoConta, saldo));
        System.out.println("\n------------------------------------");
        Scanner reading = new Scanner(System.in);
        int value = 0;
        double valorReceberOuTransferir = 0;

        String menu = """
                Digite uma opção
                1- Conferir saldo
                2- Receber transferência
                3- Realizar transfêrencia
                4- Sair
                "\n------------------------------------"
                """;

        while (value != 4 || value > 4) {
            System.out.println(menu);
            value = reading.nextInt();


            if(value == 1){
                System.out.println("O saldo atualizado é de " + saldo);
            } else if(value == 2){
                System.out.println("Digite o valor a ser recebido");
                double valor = reading.nextDouble();
                saldo += valor;
                System.out.println("O saldo atualizado é de " + saldo);
            } else if (value == 3 ){
                System.out.println("Digite o valor a ser transferido");
                double valor = reading.nextDouble();
                if(valor > saldo) {
                    System.out.println("Valor indisponivel para ser transferido");
                } else {
                    saldo -= valor;
                    System.out.println("O saldo atualizado é de " + saldo);
                }

            }

        }

    }
}