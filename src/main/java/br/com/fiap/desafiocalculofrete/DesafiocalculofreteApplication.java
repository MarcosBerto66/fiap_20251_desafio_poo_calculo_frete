package br.com.fiap.desafiocalculofrete;

import br.com.fiap.desafiocalculofrete.entities.Veiculo;
import br.com.fiap.desafiocalculofrete.services.TabelaTaxaVeiculo;
import br.com.fiap.desafiocalculofrete.services.TabelaTaxaVeiculoLeve;
import org.springframework.boot.SpringApplication;
import br.com.fiap.desafiocalculofrete.factorys.VeiculoFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DesafiocalculofreteApplication {

	private static VeiculoFactory veiculoFactory = new VeiculoFactory();
	public static void main(String[] args) throws Exception {

		Veiculo carro = obterCarro();
		/*Veiculo caminhao = obterCaminhao();
		Veiculo bicicleta = obterBicicleta();

		List<Veiculo> veiculos = new ArrayList<>();
		veiculos.add(carro);
		veiculos.add(caminhao);
		veiculos.add(bicicleta);

		Double precoTotal = 0D;
		for (Veiculo veiculo : veiculos) {
			precoTotal += veiculo.obterValorTotal();
		}

		System.out.println("Preço total: " + precoTotal);*/
	}

	private static Veiculo obterCarro() throws Exception {
		TabelaTaxaVeiculo tabelaTaxaVeiculo = new TabelaTaxaVeiculoLeve();
		return veiculoFactory.obterCarro(4, tabelaTaxaVeiculo, 20);
	}

	private Veiculo obterCaminhao() throws Exception {
		TabelaTaxaVeiculo tabelaTaxaVeiculo = new TabelaTaxaVeiculoLeve();
		return veiculoFactory.obterCaminhao(4, tabelaTaxaVeiculo, 20);
	}

}
