public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    public ContaTerminal(int n,String a,String nc,Double s){
        numero = n;
        agencia = a;
        nomeCliente = nc;
        saldo = s;
    }
    public void scanTerminal() {
        System.out.println("Olá, "+nomeCliente+", obrigado por criar uma conta em nosso banco, " +
                "sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }
}
