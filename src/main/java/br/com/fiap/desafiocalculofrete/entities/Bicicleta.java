package br.com.fiap.desafiocalculofrete.entities;

import br.com.fiap.desafiocalculofrete.services.TabelaTaxaVeiculo;
import br.com.fiap.desafiocalculofrete.services.TabelaTaxaVeiculoLeve;

public class Bicicleta extends Veiculo{

    public Bicicleta(int quantidadePassageiros, double distancia) {
        super(quantidadePassageiros, new TabelaTaxaVeiculoLeve(), distancia);
    }
}
