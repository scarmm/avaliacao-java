import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAlunos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> alunos = new ArrayList<>();
        ArrayList<String> conceitos = new ArrayList<>();
        int[] totais = { 0, 0, 0, 0 };
        int i = 0;

        do {
            System.out.println("1 - Adicione um novo aluno e seu conceito.");
            System.out.println("2 - Listagem de todos os alunos e seus conceitos.: ");
            System.out.println("3 - Calculando e exibindo a quantidade de cada conceito");
            System.out.println("4 - Exibindo os alunos com o conceito mais alto.");
            System.out.println("Ou digite 0 para abortar...");
            i = s.nextInt();

            switch (i) {

                case 0:
                    System.out.println("Ok, ate mais ...");
                    break;

                case 1:
                    String conceito;
                    String aluno;
                    System.out.println("Digite o nome do aluno: ");
                    aluno = s.next();
                    System.out.println("Digite o conceito do aluno: ");
                    conceito = s.next();

                    alunos.add(aluno);
                    conceitos.add(conceito);

                    break;

                case 2:
                    for (int j = 0; j < alunos.size(); j++) {
                        String conceitoPrint = conceitos.get(j);
                        String alunoPrint = alunos.get(j);

                        System.out.println("Aluno: " + alunoPrint + " - Conceito: " + conceitoPrint);
                    }

                    break;

                case 3:
                    for (int c = 0; c < conceitos.size(); c++) {
                        String conceitoCheck = conceitos.get(c);
                        if (conceitoCheck.equals("O")) {
                            totais[0]++;
                        } else if (conceitoCheck.equals("B")) {
                            totais[1]++;
                        }
                        if (conceitoCheck.equals("S")) {
                            totais[2]++;
                        } else if (conceitoCheck.equals("I")) {
                            totais[3]++;
                        }

                    }
                    System.out.println("Total de O " + totais[0]);
                    System.out.println("Total de B " + totais[1]);
                    System.out.println("Total de S " + totais[2]);
                    System.out.println("Total de I " + totais[3]);

                    break;

                case 4:
                    System.out.println("Alunos com conceito Ótimo");
                    for (int a = 0; a < alunos.size(); a++) {
                        String conceitoCheck = conceitos.get(a);
                        if (conceitoCheck.equals("O")) {
                            System.out.println("Aluno: " + alunos.get(a));
                        }

                    }
                    break;

                default:
                    System.out.println("Opção inválida!");

            }
        } while (i != 0);

        s.close();
    }
}