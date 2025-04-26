package br.com.fiap.desafiocalculofrete.entities;

import br.com.fiap.desafiocalculofrete.services.TabelaTaxaVeiculo;

public class Bicicleta extends Veiculo{

    public Bicicleta(int quantidadePassageiros, TabelaTaxaVeiculo tabelaTaxa, double distancia) {
        super(quantidadePassageiros, tabelaTaxa, distancia);
    }
}
