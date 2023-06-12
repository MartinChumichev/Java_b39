package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase {
    @Test
    public void testContactModification() {
        app.getNavigationHelper().returnToHomePage();
        app.getContactHelper().editContactForm();
        app.getContactHelper().fillContactForm(new ContactData("Альбина", "Obama", "Обамовна", "Washington", "BO1994",
                "WhiteHome", "15-15-15", "911", "ДочкаПрезидента@WhiteHouse.com", "USA"));
        app.getContactHelper().updateContactForm();
        app.getNavigationHelper().returnToHomePage();
    }
}
