 public class Pagamento {

        private int idPagamento;
        private double valor;
        private String dataPagamento;
        private String codigoBarras;
        private String tipoPagamento; //boleto, pix
    
        //construtor
        public Pagamento(int idPagamento, double valor, String dataPagamento, String codigoBarras, String tipoPagamento){
            this.idPagamento = idPagamento;
            this.valor = valor;
            this.dataPagamento = dataPagamento;
            this.codigoBarras = codigoBarras;
            this.tipoPagamento = tipoPagamento;
        }
    
        //Getters e Setters
        public int getIdPagamento(){
            return idPagamento;
        }
    
        public void setIdPagamento(int idPagamento){
            this.idPagamento = idPagamento;
        }
    
        public double getValor(){
            return valor;
        }
    
        public void setValor(double valor){
            this.valor = valor;
        }
    
        public String getDataPagamento(){
            return dataPagamento;
        }
    
        public void setDataPagamento(String dataPagamento){
            this.dataPagamento = dataPagamento;
        }
    
        public String getCodigoBarras(){
            return codigoBarras;
        }
    
        public void setCodigoBarras(String codigoBarras){
            this.codigoBarras = codigoBarras;
        }
    
         public String getTipoPagamento(){
            return tipoPagamento;
        }
    
        public void setTipoPagamento(String tipoPagamento){
            this.tipoPagamento = tipoPagamento;
        }
    
    
        }

