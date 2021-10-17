package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Madonna", "Putyatichna", "Go", "Madam", "QA", "T2", "Rostov-na-Donu,\nTheatralniy, 60", "89999999991", "madam_madonna@mail.ru", "9", "October"));
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().goToHomeContactPage();
    app.getContactHelper().returnToContactPage();
  }
}
