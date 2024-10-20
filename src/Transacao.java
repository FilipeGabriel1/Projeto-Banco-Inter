 public class Transacao {
    
        private int idTransacao;
        public String data;
        private int valor;
        public String tipodeTransacao;
        public String contaOrigem;
        public String contaDestino;
        public boolean realizarTransacao;
        public boolean reverterTransacao;
        
        public Transacao(){
            
        }
        
        public Transacao(int idTransacao, String data, int valor, String tipodeTransacao, String contaOrigem, String contaDestino,boolean realizarTransacao, boolean reverterTransacao){
            this.idTransacao = idTransacao;
            this.data = data;
            this.valor = valor;
            this.tipodeTransacao = tipodeTransacao;
            this.contaOrigem = contaOrigem;
            this.contaDestino = contaDestino;
            this.realizarTransacao = realizarTransacao;
            this.reverterTransacao = reverterTransacao;
        }
        
        public void realizarTransacao() {
            this.realizarTransacao = true;
        }
        public void cancelarTransacao() {
            this.realizarTransacao = false;
        }
        
        public void reverterTransacao() {
            this.reverterTransacao = true;
        }
        
        public int geidTransacao() {
            return idTransacao;
        }
        public void setidTransacao(int idTransacao) {
            this.idTransacao = idTransacao;
        }
        
        public String getdata() {
            return data;
        }
        public void setdata(String data) {
            this.data = data;
        }
        
        public int getvalor() {
            return valor;
        }
        public void setvalor(int valor) {
            this.valor = valor;
        }
        
        public String gettipodeTransacao() {
            return tipodeTransacao;
        }
        public void settipodeTransacao(String tipodeTransacao) {
            this.tipodeTransacao = tipodeTransacao;
        }
        
        public String getcontaOrigem() {
            return contaOrigem;
        }
        public void setcontaOrigem(String contaOrigem) {
            this.contaOrigem = contaOrigem;
        }
        
        public String getcontaDestino() {
            return contaDestino;
        }
        public void setcontaDestino(String contaDestino) {
            this.contaDestino = contaDestino;
        }
    }

