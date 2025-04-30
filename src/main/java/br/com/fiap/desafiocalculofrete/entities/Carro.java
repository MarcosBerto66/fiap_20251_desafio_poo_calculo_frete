package br.com.fiap.desafiocalculofrete.entities;

import br.com.fiap.desafiocalculofrete.exceptions.QuantidadePassageiroInvalidoException;
import br.com.fiap.desafiocalculofrete.services.TabelaTaxaVeiculo;
import br.com.fiap.desafiocalculofrete.services.TabelaTaxaVeiculoLeve;

public class Carro extends Veiculo{

    private static final int MINIMO_PASSAGEIROS = 1;
    private static final int MAXIMO_PASSAGEIROS = 4;

    public Carro(int quantidadePassageiros, TabelaTaxaVeiculo tabelaTaxaVeiculo, double distancia){
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
        return super.getTabelaTaxa().obterPorDistanciaEmQuilometros(super.getDistancia());
    }

    @Override
    public double obterValorTransporte(){
        return super.getTabelaTaxa().obterPorPassageiro(super.getQuantidadePassageiros());
    }

}
