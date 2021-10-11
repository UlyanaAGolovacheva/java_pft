package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    initContactCreation();
    fillContactForm(new ContactData("Ulyana", "Aleksandrovna", "Golovacheva", "Ulita", "QA", "T2", "Rostov-na-Donu,\nTheatralniy, 60", "89081903221", "ulyana.golovacheva@tele2.ru", "9", "October"));
    submitContactCreation();
    goToHomeContactPage();
    returnToContactPage();
  }
}
