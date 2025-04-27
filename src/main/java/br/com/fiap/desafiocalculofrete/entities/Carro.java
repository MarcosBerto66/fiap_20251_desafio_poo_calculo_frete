package br.com.fiap.desafiocalculofrete.entities;

import br.com.fiap.desafiocalculofrete.exceptions.QuantidadePassageiroInvalidoException;
import br.com.fiap.desafiocalculofrete.services.TabelaTaxaVeiculo;
import br.com.fiap.desafiocalculofrete.services.TabelaTaxaVeiculoLeve;

public class Carro extends Veiculo{

    private static final int MINIMO_PASSAGEIROS = 1;
    private static final int MAXIMO_PASSAGEIROS = 4;

    private TabelaTaxaVeiculo tabelaTaxaVeiculo = new TabelaTaxaVeiculoLeve();

    public Carro(int quantidadePassageiros, double distancia){
        super(quantidadePassageiros, tabelaTaxaVeiculo, distancia);
        validarQuantidadePassageiros(quantidadePassageiros);
    }

    private void validarQuantidadePassageiros(int quantidadePassageiros){
        if(!(quantidadePassageiros >= MINIMO_PASSAGEIROS && quantidadePassageiros <= MAXIMO_PASSAGEIROS)){
            throw new QuantidadePassageiroInvalidoException(
                    "Quantidade de passageiros inválida: o valor deve estar entre "
                    + MINIMO_PASSAGEIROS + " e " + MAXIMO_PASSAGEIROS + "."
            );
        }
    }
    @Override
    public double obterCustoCombustivel() {
        var custoCombustivel = this.obterValorTotal();
        return
    }

    @Override
    public double obterValorTransporte(){
        return 0.0;
    }

}
