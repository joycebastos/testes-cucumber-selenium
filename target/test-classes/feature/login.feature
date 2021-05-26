# language: pt
Funcionalidade: Cadastrar Novo Usuário
  Sendo um usuário existente
  Quero efetuar o cadastro no site das Americanas
  Para fazer compras

  Cenario: Cadastrar usuário existente
    Dado que estou na página inicial das Americanas
    E cliquei em cliente novo? Cadastrar
    E preenchi o email com "teste@hotmail.com"
    E preenchi a senha com "12345678"
    Quando clicar em Criar seu cadastro
    Então devo receber a seguinte mensagem "E-mail já cadastrado"

  Cenario: Cadastrar usuário com senha fraca
    Dado que estou na página inicial das Americanas
    E cliquei em cliente novo? Cadastrar
    E preenchi o email com "teste@hotmail.com"
    Quando preencher a senha com "ab"
    Então devo receber um alerta de senha fraca

  Cenario: Cadastrar usuário com um CPF inválido
    Dado que estou na página inicial das Americanas
    E cliquei em cliente novo? Cadastrar
    E preenchi o email com "teste@hotmail.com"
    Quando preencher o CPF com  "51162967000100"
    Então devo receber um alerta CPF inválido



