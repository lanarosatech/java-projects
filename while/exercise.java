import java.util.Scanner;

class Exercise {
  public static void main(String[] args) {
    int opcao = 0;
    while (opcao != 99){
      System.out.println("Digite um valor qualquer ou 99 para sair");
      Scanner enter = new Scanner(System.in);
      opcao = enter.nextInt();
    }
  }
}
