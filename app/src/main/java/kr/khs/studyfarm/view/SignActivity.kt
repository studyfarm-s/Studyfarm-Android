package kr.khs.studyfarm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import kr.khs.studyfarm.R

class SignActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)

        setSupportActionBar(toolbar)

        val navController = this.findNavController(R.id.sign_navhost)
        NavigationUI.setupActionBarWithNavController(this, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.sign_navhost)
        return navController.navigateUp()
    }
}