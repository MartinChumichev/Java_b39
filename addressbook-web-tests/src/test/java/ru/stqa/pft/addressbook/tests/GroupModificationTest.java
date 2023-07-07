package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModification() {
        app.getNavigationHelper().gotoGroupPage();
        if (!app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupData("Test2", null, null));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().editGroupForm();
        app.getGroupHelper().fillGroupForm(new GroupData("123", "ggh", "gf41"));
        app.getGroupHelper().updateGroupForm();
        app.getGroupHelper().returnToGroupPage();
    }


}
