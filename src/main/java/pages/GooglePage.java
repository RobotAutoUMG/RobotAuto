package pages;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class GooglePage extends BasePage{
    public GooglePage(){
        super(driver);
    }
    // ABRIR LA PAGINA DEMO WEB SHOP
    public void abrirPagina(){
        navigateTo("https://demowebshop.tricentis.com/");
    }

    //LOGIN
    public void clikFormularioLogin() {
        driver.findElement(By.linkText("Log in")).click();
    }
    public void ingresarCredenciales(String email, String password) {
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(password);
    }
    public void clickBotonLoginCuenta() {
        driver.findElement(By.cssSelector("input.button-1.login-button[type='submit']")).click();
    }
    //REALIZAR UNA COMPRA
    public void abrirSeccionComputadoras() {
        driver.findElement(By.linkText("Computers")).click();
    }
    public void seleccionarprimerProductoComputadoras() {
        driver.findElement(By.cssSelector("img[alt='Picture for category Desktops']")).click();
        driver.findElement(By.linkText("Build your own cheap computer")).click();
    }
    public void addPrimerProductoAlCarritoComputadoras() {
        driver.findElement(By.cssSelector("input#add-to-cart-button-72.button-1.add-to-cart-button")).click();
    }
    public void seleccionarsegundoProductoComputadoras() {
        driver.findElement(By.linkText("Desktops")).click();
        driver.findElement(By.linkText("Simple Computer")).click();
        driver.findElement(By.id("product_attribute_75_5_31_96")).click();
    }
    public void addSegundoProductoAlCarritoComputadoras() {
        driver.findElement(By.cssSelector("input#add-to-cart-button-75.button-1.add-to-cart-button")).click();
    }
    public void vistaPanoramica() {
        driver.findElement(By.linkText("Desktops")).click();
    }

    public void abrirCarrito() {
        driver.findElement(By.cssSelector("span.cart-label")).click();
    }
    public void seleccionarPais(String value) {
        new Select(driver.findElement(By.cssSelector("select[id='CountryId']"))).selectByValue(value);
    }
    public void seleccionarEstado(String value) {
        new Select(driver.findElement(By.cssSelector("select[id='StateProvinceId']"))).selectByValue(value);
    }
    public void aceptarTerminos() {
        driver.findElement(By.id("termsofservice")).click();
    }
    public void Checkout() {
        driver.findElement(By.cssSelector("button#checkout.button-1.checkout-button")).click();
    }
    public void seleccionarDireccionFacturacion(String addressValue) {
        Select billingAddressSelect = new Select(driver.findElement(By.id("billing-address-select")));
        billingAddressSelect.selectByValue(addressValue);
    }
    public void clickPasarDireccionEnvio() {
        driver.findElement(By.cssSelector("input.button-1.new-address-next-step-button[onclick='Billing.save()']")).click();
    }
    public void clickSeleccionDireccionEnvioContinuar() {
        WebDriverWait wait = new WebDriverWait(driver, 10); // Espera de hasta 10 segundos
        WebElement continueButton = driver.findElement(By.cssSelector("input.button-1.new-address-next-step-button[onclick='Shipping.save()']"));
        wait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
    }
    public void clickSeleccionMetotodoEnvio() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        By buttonSelector = By.cssSelector("input.button-1.shipping-method-next-step-button[onclick='ShippingMethod.save()']");

        // Espera a que el botón sea visible
        WebElement shippingMethodButton = wait.until(ExpectedConditions.visibilityOfElementLocated(buttonSelector));
        shippingMethodButton.click();
    }

    public void clickSeleccionMetodoPago() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        By buttonSelector = By.cssSelector("input.button-1.payment-method-next-step-button[onclick='PaymentMethod.save()']");

        // Espera a que el botón sea clicable
        WebElement paymentMethodButton = wait.until(ExpectedConditions.elementToBeClickable(buttonSelector));
        paymentMethodButton.click();
    }


    public void clickPagoContraRembolso() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        By buttonSelector = By.cssSelector("input.button-1.payment-info-next-step-button[onclick='PaymentInfo.save()']");

        // Espera a que el botón sea clicable
        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(buttonSelector));
        continueButton.click();
    }
    public void clickConfirmarCompra() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        By buttonSelector = By.cssSelector("input.button-1.confirm-order-next-step-button");

        // Espera a que el botón sea clicable
        WebElement confirmButton = wait.until(ExpectedConditions.elementToBeClickable(buttonSelector));
        confirmButton.click();
    }
    public void clickDetallePedido() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        By linkSelector = By.linkText("Click here for order details.");

        WebElement orderDetailsLink = wait.until(ExpectedConditions.elementToBeClickable(linkSelector));
        orderDetailsLink.click();
    }
//NUEVO METODO ENVIAR CORREO DE LISTA DE FAVORITOS
public void seccionRopaZapatos() {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    By linkSelector = By.cssSelector("a[href='/apparel-shoes']");

    WebElement apparelAndShoesLink = wait.until(ExpectedConditions.elementToBeClickable(linkSelector));
    apparelAndShoesLink.click();
}
    public void addPrimerProductoFavoritosZapatosRopa() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        By productLinkSelector = By.linkText("50's Rockabilly Polka Dot Top JR Plus Size");
        By addToWishlistButtonSelector = By.id("add-to-wishlist-button-5");

        WebElement productLink = wait.until(ExpectedConditions.elementToBeClickable(productLinkSelector));
        productLink.click();

        WebElement addToWishlistButton = wait.until(ExpectedConditions.elementToBeClickable(addToWishlistButtonSelector));
        addToWishlistButton.click();
    }
    public void addSegundoProductoFavoritosZapatosRopa() {
        WebElement apparelShoesLink = driver.findElement(By.linkText("Apparel & Shoes"));
        apparelShoesLink.click();

        WebElement blueGreenSneakerLink = driver.findElement(By.linkText("Blue and green Sneaker"));
        blueGreenSneakerLink.click();

        WebElement addToWishlistButton = driver.findElement(By.id("add-to-wishlist-button-28"));
        addToWishlistButton.click();
    }
    public void irSeccionElectronica() {
        WebElement electronicsLink = driver.findElement(By.linkText("Electronics"));
        electronicsLink.click();
    }
    public void addPrimerProductoFavoritosElectronica() {
        // Haz clic en la imagen del producto para ir a su página de detalles
        WebElement productImage = driver.findElement(By.cssSelector("img[alt='Picture for category Cell phones']"));
        productImage.click();

        // Luego, haz clic en el enlace "Smartphone" para ir a la página de detalles del producto
        WebElement productLink = driver.findElement(By.linkText("Smartphone"));
        productLink.click();

        // Finalmente, haz clic en el botón "Add to Wishlist" (añadir a lista de favoritos)
        WebElement addToWishlistButton = driver.findElement(By.id("add-to-wishlist-button-43"));
        addToWishlistButton.click();
    }
    public void ListadoFavoritos() {
        WebElement wishlistLink = driver.findElement(By.cssSelector("span.wishlist-qty"));
        wishlistLink.click();
    }
    public void clickInterfazCorreo() {
        WebElement emailFriendButton = driver.findElement(By.xpath("//input[@value='Email a friend' and @class='button-2 email-a-friend-wishlist-button' and @onclick=\"setLocation('/emailwishlist')\"]"));
        emailFriendButton.click();
    }
    public void ingresarCorreoAmigo(String email) {
        WebElement friendEmailField = driver.findElement(By.id("FriendEmail"));
        friendEmailField.sendKeys(email);
    }
    public void ingresarmensajeIncluyendoLinkDeListadoFavoritos(String message) {
        WebElement personalMessageField = driver.findElement(By.id("PersonalMessage"));
        personalMessageField.sendKeys(message);
    }
    public void clickEnviarMensaje() {
        WebElement sendEmailButton = driver.findElement(By.cssSelector("input.button-1.send-email-a-friend-button[name='send-email']"));
        sendEmailButton.click();
    }
//CERRAR SESION
public void clickCerrarSesion() {
    driver.findElement(By.linkText("Log out")).click();
}













    @Override
    public void cerrarNavegadorclose() {
        super.cerrarNavegadorclose();
    }
}
