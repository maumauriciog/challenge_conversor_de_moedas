# Conversor de Moedas [![This project is using Percy.io for visual regression testing.](https://percy.io/static/images/percy-badge.svg)](https://percy.io/b2e34b17/openmct) [![npm version](https://img.shields.io/npm/v/openmct.svg)](https://www.npmjs.com/package/openmct) ![CodeQL](https://github.com/nasa/openmct/workflows/CodeQL/badge.svg)
O Challenge Conversor de Moedas, é um projeto final do curso de java - orientação a objetos. Ofereça interação textual (via console) com os usuários, proporcionando no mínimo 6 opções distintas de conversões de moedas em um menu. A taxa de conversão não será estática, mas sim dinamicamente obtida por meio de uma API, garantindo dados precisos em tempo real para uma experiência mais atualizada e eficaz.

- **objetivo**

> Via console, o usuário vai entrar com a opção que deseja dentro desse menu, e depois disso vai informar qual é o valor que deseja converter.

- **o que encontrar**

> o usuário terá 06(seis) opçoes de escolha para a conversão de moedas.

- **customizável**

> o usuário vai poder realizar a conversão quantas vezes for necessário enquanto o programa estiver em execução, evitando encerrar para obter uma nova consulta.

## Compilando e Executando o Conversor de Moedas
Certifique-se de ter o [intelliJ](https://www.jetbrains.com/idea/download/?section=windows) e a biblioteca [GSON](https://mvnrepository.com/search?q=GSON) instalados e baixado, e siga as instruções conforme abaixo:
1. Faça download do código fonte:

```sh
https://github.com/maumauriciog/challenge_conversor_de_moedas
```

2. Instale a biblioteca GSON, após download (Instale após abrir o código fonte no intelliJ - o programa precisa desta biblioteca instalada para garantir seu funcionamento):

&emsp;&emsp;<img src="pictures/scrA.png" width="210">&emsp;<img src="pictures/scrB.png" width="243">&emsp;<img src="pictures/scrC.png" width="238">

```
- vá ao menu File do intelliJ e escolha a opção 'Project Structure'
- click e 'Modules'
- click em 'Dependencies' no lado direito
- click no sinal de '+'
- click na opção 'JARs or Directories'
- selecione a biblioteca GSON baixada anteriormente
```

3. Execute o programa:

&emsp;&emsp;<img src="pictures/scrD.png" width="338">

```
- click em 'Run Main'
- ou Shift F10
```

> [!IMPORTANTE]
> O programa somente funciona local, utilizando uma IDE, no caso o intelliJ com a biblioteca GSON instalada.

## Utilizando o Programa em Execução

O usuário terá de escolha uma das 06(seis) opções conforme mostra abaixo:
```bash
----------------------------------------
Seja bem vindo ao Conversor de Moedas !
----------------------------------------
1). Dolar -> Peso Argentino
2). Peso Argentino -> Dolar
3). Dolar -> Real Brasileiro
4). Real Brasileiro -> Dolar
5). Dolar -> Peso Colombiano
6). Peso Colombiano -> Dolar
7). Sair

-> Escolha uma opção válida: _
```

## Contributing

We've released Docusaurus because it helps us better scale and supports the many OSS projects at Meta. We hope that other organizations can benefit from the project. We are thankful for any contributions from the community.

### [Code of Conduct](https://code.fb.com/codeofconduct)

Meta has adopted a Code of Conduct that we expect project participants to adhere to. Please read [the full text](https://code.fb.com/codeofconduct) so that you can understand what actions will and will not be tolerated.

### Contributing guide

Read our [contributing guide](https://github.com/facebook/docusaurus/blob/main/CONTRIBUTING.md) to learn about our development process, how to propose bugfixes and improvements, and how to build and test your changes to Docusaurus.

### Beginner-friendly bugs

To help you get your feet wet and get you familiar with our contribution process, we have a list of [beginner-friendly bugs](https://github.com/facebook/docusaurus/labels/good%20first%20issue) that might contain smaller issues to tackle first. This is a great place to get started.

## Contato

Temos os seguintes canais para contato:

- maumauriciog@hotmail.com
  - `no campo Assunto escreva: Ajuda` para assuntos de como utilizar o sistema; e
  - `no campo Assunto escreva: Quero Contribuir` para aqueles que desejam contribuir.
- [GitHub](https://github.com/maumauriciog)


## Licensa

Docusaurus is [MIT licensed](./LICENSE).
The Docusaurus documentation (e.g., `.md` files in the `/docs` folder) is [Creative Commons licensed](./LICENSE-docs).


## Agradecimento Especiais

<p>
  <a href="http://www.browserstack.com/" target="_blank">
    <picture>
      <source media="(prefers-color-scheme: dark)" srcset="./admin/img/browserstack-dark-mode-logo.svg#gh-dark-mode-only">
      <img alt="BrowserStack logo" src="./admin/img/browserstack-light-mode-logo.svg#gh-light-mode-only" height="50px" />
    </picture>
  </a>
</p>

[BrowserStack](http://www.browserstack.com/) supports us with [free access for open source](https://www.browserstack.com/open-source).

[![Rocket Validator logo](./admin/img/rocketvalidator-logo.png)](https://rocketvalidator.com/)

[Rocket Validator](https://rocketvalidator.com/) helps us find HTML markup or accessibility issues.
