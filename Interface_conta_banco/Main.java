class Main {
  public static void main(String[] args){
    Conta cp = new Poupanca();
    cp.depositar(732);
    cp.sacar(8);
    double saldo = cp.getSaldo();
    System.out.println("Saldo atual:"+ saldo);
  }
}
