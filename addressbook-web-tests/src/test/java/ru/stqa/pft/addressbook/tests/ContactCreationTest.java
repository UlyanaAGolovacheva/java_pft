package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.initContactCreation();
    app.fillContactForm(new ContactData("Ulyana", "Aleksandrovna", "Golovacheva", "Ulita", "QA", "T2", "Rostov-na-Donu,\nTheatralniy, 60", "89081903221", "ulyana.golovacheva@tele2.ru", "9", "October"));
    app.submitContactCreation();
    app.goToHomeContactPage();
    app.returnToContactPage();
  }
}
