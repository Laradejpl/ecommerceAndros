package com.example.myannonces.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView

class MSPEditText(context: Context, attrs: AttributeSet) : AppCompatEditText(context,attrs) {

    init {
        applyFont()

    }

    private fun applyFont(){
        val boldTypeface : Typeface =

                Typeface.createFromAsset(context.assets,"Montserrat-Regular.ttf")
        typeface = boldTypeface

    }


}