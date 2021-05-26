# testes-cucumber-selenium

Tecnologias utilizadas:
Selenium
Cucumber
Maven

Linguagem: Java

Prática utilizada: BDD (Behavior Driven Development)

Os cenários foram descritos utilizando BDD.

Para rodar os cenários é necessário verificar a versão do browser instalada no computador e baixar o driver correspondete a versão.
Por exemplo, para rodar os testes o crhome, é preciso verificar a versão do chrome no computador e baixar o driver correspondete em https://chromedriver.chromium.org/downloads

Nestes testes a versão do chroem é 86 e o drive é Supports Chrome version 86

Design Patterns utilizado nos testes: Page objects e BDD

Estrutura dos testes
- JAVA
  -br.com.dextra.teste
    - pages : encontram-se as page objects que contém as ações dos cenários
    - runner :  encontra-se a geração de relatórios
    - steps : encontram-se a implementação de cada passo escrito nos cenários de BDD (dentro da pasta features). As Steps chamam as ações contidas em page objects. Nas steps a única ação executada são as de asserções.
