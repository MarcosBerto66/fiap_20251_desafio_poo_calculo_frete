package br.com.fiap.desafiocalculofrete.entities;

import br.com.fiap.desafiocalculofrete.exceptions.QuantidadePassageiroInvalidoException;
import br.com.fiap.desafiocalculofrete.services.TabelaTaxaVeiculo;
import br.com.fiap.desafiocalculofrete.services.TabelaTaxaVeiculoLeve;

public class Bicicleta extends Veiculo{

    private static final int QUANTIDADE_PASSAGEIROS = 1;

    public Bicicleta(int quantidadePassageiros, TabelaTaxaVeiculo tabelaTaxa, double distancia) {
        super(quantidadePassageiros, tabelaTaxa, distancia);
        validarQuantidadePassageiros(quantidadePassageiros);
    }

    private void validarQuantidadePassageiros(int quantidadePassageiros){
        if(!(quantidadePassageiros == QUANTIDADE_PASSAGEIROS)){
            throw new QuantidadePassageiroInvalidoException(
                    "Quantidade de passageiros inválida: deve ser exatamente "
                        + QUANTIDADE_PASSAGEIROS + "."
            );
        }
    }

    @Override
    public double obterCustoCombustivel() {
        return 0;
    }

    @Override
    public double obterValorTransporte() {
        return this.getTabelaTaxa().obterPorPassageiro(this.getQuantidadePassageiros()) - 0.2D;
    }
}
