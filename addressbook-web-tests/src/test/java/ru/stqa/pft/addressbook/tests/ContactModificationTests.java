package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {

    app.getNavigationHelper().goToHomeContactPage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Madonna", "Putyatichna", "Go", "Madam", "QA", "T2", "Rostov-na-Donu,\nTheatralniy, 60", "89999999991", "madam_madonna@mail.ru", "18", "October"));
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().goToHomeContactPage();
  }
}
