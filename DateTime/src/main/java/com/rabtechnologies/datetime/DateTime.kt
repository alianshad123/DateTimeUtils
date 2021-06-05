package com.rabtechnologies.datetime

import android.content.Context
import android.widget.Toast




class DateTime {
    companion object {
        fun showToast(c: Context?, message: String?) {
            Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
        }
    }
}