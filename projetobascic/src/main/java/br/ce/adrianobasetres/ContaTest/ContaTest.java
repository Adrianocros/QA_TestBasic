package br.ce.adrianobasetres.ContaTest;

import br.ce.adrianobasetres.pages.ContasPage;
import br.ce.adrianobasetres.pages.MenuPage;
import br.ce.adrianobasetres.core.BaseTest;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContaTest extends BaseTest {


    private MenuPage menuPage = new MenuPage();
    private ContasPage contasPage = new ContasPage();

    @Test
    public void test1_InseriConta(){
        menuPage.acessarTelaInserirConta();
        contasPage.setNome("Adriano Bianchi");
        contasPage.salvarConta();

        Assert.assertEquals("Conta adicionada com sucesso!",contasPage.mensagemSucesso());
    }

    @Test
    public void test2_AlterarConta(){
    menuPage.acessarTelaAlterarConta();

    contasPage.clicarAlterarConta("Adriano Bianchi");
    contasPage.setNome("Adriano Bianchi C");
    contasPage.salvarConta();
    Assert.assertEquals("Conta alterada com sucesso!",contasPage.mensagemSucesso());
    }

    @Test
    public void test3_InserirContaMesmoNome(){
       menuPage.acessarTelaInserirConta();
       contasPage.setNome("Adriano Bianchi C");
       contasPage.salvarConta();

       Assert.assertEquals("Já existe uma conta com esse nome!",contasPage.mensagemContaMesmoNome());
    }
}