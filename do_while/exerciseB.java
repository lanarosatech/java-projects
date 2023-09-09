import java.util.Scanner;

class ExerciseB {
  public static void main(String[] args) {
    int opcao;
    do {
      System.out.println("Digite um valor qualquer ou 99 para sair");
      Scanner enter = new Scanner(System.in);
      opcao = enter.nextInt();
    }while (opcao != 99);
  }
}
