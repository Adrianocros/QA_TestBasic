package br.ce.adrianobasetres.ContaTest;

import br.ce.adrianobasetres.pages.ContasPage;
import br.ce.adrianobasetres.pages.MenuPage;
import br.ce.adrianobasetres.core.BaseTest;
import org.junit.Assert;
import org.junit.Test;


public class ContaTest extends BaseTest {

    private MenuPage menuPage = new MenuPage();
    private ContasPage contasPage = new ContasPage();

    @Test
    public void testInseriConta(){
        menuPage.acessarTelaInserirConta();
        contasPage.setNome("Adriano Bianchi");
        contasPage.salvarConta();

        Assert.assertEquals("Conta adicionada com sucesso!",contasPage.mensagemSucesso());
    }

    @Test
    public void testAlterarConta(){
    menuPage.acessarTelaAlterarConta();

    contasPage.clicarAlterarConta("Adriano Bianchi");
    contasPage.setNome("Adriano Bianchi C");
    contasPage.salvarConta();

    Assert.assertEquals("Conta alterada com sucesso!",contasPage.mensagemSucesso());
    }

    @Test
    public void testInserirContaMesmoNome(){
       menuPage.acessarTelaInserirConta();
       contasPage.setNome("Adriano Bianchi C");
       contasPage.salvarConta();

       Assert.assertEquals("Já existe uma conta com esse nome!",contasPage.mensagemContaMesmoNome());
    }

    @Test
    public void testExcluirContaComMovimentatacao(){
        menuPage.acessarTelaAlterarConta();
        contasPage.clicarExcluirConta("Adriano Bianchi");
        Assert.assertEquals("Conta em uso na movimentações",contasPage.mensagemContaComMovimentacao());
    }
}