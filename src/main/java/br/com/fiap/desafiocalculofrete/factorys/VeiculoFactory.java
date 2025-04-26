package br.com.fiap.desafiocalculofrete.factorys;

import br.com.fiap.desafiocalculofrete.entities.*;
import br.com.fiap.desafiocalculofrete.services.TabelaTaxaVeiculo;

public class VeiculoFactory {

    public static Veiculo criarCarro(int passageiros, TabelaTaxaVeiculo tabela, double distancia) throws Exception {
        return new Carro(passageiros, tabela, distancia);
    }

    public static Veiculo criarCaminhao(int quantidadeQuiloDaCarga, TabelaTaxaVeiculo tabelaTaxa, double distancia) {
        return new Caminhao(quantidadeQuiloDaCarga, tabelaTaxa, distancia);
    }

    public static Veiculo criarBicicleta(int passageiros, TabelaTaxaVeiculo tabela, double distancia) {
        return new Bicicleta(passageiros, tabela, distancia);
    }
}
