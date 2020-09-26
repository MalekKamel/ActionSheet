package com.sheet.sample;

import androidx.fragment.app.FragmentManager;

import com.sha.sheet.ActionItem;
import com.sha.sheet.ActionSheet;

import java.util.ArrayList;
import java.util.List;

import kotlin.Unit;

public class JavaSample {

    void show(FragmentManager manager) {
        ActionItem option1 = new ActionItem(
                "Option 1",
                () -> {
                    // Do something
                    return Unit.INSTANCE;
                });
        // You can set a tag
        option1.setTag(2);

        ActionItem option2 = new ActionItem(
                "Option 2",
                () -> {
                    // Do something
                    return Unit.INSTANCE;
                });
        ActionItem option3 = new ActionItem(
                "Option 3",
                () -> {
                    // Do something
                    return Unit.INSTANCE;
                });
        ActionItem option4 = new ActionItem(
                "Option 4",
                () -> {
                    // Do something
                    return Unit.INSTANCE;
                });

        List<ActionItem> actions = new ArrayList<>();
        actions.add(option1);
        actions.add(option2);
        actions.add(option3);
        actions.add(option4);

        new ActionSheet.Builder()
                .title("Title Title Title Title Title Title Title Title Title Title Title Title Title Title Title Title")
                .message("Message Message Message Message Message Message Message Message Message Message Message Message Message Message Message Message")
                .actions(actions)
                .isCancelable(true)
                .isCancelableOnActionClick(true)
                .show(manager);
    }
}
