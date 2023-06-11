package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase {

    @Test
    public void testContactDeletion() {
        app.getNavigationHelper().returnToHomePage();
        app.getGroupHelper().selectGroup();
        app.getContactHelper().deleteSelectedContacts();
        app.getNavigationHelper().returnToHomePage();
    }


}
