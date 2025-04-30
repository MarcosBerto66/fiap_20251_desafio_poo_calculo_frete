package br.com.fiap.desafiocalculofrete.entities;

import br.com.fiap.desafiocalculofrete.services.TabelaTaxaVeiculo;
import br.com.fiap.desafiocalculofrete.services.TabelaTaxaVeiculoPesado;

public class Caminhao extends Veiculo{

    private int quantidadeQuiloDaCarga;

    public Caminhao(int quantidadeQuiloDaCarga, double distancia) {
        super(0, new TabelaTaxaVeiculoPesado(), distancia);
        this.quantidadeQuiloDaCarga = quantidadeQuiloDaCarga;
    }

    @Override
    public double obterCustoCombustivel() {
        return 0;
    }

    @Override
    public double obterValorTransporte() {
        return 0;
    }
}
