package br.com.fiap.desafiocalculofrete;

import br.com.fiap.desafiocalculofrete.entities.Bicicleta;
import br.com.fiap.desafiocalculofrete.exceptions.QuantidadePassageiroInvalidoException;
import br.com.fiap.desafiocalculofrete.services.TabelaTaxaVeiculoLeve;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BicicletaUnitTest {

    @Test
    void shouldSucessOnObterCustoCombustivel() {
        final var quantidadePassageiros = 1;
        final var tabelaTaxa = new TabelaTaxaVeiculoLeve();
        final var distancia = 5D;

        var veiculo =
                new Bicicleta(quantidadePassageiros, tabelaTaxa, distancia);

        assertEquals(0D, veiculo.obterCustoCombustivel());
        assertEquals(0.6D, veiculo.obterValorTransporte(), 0.1);
        assertEquals(3D, veiculo.obterValorTotal(), 0.1);
    }

    @Test
    void shouldQuantidadePassageiroInvalidoExceptionOnObterCustoCombustivel() {
        assertThrows(QuantidadePassageiroInvalidoException.class,
                () -> new Bicicleta(2, new TabelaTaxaVeiculoLeve(), 5D));
    }

}
