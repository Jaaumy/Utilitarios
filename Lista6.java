import java.util.Scanner;
import java.util.Random;

public class Lista6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int categoria, exercicio;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Exercícios de Matrizes");
            System.out.println("2. Sair");
            System.out.print("Escolha uma categoria: ");
            categoria = scanner.nextInt();

            switch (categoria) {
                case 1:
                    do {
                        System.out.println("\n--- Exercícios de Matrizes ---");
                        System.out.println("1. Criação e Impressão de Matrizes");
                        System.out.println("2. Soma de Matrizes");
                        System.out.println("3. Multiplicação de Matrizes");
                        System.out.println("4. Transposta de uma Matriz");
                        System.out.println("5. Diagonal Principal e Secundária");
                        System.out.println("6. Matriz Identidade");
                        System.out.println("7. Soma dos Elementos de Cada Linha e Coluna");
                        System.out.println("8. Voltar");
                        System.out.print("Escolha: ");
                        exercicio = scanner.nextInt();

                        switch (exercicio) {
                            case 1: {
                                System.out.println("\nCriação e Impressão de Matrizes");
                                System.out.print("Digite o número de linhas (m): ");
                                int m = scanner.nextInt();
                                System.out.print("Digite o número de colunas (n): ");
                                int n = scanner.nextInt();

                                Random rand = new Random();
                                int[][] matriz = new int[m][n];
                                for (int i = 0; i < m; i++) {
                                    for (int j = 0; j < n; j++) {
                                        matriz[i][j] = rand.nextInt(101);
                                    }
                                }

                                System.out.println("\nMatriz gerada:");
                                for (int i = 0; i < m; i++) {
                                    for (int j = 0; j < n; j++) {
                                        System.out.print(matriz[i][j] + "\t");
                                    }
                                    System.out.println();
                                }
                                break;
                            }

                            case 2: {
                                System.out.println("\nSoma de Matrizes");
                                System.out.print("Digite o número de linhas (m): ");
                                int m = scanner.nextInt();
                                System.out.print("Digite o número de colunas (n): ");
                                int n = scanner.nextInt();

                                System.out.println("\nDigite os elementos da matriz A:");
                                int[][] a = new int[m][n];
                                for (int i = 0; i < m; i++) {
                                    for (int j = 0; j < n; j++) {
                                        a[i][j] = scanner.nextInt();
                                    }
                                }
                                System.out.println("\nDigite os elementos da matriz B:");
                                int[][] b = new int[m][n];
                                for (int i = 0; i < m; i++) {
                                    for (int j = 0; j < n; j++) {
                                        b[i][j] = scanner.nextInt();
                                    }
                                }

                                int[][] c = new int[m][n];
                                for (int i = 0; i < m; i++) {
                                    for (int j = 0; j < n; j++) {
                                        c[i][j] = a[i][j] + b[i][j];
                                    }
                                }

                                System.out.println("\nMatriz resultante da soma:");
                                for (int i = 0; i < m; i++) {
                                    for (int j = 0; j < n; j++) {
                                        System.out.print(c[i][j] + "\t");
                                    }
                                    System.out.println();
                                }
                                break;
                            }

                            case 3: {
                                System.out.println("\nMultiplicação de Matrizes");
                                System.out.print("Digite o número de linhas de A (m): ");
                                int m = scanner.nextInt();
                                System.out.print("Digite o número de colunas de A (n): ");
                                int n = scanner.nextInt();

                                System.out.println("\nDigite os elementos da matriz A:");
                                int[][] a = new int[m][n];
                                for (int i = 0; i < m; i++) {
                                    for (int j = 0; j < n; j++) {
                                        a[i][j] = scanner.nextInt();
                                    }
                                }

                                System.out.print("Digite o número de colunas de B (p): ");
                                int p = scanner.nextInt();

                                System.out.println("\nDigite os elementos da matriz B:");
                                int[][] b = new int[n][p];
                                for (int i = 0; i < n; i++) {
                                    for (int j = 0; j < p; j++) {
                                        b[i][j] = scanner.nextInt();
                                    }
                                }

                                int[][] c = new int[m][p];
                                for (int i = 0; i < m; i++) {
                                    for (int j = 0; j < p; j++) {
                                        int soma = 0;
                                        for (int k = 0; k < n; k++) {
                                            soma += a[i][k] * b[k][j];
                                        }
                                        c[i][j] = soma;
                                    }
                                }

                                System.out.println("\nMatriz resultante da multiplicação:");
                                for (int i = 0; i < m; i++) {
                                    for (int j = 0; j < p; j++) {
                                        System.out.print(c[i][j] + "\t");
                                    }
                                    System.out.println();
                                }
                                break;
                            }

                            case 4: {
                                System.out.println("\nTransposta de uma Matriz");
                                System.out.print("Digite o número de linhas (m): ");
                                int m = scanner.nextInt();
                                System.out.print("Digite o número de colunas (n): ");
                                int n = scanner.nextInt();

                                System.out.println("\nDigite os elementos da matriz:");
                                int[][] a = new int[m][n];
                                for (int i = 0; i < m; i++) {
                                    for (int j = 0; j < n; j++) {
                                        a[i][j] = scanner.nextInt();
                                    }
                                }

                                int[][] transposta = new int[n][m];
                                for (int i = 0; i < m; i++) {
                                    for (int j = 0; j < n; j++) {
                                        transposta[j][i] = a[i][j];
                                    }
                                }

                                System.out.println("\nMatriz transposta:");
                                for (int i = 0; i < n; i++) {
                                    for (int j = 0; j < m; j++) {
                                        System.out.print(transposta[i][j] + "\t");
                                    }
                                    System.out.println();
                                }
                                break;
                            }

                            case 5: {
                                System.out.println("\nDiagonal Principal e Secundária");
                                System.out.print("Digite a ordem da matriz quadrada (n): ");
                                int n = scanner.nextInt();

                                System.out.println("\nDigite os elementos da matriz:");
                                int[][] a = new int[n][n];
                                for (int i = 0; i < n; i++) {
                                    for (int j = 0; j < n; j++) {
                                        a[i][j] = scanner.nextInt();
                                    }
                                }

                                System.out.print("\nDiagonal principal: ");
                                for (int i = 0; i < n; i++) {
                                    System.out.print(a[i][i] + " ");
                                }
                                System.out.println();

                                System.out.print("Diagonal secundária: ");
                                for (int i = 0; i < n; i++) {
                                    System.out.print(a[i][n - 1 - i] + " ");
                                }
                                System.out.println();
                                break;
                            }
                            case 6: {
                                System.out.println("\nMatriz Identidade");
                                System.out.print("Digite a ordem da matriz (n): ");
                                int n = scanner.nextInt();

                                int[][] identidade = new int[n][n];
                                for (int i = 0; i < n; i++) {
                                    for (int j = 0; j < n; j++) {
                                        identidade[i][j] = (i == j) ? 1 : 0;
                                    }
                                }

                                System.out.println("\nMatriz identidade:");
                                for (int i = 0; i < n; i++) {
                                    for (int j = 0; j < n; j++) {
                                        System.out.print(identidade[i][j] + "\t");
                                    }
                                    System.out.println();
                                }
                                break;
                            }

                            case 7: {
                                System.out.println("\nSoma dos Elementos de Cada Linha e Coluna");
                                System.out.print("Digite o número de linhas (m): ");
                                int m = scanner.nextInt();
                                System.out.print("Digite o número de colunas (n): ");
                                int n = scanner.nextInt();

                                System.out.println("\nDigite os elementos da matriz:");
                                int[][] a = new int[m][n];
                                for (int i = 0; i < m; i++) {
                                    for (int j = 0; j < n; j++) {
                                        a[i][j] = scanner.nextInt();
                                    }
                                }

                                System.out.println("\nSoma das linhas:");
                                for (int i = 0; i < m; i++) {
                                    int somaLinha = 0;
                                    for (int j = 0; j < n; j++) {
                                        somaLinha += a[i][j];
                                    }
                                    System.out.println("Linha " + (i + 1) + ": " + somaLinha);
                                }

                                System.out.println("\nSoma das colunas:");
                                for (int j = 0; j < n; j++) {
                                    int somaColuna = 0;
                                    for (int i = 0; i < m; i++) {
                                        somaColuna += a[i][j];
                                    }
                                    System.out.println("Coluna " + (j + 1) + ": " + somaColuna);
                                }
                                break;
                            }

                            case 8:
                                break;
                            default:
                                System.out.println("Opção inválida!");
                        }
                    } while (exercicio != 8);
                    break;
                case 2:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (categoria != 2);
        scanner.close();
    }
}