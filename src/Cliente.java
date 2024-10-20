
    public class Cliente extends Pessoa{
        public Conta conta;
        public Cliente (String nome, int cpf,String endereco, int telefone, String email, String dataNasc,Conta conta){
            super(nome, cpf,endereco,telefone,email,dataNasc);
            this.conta=conta;
        }
        public Conta getConta() {
            return conta;
        }public void setConta(Conta conta) {
            this.conta = conta;
        }
        public void consultarExtrato(){
            System.out.printf("%s conta: %d saldo da conta: R$ %.2f%n",getNome(),conta.getNumeroConta(),conta.consultarSaldo());
        }
    }

