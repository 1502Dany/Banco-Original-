
@tag
Feature: Abertura de conta
  I want to use this template for my feature file

  @tag1
  Scenario: Abertura de conta pessoa fisica 
 # Given que o usuario acesse a url "https://www.original.com.br/"
  #And selecionar o botao abrir conta 
#  And selecionar o botao abrir conta para voce
#  When preencher o formulario de abertura de conta 
#  And selecionar o botao quero ser cliente 
#  Then sera exibido o texto falta pouco 
   

@tag2
Scenario:  Abertura de conta pessoa juridica dani
  Given que o usuario acesse a url "https://www.original.com.br/"
  And selecionar o botao abrir conta 
  And selecionar o botao abrir conta para sua empresa
  And selecionar o botao pessoa unica
  When preencher o formulario de abertura de conta 
  Then selecionar o botao enviar
  
   

   