package com.blade.mytoastlib

import android.content.Context
import android.widget.Toast

class BladeToast {
    fun show(context: Context, message:String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}