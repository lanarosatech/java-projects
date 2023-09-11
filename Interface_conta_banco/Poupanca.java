class Poupanca implements Conta {
  private double saldo = 0.0;

  public void depositar(double valor) {
    saldo += valor;
  }

  public void sacar(double valor){
    if (valor <= saldo) {
      saldo -= valor;
    } else {
      System.out.println("Saldo Insuficiente.");
    }
  }

  public double getSaldo() {
    return saldo;
  }
}
