#language: es
#author: alejandrabeltranmora@gmail.com

Característica: Diligenciar formulario de registro del usuario
  Como usuario
  Quiero llenar el formulario de registro
  Para validar que se registre correctamente

  @register
  Esquema del escenario: Registro
    Dado que usuario quiere registrarse en la pagina de dvantage DEMO
    Cuando ingresa los datos del formulario de registro
      | <userName> | <email> | <password> | <firstName> | <lastName> | <phoneNumber> | <country> | <city> | <address> | <state> | <postal> |
    Entonces se valida el usuario registrado

    Ejemplos:
      | userName   | email                          | password | firstName | lastName | phoneNumber | country  | city       | address       | state  | postal     |
      | alebeltran | alejandrabeltranmora@gmail.com | 1234Ab*  | María     | Beltrán  | 3194112098  | Colombia | Bogotá D.C | Calle 59 - 99 | Bogotá | 0000000000 |