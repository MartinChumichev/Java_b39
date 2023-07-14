package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() {
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().createContact(new ContactData("Barak", "Obama", "Molodec", "Washington", "BO2023",
                "WhiteHome", "15-15-15", "+30-985-258-99-66",
                "Mr_President@WhiteHouse.com", "USA", null));
        List<ContactData> after = app.getContactHelper().getContactList();


        Assert.assertEquals(after.size(), before.size() + 1);

    }
}
