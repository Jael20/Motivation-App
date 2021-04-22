package com.Motivationapp.jaelapps

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

val DATABASE_NAME = "MyDB"
val TABLE_NAME = "Users"
val COL_NAME = "Name"
val COL_EMAIL = "Email"
val COL_ID = "id"

class Database (private val context: Context): SQLiteOpenHelper(context, DATABASE_NAME, null, 1){
    override fun onCreate(db: SQLiteDatabase?) {
        val createTable = "CREATE TABLE" + TABLE_NAME +"(" +
                COL_ID + "INTEGER PRIMARY KEY AUTOINCREMENT" +
                COL_NAME + " VARCHAR(256), " +
                COL_EMAIL + "VARCHAR)";
        db?.execSQL(createTable)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }
    fun insertData(user : Userdetails) {
        val db = this.writableDatabase
        var cv = ContentValues()
        cv.put(COL_NAME, user.name)
        cv.put(COL_EMAIL, user.email)
        var result = db.insert(TABLE_NAME, null, cv)
        if (result == -1.toLong())
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show()
         else
            Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
    }
    fun readData() : MutableList<Userdetails>{
        var list: MutableList<Userdetails> = ArrayList()

        val db = this.readableDatabase
        val query = "Select * from" + TABLE_NAME
        val result = db.rawQuery(query, null)
        if(result.moveToFirst()){
            do{
                val user = Userdetails()
                user.id = result.getString(result.getColumnIndex(COL_ID)).toInt()
                user.name = result.getString(result.getColumnIndex(COL_NAME))
                user.email = result.getString(result.getColumnIndex(COL_EMAIL))
                list.add(user)
            }while (result.moveToNext())
        }
        result.close()
        db.close()
        return list
    }

}




