package br.com.fiap.desafiocalculofrete.entities;

import br.com.fiap.desafiocalculofrete.exceptions.QuantidadeCargaInvalidaException;
import br.com.fiap.desafiocalculofrete.services.TabelaTaxaVeiculo;
import br.com.fiap.desafiocalculofrete.services.TabelaTaxaVeiculoPesado;
import lombok.Getter;

@Getter
public class Caminhao extends Veiculo{

    private double quantidadeQuiloDaCarga;

    private static final int MINIMO_CARGA_KG = 1;
    private static final int MAXIMO_CARGA_KG = 300;

    public Caminhao(double quantidadeQuiloDaCarga, TabelaTaxaVeiculo tabelaTaxaVeiculo, double distancia) {
        super(0, tabelaTaxaVeiculo, distancia);
        this.quantidadeQuiloDaCarga = quantidadeQuiloDaCarga;
        validarQuantidadeCarga(quantidadeQuiloDaCarga);
    }

    private void validarQuantidadeCarga(double quantidadeQuiloDaCarga) {
        if (!(quantidadeQuiloDaCarga >= MINIMO_CARGA_KG && quantidadeQuiloDaCarga <= MAXIMO_CARGA_KG)) {
            throw new QuantidadeCargaInvalidaException(
                    "Quantidade de carga inválida: o valor deve estar entre "
                            + MINIMO_CARGA_KG + "kg e " + MAXIMO_CARGA_KG + "kg."
            );
        }
    }
    @Override
    public double obterCustoCombustivel() {
        var distancia = this.getDistancia();
        var taxa = this.getTabelaTaxa().obterPorDistanciaEmQuilometros(distancia);
        return distancia < 100 ? taxa + 0.3D : taxa;
    }

    @Override
    public double obterValorTransporte() {
        var peso = this.getQuantidadeQuiloDaCarga();
        var taxa = this.getTabelaTaxa().obterPorPesoEmQuilo(peso);
        return peso < 50 ? taxa + 0.2D : taxa;
    }
}
