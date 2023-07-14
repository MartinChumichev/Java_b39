package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

import static org.testng.Assert.assertTrue;

public class ContactHelper extends BaseHelper {
    public boolean acceptNextAlert = true;

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void editContactForm() {
        click(By.xpath("//img[@alt='Edit']"));
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void updateContactForm() {
        click(By.name("update"));
    }

    public void submitContactCreation() {
        click(By.name("submit"));
        //click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("middlename"), contactData.getMiddlename());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("address"), contactData.getAddress());
        type(By.name("nickname"), contactData.getNickname());
        click(By.name("company"));
        type(By.name("company"), contactData.getCompany());
        type(By.name("home"), contactData.getHomeNumber());
        click(By.name("mobile"));
        type(By.name("mobile"), contactData.getMobileNumber());
        type(By.name("email"), contactData.getEmail());
        type(By.name("address2"), contactData.getSecondAddress());
        if (creation) {
            if (contactData.getGroup() != null) {
                new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
            } else {
                Assert.assertFalse(isElementPresent(By.name("new_group")));
            }
        }
    }

    public void deleteSelectedContacts() {
        click(By.xpath("//input[@value='Delete']"));
        assertTrue(closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
    }

    public String closeAlertAndGetItsText() {
        try {
            Alert alert = wd.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

    public void goToAddNewContactPage() {
        click(By.linkText("add new"));
    }

    public void returnToContactPage() {
        click(By.linkText("home"));
    }

    public void createContact(ContactData contact) {
        goToAddNewContactPage();
        fillContactForm(contact, false);
        submitContactCreation();
        returnToContactPage();

    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }
}
