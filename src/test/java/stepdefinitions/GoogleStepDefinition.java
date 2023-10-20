package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import pages.GooglePage;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.When;

public class GoogleStepDefinition {
    GooglePage googlePage = new GooglePage();
    @Given("^se abre Demo Web Shop$")
    public void abrirPagina(){
        googlePage.abrirPagina();
    }
    @When("^ingresar al formulario de login$")
    public void clikFormularioLogin() {
        googlePage.clikFormularioLogin();
    }
    @And("^ingresar correo electrónico \"([^\"]*)\" y contraseña \"([^\"]*)\"$")
    public void ingresarCredenciales(String email, String password) {
        googlePage.ingresarCredenciales(email, password);
    }
    @And("^pulsar el botón de acceso a la cuenta$")
    public void clickBotonLoginCuenta() {
        googlePage.clickBotonLoginCuenta();
    }
    @And("^abrir la sección de computadoras$")
    public void abrirSeccionComputadoras() {
        googlePage.abrirSeccionComputadoras();
    }
    @And("^seleccionar el primer producto de la sección de computadoras$")
    public void seleccionarprimerProductoComputadoras() {
        googlePage.seleccionarprimerProductoComputadoras();
    }

    @And("^agregar el primer producto al carrito$")
    public void addPrimerProductoAlCarritoComputadoras() {
        googlePage.addPrimerProductoAlCarritoComputadoras();
    }
    @And("^seleccionar el segundo producto de la sección de computadoras$")
    public void seleccionarsegundoProductoComputadoras() {
        googlePage.seleccionarsegundoProductoComputadoras();
    }

    @And("^agregar el segundo producto al carrito$")
    public void addSegundoProductoAlCarritoComputadoras() {
        googlePage.addSegundoProductoAlCarritoComputadoras();
    }

    @And("^vista panoramico$")
    public void vistaPanoramica() {
        googlePage.vistaPanoramica();
    }

    @And("^abrir el carrito de compras$")
    public void abrirCarrito() {
        googlePage.abrirCarrito();
    }

    @And("^seleccionar país \"([^\"]*)\"$")
    public void seleccionarPais(String country) {
        googlePage.seleccionarPais(country);
    }

    @And("^seleccionar estado \"([^\"]*)\"$")
    public void seleccionarEstado(String state) {
        googlePage.seleccionarEstado(state);
    }
    @And("^aceptar los términos de servicio$")
    public void aceptarTerminos() {
        googlePage.aceptarTerminos();
    }

    @And("^Checkout$")
    public void Checkout() {
        googlePage.Checkout();
    }
    @And("^seleccionar dirección de facturación \"([^\"]*)\"$")
    public void seleccionarDireccionFacturacion(String addressValue) {
        googlePage.seleccionarDireccionFacturacion(addressValue);
    }
    @And("^pulsar el botón para continuar a la dirección de envío$")
    public void clickPasarDireccionEnvio() {
        googlePage.clickPasarDireccionEnvio();
    }

    @And("^seleccionar direccion de envio y continuar$")
    public void clickSeleccionDireccionEnvioContinuar() {
        googlePage.clickSeleccionDireccionEnvioContinuar();
    }
    @And("^seleccionar metoto de envio y continuar$")
    public void clickSeleccionMetotodoEnvio() {
        googlePage.clickSeleccionMetotodoEnvio();
    }
    @When("seleccionar forma de pago y continuar")
    public void clickSeleccionMetodoPago() {
        googlePage.clickSeleccionMetodoPago();
    }
    @When("pulsar el botón para continuar con la confirmación de pago contra reembolso")
    public void clickPagoContraRembolso() {
        googlePage.clickPagoContraRembolso();
    }
    @When("el usuario hace clic en el botón Confirmar la compra")
    public void clickConfirmarCompra() {
        googlePage.clickConfirmarCompra();
    }
    @When("el usuario hace clic en detalles del pedido")
    public void clickDetallePedido() {
        googlePage.clickDetallePedido();
    }






    @When("el usuario va a la sección de ropa y zapatos")
    public void seccionRopaZapatos() {
        googlePage.seccionRopaZapatos();
    }
    @When("el usuario agrega el primer producto a la lista de favoritos de Zapatos y Roba")
    public void addPrimerProductoFavoritosZapatosRopa() {
        googlePage.addPrimerProductoFavoritosZapatosRopa();
    }
    @When("el usuario agrega el segundo producto a la lista de favoritos de Zapatos y Roba")
    public void addSegundoProductoFavoritosZapatosRopa() {
        googlePage.addSegundoProductoFavoritosZapatosRopa();
    }
    @When("el usuario va a la sección de electrónica")
    public void irSeccionElectronica() {
        googlePage.irSeccionElectronica();
    }
    @When("el usuario agrega el primer producto de electrónica a la lista de favoritos")
    public void addPrimerProductoFavoritosElectronica() {
        googlePage.addPrimerProductoFavoritosElectronica();
    }
    @When("el usuario va al listado de favoritos")
    public void ListadoFavoritos() {
        googlePage.ListadoFavoritos();
    }
    @When("el usuario hace click para entrar a la interfaz de enviar correo")
    public void enviarEmailAigo() {
        googlePage.clickInterfazCorreo();
    }
    @And("^ingresar el correo del amigo \"([^\"]*)\"$")
    public void ingresarCorreoAmigo(String email) {
        googlePage.ingresarCorreoAmigo(email);
    }
    @And("^ingresar el mensaje personalizado \"([^\"]*)\"$")
    public void ingresarmensajeIncluyendoLinkDeListadoFavoritos(String mensaje) {
        googlePage.ingresarmensajeIncluyendoLinkDeListadoFavoritos(mensaje);
    }
    @When("^enviar el mensaje$")
    public void enviarMensaje() {
        googlePage.clickEnviarMensaje();
    }
//CERRAR SESION
@When("^cerrar sesion$")
public void clickCerrarSesion() {
    googlePage.clickCerrarSesion();
}




















    @And("^Cerrar el navegador$")
    public void closeChrome() {
        googlePage.cerrarNavegadorclose();
    }
}
