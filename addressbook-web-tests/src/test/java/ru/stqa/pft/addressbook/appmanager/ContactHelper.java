package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void returnToContactPage() {
    click(By.linkText("Logout"));
  }

  public void submitContactCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"),contactData.getName());
    type(By.name("middlename"),contactData.getMiddlename());
    type(By.name("lastname"),contactData.getLastname());
    type(By.name("nickname"),contactData.getNickname());
    type(By.name("title"),contactData.getTitle());
    type(By.name("company"),contactData.getCompany());
    type(By.name("address"),contactData.getAddress());
    type(By.name("mobile"),contactData.getMobile());
    type(By.name("email"),contactData.getEmail());
    click(By.name("bday"));
    menu(By.name("bday"), contactData.getBday());
    click(By.xpath("//option[@value='9']"));
    click(By.name("bmonth"));
    menu(By.name("bmonth"), contactData.getBmonth());
    click(By.xpath("//option[@value='October']"));
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }
  
  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void initContactModification() {
    click(By.xpath("//img[@alt='Edit']"));
  }

  public void submitContactModification() {
    click(By.xpath("//input[22]"));
  }
  public void deleteContact() {
    click(By.xpath("//input[@value='Delete']"));
  }

  public void deleteAcceptContact() {
    wd.switchTo().alert().accept();
  }
}
