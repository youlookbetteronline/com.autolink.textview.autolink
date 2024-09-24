package com.autolink.textview

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.autolink.textview.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContentView(R.layout.activity_main)

        findViewById(com.autolink.textview.R.id.staticTextButton).setOnClickListener {
            startActivity(Intent(this, StaticTextActivity::class.java))
        }
        recyclerViewButton.setOnClickListener {
            startActivity(Intent(this, RecyclerViewActivity::class.java))
        }
        githubIcon.setOnClickListener {
            browse("https://github.com/armcha/AutoLinkTextViewV2")
        }*/
    }
}

fun Context.showDialog(title: String, message: String, url: String? = null) {
    val builder = AlertDialog.Builder(this)
            .setMessage(message)
            .setTitle(title)
            .setPositiveButton("OK") { dialog, _ -> dialog.dismiss() }
    if (url != null) {
        builder.setNegativeButton("Browse") { dialog, _ -> browse(url);dialog.dismiss() }
    }
    builder.create().show()
}

fun Context.browse(url: String) {
    val intent = Intent(Intent.ACTION_VIEW)
    intent.data = Uri.parse(url)
    startActivity(intent)
}
