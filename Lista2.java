import java.util.Scanner;

public class Lista2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int categoria, exercicio;
        final String SENHA = "lucas";

        do {
            System.out.println("\n======== MENU PRINCIPAL ========");
            System.out.println("1. Operações Matemáticas");
            System.out.println("2. Condicionais Básicas");
            System.out.println("3. Verificações e Validações");
            System.out.println("4. Sair");
            System.out.print("Escolha uma categoria: ");
            categoria = scanner.nextInt();

            switch (categoria) {
                case 1: // Operações Matemáticas
                    do {
                        System.out.println("\n--- Operações Matemáticas ---");
                        System.out.println("1. Calculadora básica");
                        System.out.println("2. Converter km para milhas");
                        System.out.println("3. Converter Celsius para Fahrenheit");
                        System.out.println("4. Calcular IMC");
                        System.out.println("5. Aplicar desconto");
                        System.out.println("6. Voltar");
                        System.out.print("Escolha um exercício: ");
                        exercicio = scanner.nextInt();

                        switch (exercicio) {
                            case 1: // Calculadora básica
                                System.out.print("Digite dois números: ");
                                double n1 = scanner.nextDouble();
                                double n2 = scanner.nextDouble();
                                System.out.println("Soma: " + (n1 + n2));
                                System.out.println("Subtração: " + (n1 - n2));
                                System.out.println("Multiplicação: " + (n1 * n2));
                                System.out.println("Divisão: " + (n2 != 0 ? (n1 / n2) : "Indefinido"));
                                break;

                            case 2: // Km para milhas
                                System.out.print("Digite km: ");
                                double km = scanner.nextDouble();
                                System.out.println("Milhas: " + (km * 0.621371));
                                break;

                            case 3: // Celsius para Fahrenheit
                                System.out.print("Digite Celsius: ");
                                double celsius = scanner.nextDouble();
                                System.out.println("Fahrenheit: " + (celsius * 9/5 + 32));
                                break;

                            case 4: // IMC
                                System.out.print("Peso (kg): ");
                                double peso = scanner.nextDouble();
                                System.out.print("Altura (m): ");
                                double altura = scanner.nextDouble();
                                System.out.printf("IMC: %.2f%n", peso / (altura * altura));
                                break;

                            case 5: // Desconto
                                System.out.print("Preço: R$");
                                double preco = scanner.nextDouble();
                                System.out.print("Desconto (%): ");
                                double desconto = scanner.nextDouble();
                                System.out.printf("Preço final: R$%.2f%n", preco * (1 - desconto/100));
                                break;
                        }
                    } while (exercicio != 6);
                    break;

                case 2: // Condicionais Básicas
                    do {
                        System.out.println("\n--- Condicionais Básicas ---");
                        System.out.println("1. Verificar número");
                        System.out.println("2. Maior/menor de 3 números");
                        System.out.println("3. Vogal/Consoante");
                        System.out.println("4. Intervalo 10-20");
                        System.out.println("5. Verificar maioridade");
                        System.out.println("6. Dia da semana");
                        System.out.println("7. Cumprimento personalizado");
                        System.out.println("8. Par/Ímpar");
                        System.out.println("9. Voltar");
                        System.out.print("Escolha um exercício: ");
                        exercicio = scanner.nextInt();

                        switch (exercicio) {
                            case 1: // Verificar número
                                System.out.print("Digite um número: ");
                                int num = scanner.nextInt();
                                System.out.println(num > 0 ? "Positivo" : num < 0 ? "Negativo" : "Zero");
                                break;

                            case 2: // Maior/menor
                                System.out.println("Digite 3 números:");
                                int a = scanner.nextInt();
                                int b = scanner.nextInt();
                                int c = scanner.nextInt();
                                int maior = Math.max(a, Math.max(b, c));
                                int menor = Math.min(a, Math.min(b, c));
                                System.out.println("Maior: " + maior + " | Menor: " + menor);
                                break;

                            case 3: // Vogal/Consoante
                                System.out.print("Digite uma letra: ");
                                char letra = scanner.next().toLowerCase().charAt(0);
                                if("aeiou".indexOf(letra) != -1) System.out.println("Vogal");
                                else if(Character.isLetter(letra)) System.out.println("Consoante");
                                else System.out.println("Não é letra");
                                break;

                            case 4: // Intervalo 10-20
                                System.out.print("Digite um número: ");
                                double numero = scanner.nextDouble();
                                System.out.println(numero >= 10 && numero <= 20 ? "Dentro" : "Fora");
                                break;

                            case 5: // Maioridade
                                System.out.print("Idade: ");
                                int idade = scanner.nextInt();
                                System.out.println(idade >= 18 ? "Maior" : "Menor");
                                break;

                            case 6: // Dia da semana
                                System.out.print("Número (1-7))");
                                int dia = scanner.nextInt();
                                String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
                                System.out.println(dia >= 1 && dia <=7 ? dias[dia-1] : "Inválido");
                                break;

                            case 7: // Cumprimento
                                System.out.print("Nome: ");
                                String nome = scanner.next();
                                if(nome.equalsIgnoreCase("Maria") || nome.equalsIgnoreCase("João")) {
                                    System.out.println("Olá " + nome + ", como está?");
                                } else {
                                    System.out.println("Olá " + nome + ", não nos conhecemos!");
                                }
                                break;

                            case 8: // Par/Ímpar
                                System.out.print("Número: ");
                                int n = scanner.nextInt();
                                System.out.println(n % 2 == 0 ? "Par" : "Ímpar");
                                break;
                        }
                    } while (exercicio != 9);
                    break;

                case 3: // Verificações e Validações
                    do {
                        System.out.println("\n--- Verificações ---");
                        System.out.println("1. Ano bissexto");
                        System.out.println("2. Validar senha");
                        System.out.println("3. Múltiplo de 5");
                        System.out.println("4. Calculadora operador");
                        System.out.println("5. Média escolar");
                        System.out.println("6. Triângulo");
                        System.out.println("7. Nota para conceito");
                        System.out.println("8. Desconto condicional");
                        System.out.println("9. Voltar");
                        System.out.print("Escolha um exercício: ");
                        exercicio = scanner.nextInt();

                        switch (exercicio) {
                            case 1: // Ano bissexto
                                System.out.print("Ano: ");
                                int ano = scanner.nextInt();
                                boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
                                System.out.println(bissexto ? "Bissexto" : "Não bissexto");
                                break;

                            case 2: // Senha
                                System.out.print("Senha: ");
                                String senha = scanner.next();
                                System.out.println(senha.equals(SENHA) ? "Correta!" : "Incorreta!");
                                break;

                            case 3: // Múltiplo de 5
                                System.out.print("Número: ");
                                int x = scanner.nextInt();
                                System.out.println(x % 5 == 0 ? "Múltiplo" : "Não múltiplo");
                                break;

                            case 4: // Calculadora operador
                                System.out.print("Números e operador (ex: 5 3 +): ");
                                double num1 = scanner.nextDouble();
                                double num2 = scanner.nextDouble();
                                char op = scanner.next().charAt(0);
                                double res = 0;
                                switch(op) {
                                    case '+': res = num1 + num2; break;
                                    case '-': res = num1 - num2; break;
                                    case '*': res = num1 * num2; break;
                                    case '/': res = num1 / num2; break;
                                    default: System.out.println("Operador inválido!");
                                }
                                System.out.println("Resultado: " +res);
                                break;

                            case 5: // Média
                                System.out.println("Digite 3 notas:");
                                double nota1 = scanner.nextDouble();
                                double nota2 = scanner.nextDouble();
                                double nota3 = scanner.nextDouble();
                                double media = (nota1 + nota2 + nota3) / 3;
                                System.out.printf("Média: %.1f - %s%n", media, media >= 6 ? "Aprovado" : "Reprovado");
                                break;

                            case 6: // Triângulo
                                System.out.println("Digite 3 lados:");
                                double l1 = scanner.nextDouble();
                                double l2 = scanner.nextDouble();
                                double l3 = scanner.nextDouble();
                                boolean triangulo = (l1 + l2 > l3) && (l1 + l3 > l2) && (l2 + l3 > l1);
                                System.out.println(triangulo ? "Forma triângulo" : "Não forma");
                                break;

                            case 7: // Conceito
                                System.out.print("Nota: ");
                                double nota = scanner.nextDouble();
                                String conceito;
                                if(nota >= 9) conceito = "A";
                                else if(nota >= 7.5) conceito = "B";
                                else if(nota >= 6) conceito = "C";
                                else if(nota >= 5) conceito = "D";
                                else conceito = "F";
                                System.out.println("Conceito: " + conceito);
                                break;

                            case 8: // Desconto condicional
                                System.out.print("Valor: R$");
                                double valor = scanner.nextDouble();
                                if(valor > 100) valor *= 0.90;
                                System.out.printf("Valor final: R$%.2f%n", valor);
                                break;
                        }
                    } while (exercicio != 9);
                    break;
            }
        } while (categoria != 4);
        scanner.close();
        System.out.println("Programa encerrado!");
    }
}