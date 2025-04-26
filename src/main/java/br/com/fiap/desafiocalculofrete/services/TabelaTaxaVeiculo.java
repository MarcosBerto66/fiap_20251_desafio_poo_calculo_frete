package br.com.fiap.desafiocalculofrete.services;

public interface TabelaTaxaVeiculo {

    Double obterPorPassageiro(int quantidade);
    Double obterPorDistanciaEmQuilometros(double km);
    Double obterPorPesoEmQuilo(double kg);
}
