package com.sheet.sample

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import kotlinx.android.synthetic.main.activity_main.*
import com.sha.sheet.ActionItem
import com.sha.sheet.ActionSheet

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setup()
    }

    private fun setup() {
        btnShowSheet.setOnClickListener {
            showActionSheet()
        }
    }

    private fun showActionSheet() {
        val option1 = ActionItem(title = "Option 1") {
            // action selected
        }
        // You can set a tag
        option1.tag = 0

        val option2 = ActionItem(title = "Option 2") {
            // action selected
        }
        val option3 = ActionItem(title = "Option 3") {
            // action selected
        }
        val option4 = ActionItem(title = "Option 4") {
            // action selected
        }

        ActionSheet.create {
            actions = listOf(option1, option2, option3, option4)
            title = ""
            message = ""
            isCancelable = true
            show(supportFragmentManager)
        }
    }

    private fun showActionSheetWithBuilder() {
        val option1 = ActionItem(title = "Option 1") {
            // action selected
        }
        // You can set a tag
        option1.tag = 0

        val option2 = ActionItem(title = "Option 2") {
            // action selected
        }
        val option3 = ActionItem(title = "Option 3") {
            // action selected
        }
        val option4 = ActionItem(title = "Option 4") {
            // action selected
        }
        ActionSheet.Builder()
                .actions(listOf(option1, option2, option3, option4))
                .title("Title Title Title Title Title Title Title Title Title Title Title Title Title Title Title Title")
                .message("Message Message Message Message Message Message Message Message Message Message Message Message Message Message Message Message")
                .show(supportFragmentManager)
    }
}