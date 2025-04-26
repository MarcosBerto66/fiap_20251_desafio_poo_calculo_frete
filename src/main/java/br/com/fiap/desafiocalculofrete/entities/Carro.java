package br.com.fiap.desafiocalculofrete.entities;

import br.com.fiap.desafiocalculofrete.services.TabelaTaxaVeiculo;

public class Carro extends Veiculo{

    public Carro(int quantidadePassageiros, TabelaTaxaVeiculo tabelaTaxa, double distancia){
        super(quantidadePassageiros, tabelaTaxa, distancia);
    }

    @Override
    public double obterCustoCombustivel() {
        return 0;
    }

    @Override
    public double obterValorTransporte(){
        return 0.0;
    }

}
