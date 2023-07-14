package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactModificationTest extends TestBase {
    @Test
    public void testContactModification() {
        app.getNavigationHelper().returnToHomePage();
        if (!app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Альбина", "Obama", "Washington", "BO1994",
                    "WhiteHome", "15-15-15", "911",
                    "ДочкаПрезидента@WhiteHouse.com", "USA", "test1"));
        }
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().editContactForm(before.size() - 1);
        ContactData contact = new ContactData(before.get(before.size() - 1).getId(),"Измененный", "Obama",  "Washington", "BO1994",
                "WhiteHome", "15-15-15", "911",
                "ДочкаПрезидента@WhiteHouse.com", "USA", null);
        app.getContactHelper().fillContactForm(contact, false);
        app.getContactHelper().updateContactForm();
        app.getNavigationHelper().returnToHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size());

        before.remove(before.size() - 1);
        before.add(contact);

        Comparator<? super ContactData> byId = Comparator.comparingInt(ContactData::getId);
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);
    }
}
