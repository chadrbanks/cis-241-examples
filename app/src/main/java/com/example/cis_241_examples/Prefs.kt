package com.example.cis_241_examples

import android.content.Context.MODE_PRIVATE

class Prefs(private var activity : MainActivity) {

    fun getPref(pref : String) : String? {
        val reader = activity.getSharedPreferences(pref, MODE_PRIVATE)
        return reader.getString("value","defaultName")
    }

    fun setPref(pref : String, value : String) {
        val editor = activity.getSharedPreferences(pref, MODE_PRIVATE).edit()
        editor.putString("value", value)
        editor.apply()
    }
}