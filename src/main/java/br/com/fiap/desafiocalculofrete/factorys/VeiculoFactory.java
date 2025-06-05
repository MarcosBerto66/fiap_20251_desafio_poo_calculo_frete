package br.com.fiap.desafiocalculofrete.factorys;

import br.com.fiap.desafiocalculofrete.entities.*;
import br.com.fiap.desafiocalculofrete.services.TabelaTaxaVeiculo;

public class VeiculoFactory {

    public static Veiculo obterCarro(int passageiros, TabelaTaxaVeiculo tabela, double distancia) throws Exception {
        return new Carro(passageiros, tabela, distancia);
    }

   public static Veiculo obterCaminhao(int quantidadeQuiloDaCarga, TabelaTaxaVeiculo tabelaTaxa, double distancia) throws Exception {
        return new Caminhao(quantidadeQuiloDaCarga, tabelaTaxa, distancia);
    }

    public static Veiculo obterBicicleta(int passageiros, TabelaTaxaVeiculo tabelaTaxa, double distancia) {
        return new Bicicleta(passageiros, tabelaTaxa, distancia);
    }
}
