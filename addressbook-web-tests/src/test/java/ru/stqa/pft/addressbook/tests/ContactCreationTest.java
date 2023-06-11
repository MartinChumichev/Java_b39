package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() {
        app.getNavigationHelper().gotoAddNewContactPage();
        app.getContactHelper().fillContactForm(new ContactData("Barak", "Obama", "Molodec", "Washington", "BO2023",
                "WhiteHome", "15-15-15", "+30-985-258-99-66", "Mr_President@WhiteHouse.com", "USA"));
        app.getContactHelper().submitContactCreation();
        app.getNavigationHelper().returnToHomePage();
    }
}
