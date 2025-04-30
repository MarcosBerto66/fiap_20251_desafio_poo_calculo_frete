package br.com.fiap.desafiocalculofrete.entities;

import br.com.fiap.desafiocalculofrete.services.TabelaTaxaVeiculo;
import lombok.Getter;

@Getter
public abstract class Veiculo {

    private int quantidadePassageiros;
    private double distancia;
    private TabelaTaxaVeiculo tabelaTaxa;

    public Veiculo(int quantidadePassageiros, TabelaTaxaVeiculo tabelaTaxa, double distancia ){
        validarDistancia(distancia);
        this.quantidadePassageiros = quantidadePassageiros;
        this.tabelaTaxa = tabelaTaxa;
        this.distancia = distancia;
    }

    private void validarDistancia(double distancia){
        if(distancia < 1){
            throw new IllegalArgumentException("A distância deve ser maior ou igual a 1 km.");
        }
    }

    public double obterValorTotal(){
        return (obterCustoCombustivel() + obterValorTransporte()) * this.distancia;
    }

    public abstract double obterCustoCombustivel();

    public abstract double obterValorTransporte();



}
