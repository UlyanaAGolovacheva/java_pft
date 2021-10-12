package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Ulyana", "Aleksandrovna", "Golovacheva", "Ulita", "QA", "T2", "Rostov-na-Donu,\nTheatralniy, 60", "89081903221", "ulita_rnd@bk.ru", "9", "October"));
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().goToHomeContactPage();
    app.getContactHelper().returnToContactPage();
  }
}
