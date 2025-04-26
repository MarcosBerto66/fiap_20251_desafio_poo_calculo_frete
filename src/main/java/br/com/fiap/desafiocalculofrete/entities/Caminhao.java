package br.com.fiap.desafiocalculofrete.entities;

import br.com.fiap.desafiocalculofrete.services.TabelaTaxaVeiculo;

public class Caminhao extends Veiculo{

    private int quantidadeQuiloDaCarga;

    public Caminhao(int quantidadeQuiloDaCarga, TabelaTaxaVeiculo tabelaTaxa, double distancia) {
        super(0, tabelaTaxa, distancia);
        this.quantidadeQuiloDaCarga = quantidadeQuiloDaCarga;
    }
}
