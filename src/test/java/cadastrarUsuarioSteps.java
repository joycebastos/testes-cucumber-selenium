import Util.browser;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.E;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.pages.cadastrarUsuarioPage;

import static org.junit.Assert.assertEquals;

public class cadastrarUsuarioSteps {


        private WebDriver driver = browser.chromeBrowsing();

        @Dado("^que estou na página inicial das Americanas$")
        public void que_estou_na_página_inicial_das_Americanas() throws Throwable {
            driver.get("https://www.americanas.com.br/");

        }

        @Dado("^cliquei em cliente novo\\? Cadastrar$")
        public void cliquei_em_cliente_novo_Cadastrar() throws Throwable {
            driver.findElement(By.id("h_usr-link")).click();
            driver.findElement(By.xpath("//*[@id=\"h_user\"]/span[2]/div/a[2]")).click();
        }

        @Dado("^preenchi o email com \"([^\"]*)\"$")
        public void preenchi_o_email_com(String email) throws Throwable {
            new cadastrarUsuarioPage(driver).preencherEmail(email);
        }

        @Dado("^preenchi a senha com \"([^\"]*)\"$")
        public void preenchi_a_senha_com(String senha) throws Throwable {
            new cadastrarUsuarioPage(driver).preencherSenha(senha);
        }

        @Quando("^clicar em Criar seu cadastro$")
        public void clicar_em_Criar_seu_cadastro() throws Throwable {
            new cadastrarUsuarioPage(driver).botaoCriarSeuCadastro();

        }

        @Então("^devo receber a seguinte mensagem \"([^\"]*)\"$")
        public void devo_receber_a_seguinte_mensagem(String arg1) throws Throwable {
            assertEquals("E-mail já cadastrado", driver.findElement(By.xpath("//*[@id=\"email\"]/div")).getText());
        }

        @Quando("^preencher a senha com \"([^\"]*)\"$")
        public void preencher_a_senha_com(String senha) throws Throwable {
            new cadastrarUsuarioPage(driver).preencherSenha(senha);
        }

        @Então("^devo receber um alerta de senha fraca$")
        public void devo_receber_um_alerta_de_senha_fraca() throws Throwable {
            assertEquals("fraca", driver.findElement(By.xpath("//*[@id=\"password\"]/div/span")).getText());
        }

        @After
        public void closeBrowser() throws Throwable {
            driver.quit();
        }
}
