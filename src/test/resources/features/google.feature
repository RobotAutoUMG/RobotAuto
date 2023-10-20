Feature: google

  @ingresarADemoWebShop
  Scenario: ingresar a Demo Web Shop
    Given se abre Demo Web Shop


  @iniciarSesion
  Scenario: iniciar sesión en la página
    When ingresar al formulario de login
    And ingresar correo electrónico "ryoxonc1@miumg.edu.gt" y contraseña "robotumg"
    And pulsar el botón de acceso a la cuenta


  @realizarCompra
  Scenario: realizar una compra de una computadora
    And abrir la sección de computadoras
    And seleccionar el primer producto de la sección de computadoras
    And agregar el primer producto al carrito
    And seleccionar el segundo producto de la sección de computadoras
    And agregar el segundo producto al carrito
    And vista panoramico
    And abrir el carrito de compras
    And seleccionar país "38"
    And seleccionar estado "0"
    And aceptar los términos de servicio
    And Checkout
    And seleccionar dirección de facturación "3258300"
    And pulsar el botón para continuar a la dirección de envío
    And seleccionar direccion de envio y continuar
    And seleccionar metoto de envio y continuar
    When seleccionar forma de pago y continuar
    When pulsar el botón para continuar con la confirmación de pago contra reembolso
    When el usuario hace clic en el botón Confirmar la compra
    When el usuario hace clic en detalles del pedido

  @enviarCorreo
  Scenario: enviar listado de favoritos por correo
    When el usuario va a la sección de ropa y zapatos
    When el usuario agrega el primer producto a la lista de favoritos de Zapatos y Roba
    When el usuario agrega el segundo producto a la lista de favoritos de Zapatos y Roba
    When el usuario va a la sección de electrónica
    When el usuario agrega el primer producto de electrónica a la lista de favoritos
    When el usuario va al listado de favoritos
    When el usuario hace click para entrar a la interfaz de enviar correo
    And ingresar el correo del amigo "23rcroberto@gmail.com"
    And ingresar el mensaje personalizado "Buenos días, te mando por este medio algunos productos que podrían ser de tu interés.\n\nLink de los Productos:http://demowebshop.tricentis.com/wishlist/80efc281-21ab-414e-9cce-54ffcab559ec\n\nSaludos !!"
    When enviar el mensaje

  @logout
  Scenario: cerrar sesión
    When cerrar sesion

    
  @salirDemoWebShop
  Scenario: salir de Demo Web Shop
    And Cerrar el navegador