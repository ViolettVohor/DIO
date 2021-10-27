package classes;
import java.util.ArrayList;
import java.util.List;

import classes.veiculos.TesteImpl;
import classes.veiculos.TipoCarro;
import classes.veiculos.Veiculo;

public class Main {
  public static void main(String[] args) {
    TesteImpl teste = new TesteImpl();
    Veiculo veiculo = new Veiculo();
    Veiculo veiculo2 = new Veiculo();
    Veiculo veiculo3 = new Veiculo();
    List<Veiculo> veiculos = new ArrayList<>();

    veiculo.setTipoCarro(TipoCarro.MOTO);
    veiculo.setPlaca("ABC-1010");
    veiculo2.setTipoCarro(TipoCarro.CARRO);
    veiculo3.setTipoCarro(TipoCarro.UTILITARIO);
    veiculo3.setPlaca("OTP-2443");

    veiculos.add(veiculo);
    veiculos.add(veiculo2);
    veiculos.add(veiculo3);

    System.out.println("Qual o tamanho da lista?? " + veiculos.size() + "\n");
    veiculos.forEach(v->System.out.println(v.getPlaca() + " " + v.getTipoCarro()));

    teste.teste();
    teste.teste2("DIO");
  }
}