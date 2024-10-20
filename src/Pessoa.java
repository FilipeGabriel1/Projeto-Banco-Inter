public class Pessoa {

        public String nome;
        public int cpf;
        public String endereco;
        public int telefone;
        public String email;
        public String dataNasc;
    
        public Pessoa (){
    
        }
        public Pessoa (String nome, int cpf,String endereco, int telefone, String email, String dataNasc){
            this.nome=nome;
            this.cpf = cpf;
            this.endereco= endereco;
            this.telefone=telefone; 
            this.email=email;
            this.dataNasc=dataNasc;
        }
        public String getNome() {
            return nome;
        }
        public int getCpf() {
            return cpf;
        }
        public String getEndereco() {
            return endereco;
        }
        public int getTelefone() {
            return telefone;
        }
        public String getEmail() {
            return email;
        }
        public String getDataNasc() {
            return dataNasc;
            
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public void setCpf(int cpf) {
            this.cpf = cpf;
        }
        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }
        public void setTelefone(int telefone) {
            this.telefone = telefone;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public void setDataNasc(String dataNasc) {
            this.dataNasc = dataNasc;
        }
        public void atualizarEndereco (String novoEndereco){
            this.endereco=novoEndereco;
        }
        public void atualizarTelefone(int novoTelefone){
            this.telefone=novoTelefone;
        }
    }


