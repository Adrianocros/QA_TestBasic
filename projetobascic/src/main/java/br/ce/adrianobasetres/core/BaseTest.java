package br.ce.adrianobasetres.core;

import br.ce.adrianobasetres.pages.LoginPage;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class BaseTest {
    private LoginPage page = new LoginPage();

    @Rule
    public TestName testName = new TestName();

    @Before
    public void inicializa(){
        page.acessarTelaInicial();
        page.setEmail("adrianobianchi@outlook.com");
        page.setPassword("tamires22");
        page.entrar();
    }
    @After
    public void finaliza() throws IOException {
        TakesScreenshot ss = (TakesScreenshot) DriverFactory.getDriver();
        File arquivo = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(arquivo, new File( "screenshot"
                + File.separator + "TelasDe_"
                + testName.getMethodName()
                + ".jpg"));

        if(Propriedades.FECHAR_BROWSER)
        DriverFactory.killDriver();
    }
}
