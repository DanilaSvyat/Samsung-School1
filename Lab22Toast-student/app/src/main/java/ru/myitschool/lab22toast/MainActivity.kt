package ru.myitschool.lab22toast

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, R.string.ncreate, Toast.LENGTH_LONG).show();
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, R.string.nstart, Toast.LENGTH_LONG).show();
    }
     override fun onResume() {
        super.onResume()
        Toast.makeText(this, R.string.nnresume, Toast.LENGTH_LONG).show();
    }
    override fun onPause() {
        super.onPause()
        Toast.makeText(this, R.string.npause, Toast.LENGTH_LONG).show();
    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(this, R.string.nstop, Toast.LENGTH_LONG).show();
    }
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, R.string.nrestart, Toast.LENGTH_LONG).show();
    }
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, R.string.ndestroy, Toast.LENGTH_LONG).show();
    }
}