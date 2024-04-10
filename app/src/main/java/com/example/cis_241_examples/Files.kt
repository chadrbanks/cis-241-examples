package com.example.cis_241_examples

import android.content.Context
import java.io.BufferedReader
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.InputStreamReader

class Files(private var activity : MainActivity) {

    var currentFile : String = "fileName.txt"

    fun readFromFile(): StringBuilder {
        val stringBuilder: StringBuilder = StringBuilder()
        var fileInputStream: FileInputStream? = null

        try {
            fileInputStream = activity.openFileInput(currentFile)
            val inputStreamReader: InputStreamReader = InputStreamReader(fileInputStream)
            val bufferedReader: BufferedReader = BufferedReader(inputStreamReader)

            var text: String? = null
            while ({ text = bufferedReader.readLine(); text }() != null) {
                stringBuilder.append(text)
            }
        } catch (e: Exception) {
            println("readFromFileError $e")
            e.printStackTrace()
        }

        return stringBuilder
    }

    fun saveToFile(data : String){
        val file:String = currentFile
        val fileOutputStream:FileOutputStream
        try {
            fileOutputStream = activity.openFileOutput(file, Context.MODE_PRIVATE)
            fileOutputStream.write(data.toByteArray())
        }catch (e: Exception){
            println("saveToFile $e")
            e.printStackTrace()
        }
    }
}