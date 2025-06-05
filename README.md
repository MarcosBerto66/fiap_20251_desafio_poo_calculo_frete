# Desafio POO - Cálculo de Frete

Este projeto é uma aplicação Java desenvolvida como parte de um desafio de Programação Orientada a Objetos (POO). Ele implementa uma estrutura básica para gerenciar veículos, utilizando conceitos como herança e abstração. O projeto também inclui uma classe utilitária para calcular taxas baseadas em peso, distância e quantidade de passageiros.
## 📦 Estrutura do Projeto

```
src/
 ├── main/
 │    └── java/
 │         └── br/com/fiap/desafiocalculofrete/
 │              ├── DesafiocalculofreteApplication.java
 │              ├── entities/
 │              │     ├── Bicicleta.java
 │              │     ├── Caminhao.java
 │              │     ├── Carro.java
 │              │     └── Veiculo.java
 │              ├── exceptions/
 │              │     ├── QuantidadePassageiroInvalidoException.java
 │              │     └── QuantidadeCargaInvalidaException.java
 │              ├── factorys/
 │              │     └── VeiculoFactory.java
 │              └── services/
 │                    ├── TabelaTaxaVeiculo.java
 │                    ├── TabelaTaxaVeiculoLeve.java
 │                    └── TabelaTaxaVeiculoPesado.java
 └── test/
      └── java/br/com/fiap/desafiocalculofrete/
            ├── BicicletaUnitTest.java
            ├── CaminhaoUnitTest.java
            ├── CarroUnitTest.java
            └── DesafiocalculofreteApplicationTests.java
```

## 🚗 Funcionalidades

- **Cálculo de frete** para diferentes tipos de veículos (Carro, Caminhão, Bicicleta)
- **Validação de regras** específicas para cada veículo (ex: quantidade de passageiros, peso da carga)
- **Extensível**: fácil adicionar novos tipos de veículos e regras de cálculo
- **Testes unitários** para garantir a qualidade do código

## 🛠️ Tecnologias Utilizadas

- Java 21
- Spring Boot
- JUnit 5
- Lombok

## 🏗️ Padrões de Projeto Aplicados

- **Herança e Polimorfismo**: Veículos são subclasses de uma classe abstrata `Veiculo`
- **Strategy**: Interface `TabelaTaxaVeiculo` para diferentes estratégias de cálculo de taxa
- **Factory Method**: Classe `VeiculoFactory` para centralizar a criação de veículos
- **Exceptions customizadas**: Para regras de negócio

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repo.git
   ```
2. Entre na pasta do projeto:
   ```bash
   cd desafio_poo
   ```
3. Compile e execute:
   ```bash
   ./mvnw spring-boot:run
   ```
   ou no Windows:
   ```cmd
   mvnw.cmd spring-boot:run
   ```

## 🧪 Testes

Execute os testes unitários com:
```bash
./mvnw test
```

## 📄 Exemplo de Uso

O método `main` da classe `DesafiocalculofreteApplication` instancia diferentes veículos e calcula o preço total do frete:

```java
Veiculo carro = veiculoFactory.obterCarro(1, new TabelaTaxaVeiculoLeve(), 100);
Veiculo caminhao = veiculoFactory.obterCaminhao(15, new TabelaTaxaVeiculoPesado(), 40);
Veiculo bicicleta = veiculoFactory.obterBicicleta(1, new TabelaTaxaVeiculoLeve(), 20);

List<Veiculo> veiculos = List.of(carro, caminhao, bicicleta);
double precoTotal = veiculos.stream().mapToDouble(Veiculo::obterValorTotal).sum();
System.out.println("Preço total: " + precoTotal);
```

## ➕ Como Adicionar um Novo Veículo

1. Crie uma nova classe em `entities` estendendo `Veiculo`.
2. Implemente os métodos abstratos e regras específicas.
3. (Opcional) Crie uma nova implementação de `TabelaTaxaVeiculo` se necessário.
4. Adicione um método correspondente na `VeiculoFactory`.

## 📃 Licença

[MIT License](LICENSE)

---

Desenvolvido por Marcos Berto Pereira para o desafio FIAP 2025.
