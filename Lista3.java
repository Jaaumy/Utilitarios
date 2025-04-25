    import java.util.Scanner;
    import java.util.Random;

    public class Lista3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int categoria, exercicio;

            do {
                System.out.println("\n=== MENU PRINCIPAL ===");
                System.out.println("1. Exercícios de Repetição Básica");
                System.out.println("2. Exercícios com Condições");
                System.out.println("3. Verificações e Processamentos");
                System.out.println("4. Sair");
                System.out.print("Escolha uma categoria: ");
                categoria = scanner.nextInt();

                switch (categoria) {
                    case 1: // Repetição Básica
                        do {
                            System.out.println("\n--- Repetição Básica ---");
                            System.out.println("1. Ímpares 999-1500");
                            System.out.println("2. Sequência até N");
                            System.out.println("3. Números de 5 em 5");
                            System.out.println("4. Soma de 1 até N");
                            System.out.println("5. Tabuada");
                            System.out.println("6. Voltar");
                            System.out.print("Escolha: ");
                            exercicio = scanner.nextInt();

                            switch (exercicio) {
                                case 1:
                                    for (int i = 999; i <= 1500; i += 2)
                                        System.out.println(i);
                                    break;
                                case 2:
                                    System.out.print("Digite N: ");
                                    int n = scanner.nextInt();
                                    for (int i = 1; i <= n; i++)
                                        System.out.println(i);
                                    break;
                                case 3:
                                    for (int i = 0; i <= 500; i += 5)
                                        System.out.println(i);
                                    break;
                                case 4:
                                    System.out.print("Digite N: ");
                                    int soma = 0;
                                    int limite = scanner.nextInt();
                                    for (int i = 1; i <= limite; i++)
                                        soma += i;
                                    System.out.println("Soma: " + soma);
                                    break;
                                case 5:
                                    System.out.print("Digite um número: ");
                                    int num = scanner.nextInt();
                                    for (int i = 1; i <= 10; i++)
                                        System.out.println(num + " x " + i + " = " + (num * i));
                                    break;
                            }
                        } while (exercicio != 6);
                        break;

                    case 2: // Condições
                        do {
                            System.out.println("\n--- Condições ---");
                            System.out.println("1. Par/Ímpar no intervalo");
                            System.out.println("2. Busca 0-100");
                            System.out.println("3. Múltiplos de 3 e 5");
                            System.out.println("4. Primeiro múltiplo de 5");
                            System.out.println("5. Loop com break/continue");
                            System.out.println("6. Voltar");
                            System.out.print("Escolha: ");
                            exercicio = scanner.nextInt();

                            switch (exercicio) {
                                case 1:
                                    System.out.print("Digite A e B: ");
                                    int a = scanner.nextInt();
                                    int b = scanner.nextInt();
                                    int start, end;
                                    if (a <= b) {
                                        start = a;
                                        end = b;
                                    } else {
                                        start = b;
                                        end = a;
                                    }
                                    for (int i = start; i <= end; i++)
                                        System.out.println(i + " é " + (i % 2 == 0 ? "PAR" : "ÍMPAR"));
                                    break;
                                case 2:
                                    System.out.print("Digite um número: ");
                                    int busca = scanner.nextInt();
                                    for (int i = 0; i <= 100; i++) {
                                        if (i == busca) {
                                            System.out.println("Encontrado");
                                            break;
                                        }
                                    }
                                    break;
                                case 3:
                                    for (int i = 1; i <= 100; i++)
                                        if (i % 3 == 0 && i % 5 == 0)
                                            System.out.println(i);
                                    break;
                                case 4:
                                    System.out.print("Digite A e B: ");
                                    int x = scanner.nextInt();
                                    int y = scanner.nextInt();
                                    boolean achou = false;
                                    int inicio = (x <= y) ? x : y;
                                    int fim = (x <= y) ? y : x;
                                    for (int i = inicio; i <= fim; i++) {
                                        if (i % 5 == 0) {
                                            System.out.println("Múltiplo de 5: " + i);
                                            achou = true;
                                            break;
                                        }
                                    }
                                    if (!achou) System.out.println("Não encontrado");
                                    break;
                                case 5:
                                    for (int i = 1; i <= 20; i++) {
                                        if (i % 3 == 0) continue;
                                        if (i == 15) break;
                                        System.out.println(i);
                                    }
                                    break;
                            }
                        } while (exercicio != 6);
                        break;

                    case 3: // Verificações
                        do {
                            System.out.println("\n--- Verificações ---");
                            System.out.println("1. Fatorial");
                            System.out.println("2. Número primo");
                            System.out.println("3. Média de notas");
                            System.out.println("4. Jogo de adivinhação");
                            System.out.println("5. Voltar");
                            System.out.print("Escolha: ");
                            exercicio = scanner.nextInt();

                            switch (exercicio) {
                                case 1:
                                    System.out.print("Digite um número: ");
                                    long fat = 1;
                                    int numero = scanner.nextInt();
                                    for (int i = 2; i <= numero; i++)
                                        fat *= i;
                                    System.out.println("Fatorial: " + fat);
                                    break;
                                case 2:
                                    System.out.print("Digite um número: ");
                                    int primo = scanner.nextInt();
                                    boolean ehPrimo = true;
                                    if (primo <= 1) {
                                        ehPrimo = false;
                                    } else {
                                        for (int i = 2; i * i <= primo; i++) {
                                            if (primo % i == 0) {
                                                ehPrimo = false;
                                                break;
                                            }
                                        }
                                    }
                                    System.out.println(ehPrimo ? "Primo" : "Não primo");
                                    break;
                                case 3:
                                    double total = 0;
                                    int count = 0;
                                    while (true) {
                                        System.out.print("Nota (-1 para sair): ");
                                        double nota = scanner.nextDouble();
                                        if (nota == -1) break;
                                        if (nota >= 0 && nota <= 10) {
                                            total += nota;
                                            count++;
                                        } else {
                                            System.out.println("Nota inválida!");
                                        }
                                    }
                                    System.out.println("Média: " + (count > 0 ? total / count : 0));
                                    break;
                                case 4:
                                    Random rand = new Random();
                                    int numAleatorio = rand.nextInt(100) + 1;
                                    int tentativa;
                                    do {
                                        System.out.print("Tentativa: ");
                                        tentativa = scanner.nextInt();
                                        if (tentativa < numAleatorio) System.out.println("MAIOR");
                                        else if (tentativa > numAleatorio) System.out.println("MENOR");
                                    } while (tentativa != numAleatorio);
                                    System.out.println("ACERTOU!");
                                    break;
                            }
                        } while (exercicio != 5);
                        break;

                    case 4:
                        System.out.println("Encerrando...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } while (categoria != 4);
            scanner.close();
        }
    }