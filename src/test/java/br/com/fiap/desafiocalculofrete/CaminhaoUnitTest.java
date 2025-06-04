package br.com.fiap.desafiocalculofrete;

import br.com.fiap.desafiocalculofrete.entities.Caminhao;
import br.com.fiap.desafiocalculofrete.exceptions.QuantidadeCargaInvalidaException;
import br.com.fiap.desafiocalculofrete.services.TabelaTaxaVeiculoLeve;
import br.com.fiap.desafiocalculofrete.services.TabelaTaxaVeiculoPesado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CaminhaoUnitTest {

    @Test
    void shouldSucessOnObterCustoCombustivel() {
        final var quantidadeQuiloDaCarga = 50D;
        final var tabelaTaxa = new TabelaTaxaVeiculoPesado();
        final var distancia = 100D;

        var veiculo =
                new Caminhao(quantidadeQuiloDaCarga, tabelaTaxa, distancia);
        assertEquals(0.2D, veiculo.obterCustoCombustivel());
        assertEquals(0.2D, veiculo.obterValorTransporte());
        assertEquals(40D, veiculo.obterValorTotal());
    }

    @Test
    void shouldSucessWithMoreTaxOnObterCustoCombustivel() {
        final var quantidadeQuiloDaCarga = 14D;
        final var tabelaTaxa = new TabelaTaxaVeiculoPesado();
        final var distancia = 10D;

        var veiculo =
                new Caminhao(quantidadeQuiloDaCarga, tabelaTaxa, distancia);
        assertEquals(0.7D, veiculo.obterCustoCombustivel());
        assertEquals(0.6D, veiculo.obterValorTransporte(), 0.1);
        assertEquals(13D, veiculo.obterValorTotal());
    }

    @Test
    void shouldQuantidadePassageiroInvalidoExceptionOnObterCustoCombustivel() {
        assertThrows(QuantidadeCargaInvalidaException.class, () -> new Caminhao(-1D, new TabelaTaxaVeiculoLeve(), 5D));
        assertThrows(QuantidadeCargaInvalidaException.class, () -> new Caminhao(301D, new TabelaTaxaVeiculoLeve(), 5D));
    }

}
