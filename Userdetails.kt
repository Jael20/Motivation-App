package com.Motivationapp.jaelapps

import android.provider.ContactsContract

class Userdetails{
    var name: String = ""
    var email: String = ""
    var id: Int = 0

    constructor(name:String, email: String){
        this.name = name
        this.email = email
    }
    constructor(){

    }
}
