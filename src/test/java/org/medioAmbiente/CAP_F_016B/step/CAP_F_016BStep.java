package org.medioAmbiente.CAP_F_016B.step;

import org.medioAmbiente.CAP_F_016B.page.CAP_F_016BPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.JavascriptExecutor;


public class CAP_F_016BStep extends ScenarioSteps {

    private CAP_F_016BPage CAP_F_016BPage;


    @Step
    public void cargarPagina() throws InterruptedException {
        CAP_F_016BPage.open();
        getDriver().manage().window().maximize();
    }

    @Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
    }

    @Step
    public void buscarTerminoEnPortales(String txtBusqueda) throws InterruptedException {
        CAP_F_016BPage.buscarTerminoEnPortales(txtBusqueda);
    }

    @Step
    public void clickarDesplegarBusquedaAvanzada() throws InterruptedException {
//        JavascriptExecutor j = (JavascriptExecutor)getDriver();
//        j.executeScript("document.querySelector(\"#evr-formFilters > div.evr-form-search__filters > div:nth-child(2) > label\").click()");
        CAP_F_016BPage.clickarDesplegarBusquedaAvanzada();
    }

    @Step
    public void escribirDesdeFecha(String txtDesde) throws InterruptedException {
        CAP_F_016BPage.escribirDesdeFecha(txtDesde);
    }
    
    @Step
    public void escribirHastaFecha(String txtHasta) throws InterruptedException {
        CAP_F_016BPage.escribirHastaFecha(txtHasta);
    }

    @Step
    public void clickarBotonBuscar() throws InterruptedException {
        CAP_F_016BPage.clickarBotonBuscar();
    }

    @Step
    public void seleccionarTemaAmbiental(String nmbrTema) throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();

        CAP_F_016BPage.clickDropDownTemaAmbiental();
        j.executeScript("document.querySelector(\"#ui-id-" + nmbrTema + "\").click()");
    }
}