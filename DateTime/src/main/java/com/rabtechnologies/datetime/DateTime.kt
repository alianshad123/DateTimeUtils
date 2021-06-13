package com.rabtechnologies.datetime

import java.text.SimpleDateFormat
import java.util.*

class DateTime {
    companion object {
        fun getCurrentUTCDate(format:String?,timeZone:String?): String {
            val sdf = SimpleDateFormat(format, Locale.getDefault())
            sdf.timeZone = TimeZone.getTimeZone(timeZone)
            return sdf.format(Date())
        }

        fun getCurrentDate(format:String?): String? {
            val simpleDateFormat = SimpleDateFormat(format)
            return simpleDateFormat.format(Date())
        }

        fun getCurrentTime(format:String?): String? {
            val simpleDateFormat = SimpleDateFormat(format)
            return simpleDateFormat.format(Date())
        }

        fun getFormatedDate(date: String?,currentFormat: String?, expectedFormat: String?): String? {
            val format = SimpleDateFormat(currentFormat)
            val targetFormat = SimpleDateFormat(expectedFormat)
            val date: Date = format.parse(date)
            return targetFormat.format(date)
        }

        fun getFormatedTime(time: String?,currentFormat: String?, expectedFormat: String?): String? {
            val format = SimpleDateFormat(currentFormat)
            val targetFormat = SimpleDateFormat(expectedFormat)
            val date: Date = format.parse(time)
            return targetFormat.format(date)
        }
    }
}