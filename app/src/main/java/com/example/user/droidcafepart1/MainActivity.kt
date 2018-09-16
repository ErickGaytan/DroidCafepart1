package com.example.user.droidcafepart1

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId



        return if (id == R.id.action_settings) {
            true
        } else super.onOptionsItemSelected(item)
    }

    /**
     * Shows a message that the donut image was clicked.
     */
    fun showDonutOrder(view: View) {
        showFoodOrder(getString(R.string.donut_order_message))
    }

    /**
     * Shows a message that the ice cream sandwich image was clicked.
     */
    fun showIceCreamOrder(view: View) {
        showFoodOrder(getString(R.string.ice_cream_order_message))
    }

    /**
     * Shows a message that the froyo image was clicked.
     */
    fun showFroyoOrder(view: View) {
        showFoodOrder(getString(R.string.froyo_order_message))
    }

    /**
     * Displays a Toast message for the food order.
     *
     * @param message Message to display.
     */
    fun showFoodOrder(message: String) {
        Toast.makeText(applicationContext, message,
                Toast.LENGTH_SHORT).show()
        val intent = Intent(this, OrderActivity::class.java)
        startActivity(intent)
    }
}