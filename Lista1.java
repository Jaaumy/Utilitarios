import java.util.Scanner;

public class Lista1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n==== Menu de Exercícios ====");
            System.out.println("1. Custo Final do Produto");
            System.out.println("2. Volume da Esfera");
            System.out.println("3. Cálculo do IMC");
            System.out.println("4. Área do Triângulo");
            System.out.println("5. Média de Três Números");
            System.out.println("6. Desconto e Comissão");
            System.out.println("7. Velocidade Média");
            System.out.println("8. Aumento de 25%");
            System.out.println("9. Percentual de Peso a Eliminar");
            System.out.println("10. Imposto de Renda");
            System.out.println("11. Ordem Decrescente");
            System.out.println("12. Par ou Ímpar");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("\nValor da matéria-prima 1: ");
                    double m01 = scanner.nextDouble();
                    System.out.print("Valor da matéria-prima 2: ");
                    double m02 = scanner.nextDouble();
                    System.out.print("Valor da matéria-prima 3: ");
                    double m03 = scanner.nextDouble();
                    double custo = m01 + 3 * m02 + 2 * m03;
                    System.out.printf("Custo final: R$ %.2f\n", custo);
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.print("\nRaio da esfera: ");
                    double raio = scanner.nextDouble();
                    double volume = (4.0 / 3.0) * 3.14159 * raio * raio * raio;
                    System.out.printf("Volume: %.2f\n", volume);
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.print("\nPeso (kg): ");
                    double peso = scanner.nextDouble();
                    System.out.print("Altura (m): ");
                    double altura = scanner.nextDouble();
                    double imc = peso / (altura * altura);
                    System.out.printf("IMC: %.2f\n", imc);
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.print("\nBase: ");
                    double base = scanner.nextDouble();
                    System.out.print("Altura: ");
                    double alturaTriangulo = scanner.nextDouble();
                    double area = (base * alturaTriangulo) / 2;
                    System.out.printf("Área: %.2f\n", area);
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.print("\nNúmero 1: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Número 2: ");
                    int num2 = scanner.nextInt();
                    System.out.print("Número 3: ");
                    int num3 = scanner.nextInt();
                    double media = (num1 + num2 + num3) / 3.0;
                    System.out.printf("Média: %.2f\n", media);
                    scanner.nextLine();
                    break;
                case 6:
                    System.out.print("\nValor da compra: ");
                    double valor = scanner.nextDouble();
                    System.out.print("Desconto (%): ");
                    double desconto = scanner.nextDouble();
                    double valorFinal = valor * (1 - desconto / 100);
                    double comissao = valorFinal * 0.03;
                    System.out.printf("Valor final: R$ %.2f\n", valorFinal);
                    System.out.printf("Comissão: R$ %.2f\n", comissao);
                    scanner.nextLine();
                    break;
                case 7:
                    System.out.print("\nDistância (km): ");
                    double distancia = scanner.nextDouble();
                    System.out.print("Tempo (horas): ");
                    double tempo = scanner.nextDouble();
                    double velocidade = distancia / tempo;
                    System.out.printf("Velocidade média: %.2f km/h\n", velocidade);
                    scanner.nextLine();
                    break;
                case 8:
                    System.out.print("\nValor do produto: ");
                    double valorProduto = scanner.nextDouble();
                    double novoValor = valorProduto * 1.25;
                    System.out.printf("Novo valor: R$ %.2f\n", novoValor);
                    scanner.nextLine();
                    break;
                case 9:
                    System.out.print("\nPeso atual (kg): ");
                    double atual = scanner.nextDouble();
                    System.out.print("Peso desejado (kg): ");
                    double desejado = scanner.nextDouble();
                    double percentual = ((atual - desejado) / atual) * 100;
                    System.out.printf("Percentual a eliminar: %.2f%%\n", percentual);
                    scanner.nextLine();
                    break;
                case 10:
                    System.out.print("\nSalário: ");
                    double salario = scanner.nextDouble();
                    double imposto = salario * 0.05;
                    System.out.printf("Imposto a pagar: R$ %.2f\n", imposto);
                    scanner.nextLine();
                    break;
                case 11:
                    System.out.println("\nDigite três números diferentes:");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int c = scanner.nextInt();

                    if (a < b) {
                        int temp = a;
                        a = b;
                        b = temp;
                    }
                    if (a < c) {
                        int temp = a;
                        a = c;
                        c = temp;
                    }
                    if (b < c) {
                        int temp = b;
                        b = c;
                        c = temp;
                    }

                    System.out.println("Ordem decrescente: " + a + ", " + b + ", " + c);
                    scanner.nextLine();
                    break;
                case 12:
                    System.out.print("\nDigite um número: ");
                    int num = scanner.nextInt();
                    int resultado = 0;
                    resultado = num % 2;
                    if (resultado == 0) {
                        System.out.println("Ele é par");
                    }
                    else{
                        System.out.println("Ele é impar");
                    }
                    scanner.nextLine();
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