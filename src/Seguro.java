 public class Seguro{

private String idSeguro;
private String tipoSeguro;
private double valorPremio;
private int dataContratacao;
private String contratarSeguro;
private String consultarSeguro;
public boolean confirmarSeguro;
public boolean cancelarSeguro;

public Seguro(){

}

public Seguro (String idSeguro, String tipoSeguro, double valorPremio, int dataContratacao, String contratrarSeguro, String consultarSeguro, boolean confirmarSeguro,boolean cancelarSeguro ) {

    this.idSeguro = idSeguro;
    this.tipoSeguro = tipoSeguro;
    this.valorPremio = valorPremio;
    this.dataContratacao = dataContratacao;
    this.contratarSeguro = contratrarSeguro;
    this.consultarSeguro = consultarSeguro;
    this.confirmarSeguro = confirmarSeguro;
    this.cancelarSeguro = cancelarSeguro;
    
}

public void setConfirmarSeguro(boolean confirmarSeguro){
    this.confirmarSeguro = true;

}

public boolean getConfirmarSeguro(){
    return confirmarSeguro;
}

public void setCancelarSeguro(boolean cancelarSeguro){
    this.cancelarSeguro = false;

}

public boolean getCancelarSeguro(){
    return cancelarSeguro;
}

public void setIdSeguro(String idSeguro){
    this.idSeguro = idSeguro;
}

public String getIdSeguro(){
    return idSeguro;
}

public void setTipoSeguro( String tipoSeguro){
    this.tipoSeguro = tipoSeguro;
}

public  String tipoSeguro(){
    return tipoSeguro;
}

public void setValorPremio( double valorPremio){
this.valorPremio = valorPremio;
}

public double getValorPremio(){
    return valorPremio;
}

public void setDataContratacao(int dataContratacao){
    this.dataContratacao = dataContratacao;
}

public  int getDataContratacao(){
    return dataContratacao;
}

public void setContratarSeguro(String contratarSeguro){
    this.contratarSeguro = contratarSeguro;
}

public String getContratarSeguro(){
    return contratarSeguro;
}

public void SetConsultarSeguro(String consultarSeguro){
    this.consultarSeguro = consultarSeguro;
}

public String getConsultarSeguro(){
    return consultarSeguro;
}


}
