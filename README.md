**Teste Heidy Saar - GitHub**

Este documento tem como finalidade explicar como foi realizado os testes e como configurar o ambiente Cucumber para execução dos teste automatizados. 

---

# Primeira e segunda etapa do Teste

Etapa 1 - Levantamento dos bugs

Funcionalidade: qadatake
    Como usuario do site qadatake
    Gostaria de ter acesso a uma receita de bolo
    Para poder aprender como fazer um bolo

    Criterios de aceitação
        - Ao acessar a pagina https://qadatake.wordpress.com/2018/07/12/the-journey-begins/ devo ter acesso imediato a receita de bolo.
        - O site tem que ter um are de comentarios para o usuario poder dar sugestoes.
        - O deve ter um campo de busca global.
        - O site deve ter uma pagina contendo todas as receitas de bolo ja cadastradas.
        - O site deve possui uma are de contato com o dono do site.

@bugs
    Título: 
        Acesso as receitas do site não esta carregando.

    Criticidade: 
        Alta

    Prioridade: 
        Alta

    Passo a passo para reproduzir o bug: 
        1 - Acesse a pagina https://qadatake.wordpress.com/2018/07/12/the-journey-begins/
        2 - clique em "menu" e logo em seguida clique em "Receitas"
        3 - Observe o erro ocorrendo.

    Resultado esperado:
        Ao acessar o menu de "Receita" o usuario podera ver em forma de lista todas as receitas ja cadastradas no site qadatake, ordenadas
        por tipo e categorias.


@melhorias

     Ao clicar sobre a imagem do bolo, ele poderia apenas apresentar um zoom na imagem, como e o de costume em varios sites.

     O acesso ao menu poderia ser mais didatico abrindo um especie de sanfona de menu contendo todos os acesso la, sem a nescessidade
        de mudar para outra pagina.
        
     O sistema de pesquisa poderia ter um botão de "pesquisar", nem sempre apertar a tecla enter e intuitivo.


Etapa 2 - Correção do Bug

    O bug a ser corrigido é o "Acesso as receitas do site não esta carregando." mediante a criticidade do erro, o sistema possui uma 
    pagina de receitas que e extremamente usual para o usuario final porem ela não esta carregando, impossibilitando o usuario de ter
    acesso a outras receitas.

---

# Terceira Etapa do teste - Automação

Na tereceira etapa do teste, foi realizado dois cenarios automatizado, uma no envio de dados para contato, e outro no acesso a lista de receitas, ambos foram realizados ultilizando a ferramenta Cucumber para especificação de cenarios, liguagem Ruby para a condificação do teste e o Selenium para interação com webdrive.

O motivo por eu ter escolhidos esses dois cenarios foi por que ambas as ferramentas são de importancia para o usuario, e como uma delas ja apresenta um bug, achei oportuno aproveitar essa oportunidade para mostrar como o Cucumber evidencia esse tipo de falha.

Todo o teste foi realizado usando o Fedora 28 como SO.

O segundo cenario esta apresentando uma falha ate o presente momento devido ao bug reportado na primeira fase, apos a correção do bug, o cenario funcionara corretamente.


Abaixo segue os passos para montar o ambiente e execução deste teste.

## Montando o Ambiente

1. Faça a Clonagem do repositorio take.com para um repositorio de sua preferencia em sua maquina.
2. Acesse a pasta /take.com/cucumberteste/tests.
3. Dentro da pasta execulte o comando "bundle install" para instalar todas as dependencias do projeto.
4. Feito a instalação, acesse o site do [geckodriver](https://github.com/mozilla/geckodriver/releases) e baixe a versão v0.20.1 de acordo com o sistema operacional.
5. Apos o termino do Download, extraia o executável do geckodriver e copie ele para a pasta /bin/.

Apos a execução destes 5 passos, o ambiente para execução dos testes esta pronto.

---

## Rodando os Teste e Coletando Evidencias

1. Acesse a pasta /take.com/cucumberteste/tests
2. Execulte o comando "cucumber features/specs/TesteAutomatizado.feature"
3. Apos o termino da execução, todas as evidencias coletadas poderam ser vista no arquivo maxmilhas/cucumberteste/tests/results/report.html
4. Em casos de falha no teste, e coletado uma evidencia no formato print que pode ser vista clicando em "Clique aqui para ver a evidência", no final de todos os steps presente no arquivo report.htm

## Estrutura Dos Testes

Todos os cenarios e especificações realizadas podem ser encontradas dentro da pasta /take.com/cucumberteste/tests/features/specs.

Toda condificação do teste automatizado pode ser encontrada dentro da pasta /take.com/cucumberteste/tests/features/step_definitions e sua strutura de pageobjects dentro da pasta /take.com/cucumberteste/tests/features/pages.

Demais pastas são ultilizadas como strutura de configuração e suporte para o projeto. 
