package br.ce.adrianobasetres.pages;

import br.ce.adrianobasetres.core.BasePage;
import br.ce.adrianobasetres.core.DriverFactory;

public class LoginPage extends BasePage {

    public void acessarTelaInicial(){
        DriverFactory.getDriver().get("https://seubarriga.wcaquino.me/");
    }

    public void setEmail(String email){
        escrever("email",email);
    }

    public void setPassword(String pass){
        escrever("senha",pass);
    }

    public void entrar(){
        clicarBotaoPorTexto("Entrar");
    }

    public void logar(String email, String pass){
        setEmail(email);
        setPassword(pass);
        entrar();
    }
}
