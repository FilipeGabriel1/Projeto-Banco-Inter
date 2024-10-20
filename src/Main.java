public class Main {

    //Apenas teste para saber se a heranca estava funcionando
    public static void main(String[] args) throws Exception {
        Conta cont1= new Conta();
        Cliente c1=new Cliente("jimmy",555555555,"rua da llama", 89098976,"jimmy@gmail.com",
        "09/09/1910",cont1 );
        cont1.setAgencia(1909);
        cont1.setNumeroConta(9892829);
        cont1.setTipoConta( TipoConta.CORRENTE);
        c1.consultarExtrato();
        c1.conta.depositar(98.78);
        c1.consultarExtrato();
        Conta cont2= new Conta();
        cont2.setAgencia(1909);
        cont2.setNumeroConta(12980);
        cont2.setTipoConta( TipoConta.POUPANCA);
        cont2.depositar(891);
        cont2.transferir(cont1, 128);
        c1.consultarExtrato();
        c1.conta.sacar(23);
        c1.consultarExtrato();
    }
}
   
    
    


