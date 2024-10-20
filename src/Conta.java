public class Conta {

        private int numeroConta;
        private int agencia;
        private double saldo;
        private TipoConta tipoConta;
        private String dataAbertura;
        public Cliente cliente;
    
        public Conta(){
    
        }
        public Conta(int numeroConta, int agencia, TipoConta tipoConta,String dataAbertura,Cliente cliente){
            this.numeroConta=numeroConta;
            this.agencia=agencia;
            this.tipoConta=tipoConta;
            this.dataAbertura=dataAbertura;
            this.saldo= 0;
            this.cliente=cliente;
        }
        
        public double consultarSaldo(){
            return saldo; 
        }
        public String getDataAbertura() {
            return dataAbertura;
        }
        public int getAgencia() {
            return agencia;
        }
        public Cliente getCliente() {
            return cliente;
        }
        public int getNumeroConta() {
            return numeroConta;
        }
        public TipoConta getTipoConta() {
            return tipoConta;
        }
        public void setAgencia(int agencia) {
            this.agencia = agencia;
        }
        public void setNumeroConta(int numeroConta) {
            this.numeroConta = numeroConta;
        }
        public void setTipoConta(TipoConta tipoConta) {
            this.tipoConta = tipoConta;
        }
        public void setDataAbertura(String dataAbertura) {
            this.dataAbertura = dataAbertura;
        }
        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }
        public void depositar( double valor){
            saldo += valor;
        }
        public void sacar (double valor){
            saldo -= valor;
        }
        public void transferir (Conta contaDestino, double valor){
            sacar(valor);
            contaDestino.depositar(valor);
        }
    }


