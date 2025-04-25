import java.util.ArrayList;
import java.util.Scanner;

public class Lista5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int categoria, exercicio;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Operações Básicas com Vetores");
            System.out.println("2. Manipulação de Vetores");
            System.out.println("3. Sair");
            System.out.print("Escolha uma categoria: ");
            categoria = scanner.nextInt();

            switch (categoria) {
                case 1: // Operações Básicas
                    do {
                        System.out.println("\n--- Operações Básicas ---");
                        System.out.println("1. Leitura e exibição normal/inversa");
                        System.out.println("2. Soma e média de valores");
                        System.out.println("3. Maior e menor número");
                        System.out.println("4. Contagem de pares/ímpares");
                        System.out.println("5. Busca de elemento");
                        System.out.println("6. Vetor intercalado");
                        System.out.println("7. Voltar");
                        System.out.print("Escolha: ");
                        exercicio = scanner.nextInt();

                        switch (exercicio) {
                            case 1: {
                                int[] vetor = new int[10];
                                System.out.println("Digite 10 números:");
                                for(int i = 0; i < 10; i++) vetor[i] = scanner.nextInt();

                                System.out.print("Normal: ");
                                for(int n : vetor) System.out.print(n + " ");

                                System.out.print("\nInverso: ");
                                for(int i = 9; i >= 0; i--) System.out.print(vetor[i] + " ");
                                System.out.println();
                                break;
                            }
                            case 2: {
                                int[] vetor = new int[5];
                                System.out.println("Digite 5 números:");
                                for(int i = 0; i < 5; i++) vetor[i] = scanner.nextInt();

                                int soma = 0;
                                for(int n : vetor) soma += n;
                                System.out.println("Soma: " + soma);
                                System.out.println("Média: " + (soma/5.0));
                                break;
                            }
                            case 3: {
                                int[] vetor = new int[8];
                                System.out.println("Digite 8 números diferentes:");
                                for(int i = 0; i < 8; i++) vetor[i] = scanner.nextInt();

                                int maior = vetor[0], menor = vetor[0];
                                for(int n : vetor) {
                                    if(n > maior) maior = n;
                                    if(n < menor) menor = n;
                                }
                                System.out.println("Maior: " + maior + ", Menor: " + menor);
                                break;
                            }

                            case 4: {
                                int[] vetor = new int[15];
                                System.out.println("Digite 15 números:");
                                for(int i = 0; i < 15; i++) vetor[i] = scanner.nextInt();

                                ArrayList<Integer> pares = new ArrayList<>();
                                ArrayList<Integer> impares = new ArrayList<>();
                                for(int n : vetor) {
                                    if(n % 2 == 0) pares.add(n);
                                    else impares.add(n);
                                }
                                System.out.println("Pares (" + pares.size() + "): " + pares);
                                System.out.println("Ímpares (" + impares.size() + "): " + impares);
                                break;
                            }

                            case 5: {
                                int[] vetor = new int[10];
                                System.out.println("Digite 10 números:");
                                for(int i = 0; i < 10; i++) vetor[i] = scanner.nextInt();

                                System.out.print("Buscar número: ");
                                int busca = scanner.nextInt();
                                boolean encontrado = false;
                                for(int i = 0; i < 10; i++) {
                                    if(vetor[i] == busca) {
                                        System.out.println("Encontrado na posição " + i);
                                        encontrado = true;
                                    }
                                }
                                if(!encontrado) System.out.println("Não encontrado!");
                                break;
                            }

                            case 6: {
                                int[] v1 = new int[5], v2 = new int[5], v3 = new int[10];
                                System.out.println("Primeiro vetor (5 números):");
                                for(int i = 0; i < 5; i++) v1[i] = scanner.nextInt();

                                System.out.println("Segundo vetor (5 números):");
                                for(int i = 0; i < 5; i++) v2[i] = scanner.nextInt();

                                int pos = 0;
                                for(int i = 0; i < 5; i++) {
                                    v3[pos++] = v1[i];
                                    v3[pos++] = v2[i];
                                }
                                System.out.print("Vetor intercalado: ");
                                for(int n : v3) System.out.print(n + " ");
                                System.out.println();
                                break;
                            }
                        }
                    } while(exercicio != 7);
                    break;

                case 2: // Manipulação de Vetores
                    do {
                        System.out.println("\n--- Manipulação de Vetores ---");
                        System.out.println("1. Tamanho do vetor");
                        System.out.println("2. Verificar existência");
                        System.out.println("3. Contar ocorrências");
                        System.out.println("4. Inverter vetor");
                        System.out.println("5. Remover duplicatas");
                        System.out.println("6. Voltar");
                        System.out.print("Escolha: ");
                        exercicio = scanner.nextInt();

                        switch (exercicio) {
                            case 1: {
                                int[] vetor = {10,20,30,40,50,60,70};
                                System.out.println("Tamanho: " + vetor.length);
                                break;
                            }

                            case 2: {
                                int[] vetor = {10,20,30,40,50};
                                boolean existe = false;
                                for(int n : vetor) if(n == 40) existe = true;
                                System.out.println(existe ? "40 existe" : "40 não existe");
                                break;
                            }

                            case 3: {
                                int[] vetor = {10,20,30,20,40,20};
                                int contador = 0;
                                for(int n : vetor) if(n == 20) contador++;
                                System.out.println("Número 20 aparece " + contador + " vezes");
                                break;
                            }

                            case 4: {
                                int[] vetor = {10,20,30,40,50};
                                System.out.print("Original: ");
                                for(int n : vetor) System.out.print(n + " ");

                                System.out.print("\nInvertido: ");
                                for(int i = vetor.length-1; i >= 0; i--)
                                    System.out.print(vetor[i] + " ");
                                System.out.println();
                                break;
                            }

                            case 5: {
                                int[] vetor = {10,20,30,40,40,50};
                                ArrayList<Integer> unicos = new ArrayList<>();
                                for(int n : vetor) {
                                    if(!unicos.contains(n)) unicos.add(n);
                                }
                                System.out.println("Sem duplicatas: " + unicos);
                                break;
                            }
                        }
                    } while(exercicio != 6);
                    break;

                case 3:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(categoria != 3);
        scanner.close();
    }
}