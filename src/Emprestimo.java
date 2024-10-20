    public class Emprestimo {

        private int idEmprestimo;
        private double valorEmprestimo;
        private double juros;
        private String dataAprovacao;
        private String dataVencimento;
        private int parcelas;
    
        //construtor
        public Emprestimo(int idEmprestimo, double valorEmprestimo, double juros, String dataAprovacao, String dataVencimento, int parcelas){
            this.idEmprestimo = idEmprestimo;
            this.valorEmprestimo = valorEmprestimo;
            this.juros = juros;
            this.dataAprovacao = dataAprovacao;
            this.dataVencimento = dataVencimento;
            this.parcelas = parcelas;
        }
    
         //Getters e Setters
         public int getIdEmprestimo(){
            return idEmprestimo;
        }
    
        public void setIdEmprestimo(int idEmprestimo){
            this.idEmprestimo = idEmprestimo;
        }
    
        public double getValorEmprestimo(){
            return valorEmprestimo;
        }
    
        public void setValorEmprestimo(double valorEmprestimo){
            this.valorEmprestimo = valorEmprestimo;
        }
    
        public double getJuros(){
            return juros;
        }
    
        public void setJuros(double juros){
            this.juros = juros;
        }
    
        public String getDataAprovacao(){
            return dataAprovacao;
        }
    
        public void setDataAprovacao(String dataAprovacao){
            this.dataAprovacao = dataAprovacao;
        }
    
        public String getDataVencimento(){
            return dataVencimento;
        }
    
        public void setDataVencimento(String dataVencimento){
            this.dataVencimento = dataVencimento;
        }
    
        public int getParcelas(){
            return parcelas;
        }
    
        public void setParcelas(int parcelas){
            this.parcelas = parcelas;
        }
    
    }

