package org.medioAmbiente.CAP_F_101.step;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.CAP_F_101.page.CAP_F_101Page;
import org.openqa.selenium.JavascriptExecutor;


public class CAP_F_101Step extends ScenarioSteps {

    private CAP_F_101Page CAP_F_057Page;

    @Step
    public void cargarPagina() throws InterruptedException {
        CAP_F_057Page.open();
        getDriver().manage().window().maximize();
    }

    @Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
//
        j.executeScript("window.scrollTo(0,0)");
        CAP_F_057Page.aceptarCookies();

    }

    @Step
    public void limpiarCampos() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollTo(0,950)");

        CAP_F_057Page.clickLimpiarCampos();
    }

    @Step
    public void buscar() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollTo(0,1000)");

        CAP_F_057Page.clickBuscar();

        j.executeScript("window.scrollTo(0,100)");
        Thread.sleep(5000);
    }

    @Step
    public void escribirBuscarPorPalabras(String entradaTexto) throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollTo(0,80)");

        CAP_F_057Page.escribirBusquedaPorPalabra(entradaTexto);
    }

    @Step
    public void clickDropDownProvincias(String entradaTexto) throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollTo(0,170)");

        CAP_F_057Page.clickDropDownProvincias(entradaTexto);
    }

    @Step
    public void clickDropDownCategorias(String entradaTexto) throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollTo(0,270)");

        CAP_F_057Page.clickDropDownCategorias(entradaTexto);
    }

    @Step
    public void clickDropDownSubCategorias(String entradaTexto) throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollTo(0,420)");

        CAP_F_057Page.clickDropDownSubCategorias(entradaTexto);
    }

    @Step
    public void clickDropDownTipoArchivo(String entradaTexto) throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollTo(0,550)");

        CAP_F_057Page.clickDropDownTipoArchivo(entradaTexto);
    }

    @Step
    public void clickdropDownMenuTipoEquipamento(String entradaTexto) throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollTo(0,700)");

        CAP_F_057Page.clickDropDownMenuTipoEquipamento(entradaTexto);
    }

    @Step
    public void clickDropDownMenuEspaciosNaturales(String entradaTexto) throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollTo(0,830)");

        CAP_F_057Page.clickDropDownMenuEspaciosNaturales(entradaTexto);
    }

    @Step
    public void clickDropDownMenuNombreEspacioNatural(String entradaTexto) throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollTo(0,970)");

        CAP_F_057Page.clickDropDownMenuNombreEspacioNatural(entradaTexto);
    }
}