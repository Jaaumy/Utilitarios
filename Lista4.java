import java.util.Scanner;
import java.util.Random;

public class Lista4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n==== Menu Principal ====");
            System.out.println("1. Somatório dos pares entre 100 e 500");
            System.out.println("2. Percentual por faixa etária (50 pessoas)");
            System.out.println("3. Soma de números em um intervalo [a, b]");
            System.out.println("4. Soma de 20 números pares");
            System.out.println("5. Contagem de 0 até N (while)");
            System.out.println("6. Contagem regressiva 10-1 + 'Fogo!'");
            System.out.println("7. Somar pares até número negativo (do-while)");
            System.out.println("8. Tabuada interativa (while)");
            System.out.println("9. Jogo de adivinhação");
            System.out.println("10. Validação de senha");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1: {
                    int soma = 0;
                    for (int i = 100; i <= 500; i++) {
                        if (i % 2 == 0) soma += i;
                    }
                    System.out.println("Somatório: " + soma);
                }
                break;
                case 2: {
                    int[] faixas = new int[5]; // 0-15, 16-30, 31-45, 46-60, >60
                    System.out.println("Digite 50 idades:");

                    for (int i = 0; i < 50; i++) {
                        int idade = scanner.nextInt();
                        if (idade <= 15) faixas[0]++;
                        else if (idade <= 30) faixas[1]++;
                        else if (idade <= 45) faixas[2]++;
                        else if (idade <= 60) faixas[3]++;
                        else faixas[4]++;
                    }
                    System.out.println("\nPercentuais:");
                    for (int i = 0; i < faixas.length; i++) {
                        double percentual = (faixas[i] / 50.0) * 100;
                        String faixa;
                        switch (i) {
                            case 0:
                                faixa = "0-15";
                                break;
                            case 1:
                                faixa = "16-30";
                                break;
                            case 2:
                                faixa = "31-45";
                                break;
                            case 3:
                                faixa = "46-60";
                                break;
                            default:
                                faixa = "60+";
                        }
                        System.out.printf("%s anos: %.2f%%\n", faixa, percentual);
                    }
                    scanner.close();
                }
                break;
                case 3: {
                    {
                        System.out.print("Digite o início (a): ");
                        int a = scanner.nextInt();
                        System.out.print("Digite o fim (b): ");
                        int b = scanner.nextInt();

                        int soma = 0;
                        for (int i = a; i <= b; soma += i++) ;
                        System.out.println("Soma: " + soma);
                        scanner.close();
                    }
                }
                break;
                case 4: {
                    {
                        System.out.println("Digite 20 números:");
                        int soma = 0;

                        for (int i = 0; i < 20; i++) {
                            int num = scanner.nextInt();
                            if (num % 2 == 0) soma += num;
                        }
                        System.out.println("Soma dos pares: " + soma);
                        scanner.close();
                    }
                }
                break;
                case 5:
                {
                    {
                        System.out.print("Digite N: ");
                        int n = scanner.nextInt();
                        int i = 0;

                        while (i <= n) {
                            System.out.println(i);
                            i++;
                        }
                        scanner.close();
                    }
                }
                    break;
                case 6:
                {
                    {
                        int i = 10;
                        while (i >= 1) {
                            System.out.println(i);
                            i--;
                        }
                        System.out.println("Fogo!");
                    }
                }
                    break;
                case 7:
                {
                    {
                        int soma = 0, num;

                        do {
                            System.out.print("Digite um número: ");
                            num = scanner.nextInt();
                            if (num >= 0 && num % 2 == 0) soma += num;
                        } while (num >= 0);

                        System.out.println("Soma dos pares: " + soma);
                        scanner.close();
                    }
                }
                    break;
                case 8:
                {
                    {
                        char continuar;
                        do {
                            System.out.print("Digite um número para a tabuada: ");
                            int num = scanner.nextInt();
                            int i = 1;

                            while (i <= 10) {
                                System.out.printf("%d x %d = %d\n", num, i, num * i);
                                i++;
                            }
                            System.out.print("Continuar? (s/n): ");
                            continuar = scanner.next().charAt(0);
                        } while (continuar == 's' || continuar == 'S');
                        scanner.close();
                    }
                }
                    break;
                case 9:
                {
                    {
                        Random rand = new Random();
                        int numero = rand.nextInt(100) + 1;
                        int tentativa;

                        System.out.println("Adivinhe o número (1-100):");
                        do {
                            System.out.print("Tentativa: ");
                            tentativa = scanner.nextInt();

                            if (tentativa < numero) System.out.println("Maior!");
                            else if (tentativa > numero) System.out.println("Menor!");
                        } while (tentativa != numero);

                        System.out.println("Acertou!");
                        scanner.close();
                    }
                }
                    break;
                case 10:
                {
                    {
                        final String SENHA = "1234";
                        String entrada;

                        while (true) {
                            System.out.print("Senha: ");
                            entrada = scanner.nextLine();
                            if (entrada.equals(SENHA)) {
                                System.out.println("Bem-vindo!");
                                break;
                            }
                            System.out.println("Senha incorreta!");
                        }
                        scanner.close();
                    }
                }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        scanner.close();
    }
}