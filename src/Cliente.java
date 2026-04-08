public class Cliente {
    private String numerocliente;
    private double saldo;

    public Cliente() {

    }

    public Cliente(String numerocliente, double saldo) {
        this.numerocliente = numerocliente;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numerocliente='" + numerocliente + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public String getNumerocliente() {
        return numerocliente;
    }

    public void setNumerocliente(String numerocliente) {
        this.numerocliente = numerocliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
