package com.asemlab.toaster

import android.content.Context
import android.widget.Toast

object ToastHelper {
    fun ToastMsg(context: Context, msg: String){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}