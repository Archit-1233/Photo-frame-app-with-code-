package com.example.geekyhub.photoframeday19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class photoactivity : AppCompatActivity() {
    var currentImage=0
    lateinit var image:ImageView
    var names= arrayOf("Little Krishna","Doraemon","Sinchan","Pokemon")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photoactivity)
        supportActionBar?.hide()
        val prev=findViewById<Button>(R.id.previous)
        val next=findViewById<Button>(R.id.next)
val text=findViewById<TextView>(R.id.textView)

        prev.setOnClickListener(){
            val idCurrentImageString= "pic$currentImage"
            //convert string id into integer address with it
            val idCurrentImageInt=this.resources.getIdentifier(idCurrentImageString,"id",packageName)
            image=findViewById(idCurrentImageInt)
            image.alpha=0f
            currentImage=(4+currentImage-1)%4
            val idImageToShowString= "pic$currentImage"
            //convert string id into integer address with it
            val idImageToShowInt=this.resources.getIdentifier(idImageToShowString,"id",packageName)
            image=findViewById(idImageToShowInt)
            image.alpha=1f
            text.text=names[currentImage]
        }
        next.setOnClickListener(){
            val idCurrentImageString= "pic$currentImage"
            //convert string id into integer address with it
            val idCurrentImageInt=this.resources.getIdentifier(idCurrentImageString,"id",packageName)
            image=findViewById(idCurrentImageInt)
            image.alpha=0f
            currentImage=(4+currentImage+1)%4
            val idImageToShowString= "pic$currentImage"
            //convert string id into integer address with it
            val idImageToShowInt=this.resources.getIdentifier(idImageToShowString,"id",packageName)
            image=findViewById(idImageToShowInt)
            image.alpha=1f
            text.text=names[currentImage]

        }




    }
}