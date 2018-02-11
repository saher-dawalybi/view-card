package net.digital_ex.card_view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Typeface
import android.widget.TextView



class card_view : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_view)

        val tx=findViewById(R.id.textView4) as TextView

        val custom_font=Typeface.createFromAsset(assets, "fonts/Cairo-Regular.ttf")

        tx.typeface=custom_font

    }
}
