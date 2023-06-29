package br.ce.adrianobasetres.suites;

import br.ce.adrianobasetres.ContaTest.*;
import br.ce.adrianobasetres.core.DriverFactory;
import br.ce.adrianobasetres.pages.LoginPage;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ContaTest.class,
        MovimentacaoTest.class,
        RemoverMovimentacaoContaTest.class,
        SaldoTest.class,
        ResumoTest.class
})
public class SuiteGeral {

    private static LoginPage page = new LoginPage();
    @BeforeClass
    public static void inicializa(){
        page.acessarTelaInicial();
        page.setEmail("adrianobianchi@outlook.com");
        page.setPassword("tamires22");
        page.entrar();
    }

    @AfterClass
    public static void finaliza(){
        DriverFactory.killDriver(); //Fechando o Browser
    }
}
