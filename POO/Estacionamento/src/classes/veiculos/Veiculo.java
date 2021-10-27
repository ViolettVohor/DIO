package classes.veiculos;

public class Veiculo {
  
  private String placa;
  private String marca;
  private String modelo;
  private double fatorEstacionamento;
  private String horaEntrada;
  private String horaSaida;
  private double totalEstacionamento;
  private TipoCarro tipoCarro;

  public Veiculo(){}

  public TipoCarro getTipoCarro() {
    return this.tipoCarro;
  }

  public void setTipoCarro(TipoCarro tipoCarro) {
    this.tipoCarro = tipoCarro;
  }

  public String getPlaca() {
    return this.placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public String getMarca() {
    return this.marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return this.modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public double getFatorEstacionamento() {
    return this.fatorEstacionamento;
  }

  public void setFatorEstacionamento(double fatorEstacionamento) {
    this.fatorEstacionamento = fatorEstacionamento + 1;
  }

  public String getHoraEntrada() {
    return this.horaEntrada;
  }

  public void setHoraEntrada(String horaEntrada) {
    this.horaEntrada = horaEntrada;
  }

  public String getHoraSaida() {
    return this.horaSaida;
  }

  public void setHoraSaida(String horaSaida) {
    this.horaSaida = horaSaida;
  }

  public double getTotalEstacionamento() {
    return this.totalEstacionamento;
  }

  public void setTotalEstacionamento(double totalEstacionamento) {
    this.totalEstacionamento = totalEstacionamento;
  }

}
