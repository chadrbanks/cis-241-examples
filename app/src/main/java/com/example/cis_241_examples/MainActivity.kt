package com.example.cis_241_examples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.json.JSONException
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // JSON Example
        val myJSON = "{\"name\":\"Chad Banks\",\"email\":\"crbanks1@hfcc.edu\"}"
        try {
            val jsonObject = JSONObject(myJSON)
            println("JSON Object: $jsonObject")
        } catch (e: JSONException) {
            println("JSON Error: $e")
        }

        // File System Implementation
        val fs = Files(this)
        fs.readFromFile()
        fs.saveToFile(myJSON)

        // Shared Preferences Implementation
        val prefs = Prefs(this)
        prefs.setPref("bg-color", "red")
        println("BG Color: " + prefs.getPref("bg-color"))
    }
}