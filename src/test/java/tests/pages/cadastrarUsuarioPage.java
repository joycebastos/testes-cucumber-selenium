package tests.pages;

import Util.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cadastrarUsuarioPage extends basePage {

    public cadastrarUsuarioPage(WebDriver driver) {
        super(driver);
    }


    public cadastrarUsuarioPage preencherEmail(String email) {
        driver.findElement((By.id("email-input"))).sendKeys(email);
        return this;
    }

    public void preencherSenha(String senha) {
        driver.findElement((By.id("password-input"))).sendKeys(senha);
    }

    public cadastrarUsuarioPage botaoCriarSeuCadastro() {
        driver.findElement((By.xpath("//*[@id=\"root\"]/div/div[2]/form/button"))).click();
        return this;
    }


}
