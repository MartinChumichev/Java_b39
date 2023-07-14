package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactModificationTest extends TestBase {
    @Test
    public void testContactModification() {
        app.getNavigationHelper().returnToHomePage();
        if (!app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Альбина", "Obama", "Обамовна", "Washington", "BO1994",
                    "WhiteHome", "15-15-15", "911",
                    "ДочкаПрезидента@WhiteHouse.com", "USA", "test1"));
        }
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().editContactForm(before.size() - 1);
        app.getContactHelper().fillContactForm(new ContactData("Измененный", "Obama", "Обамовна", "Washington", "BO1994",
                "WhiteHome", "15-15-15", "911",
                "ДочкаПрезидента@WhiteHouse.com", "USA", null), false);
        app.getContactHelper().updateContactForm();

        app.getNavigationHelper().returnToHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();



        Assert.assertEquals(after.size(), before.size());
    }
}
