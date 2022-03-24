package com.user.qi.desktop.matheusk.projetofinal.categoriamine

import android.os.Build
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP){
             this.window.statusBarColor = ContextCompat.getColor(this,R.color.black_500)
        }

    }
     @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
     fun Window.setStatusBarColorTo(color: Int){
         this.clearFlags((WindowManager.LayoutParamsG_TRANSLUCENT_STATUS))

         this.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
     }


}
