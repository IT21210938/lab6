package com.example.scorekeeper

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

// Member variables for holding the score.
private const var mScore1 = 0
private const var mScore2 = 0

// Member variables for holding the score.
private val mScoreText1: TextView? = null
private val mScoreText2: TextView? = null

fun decreaseScore(view: View) {
    // Get the ID of the button that was clicked.
    val viewID: Int = view.getId()
    when (viewID) {
        R.id.decreaseTeam1 -> {
            //Decrement the score and update the TextView
            mScore1--
            mScoreText1!!.text = mScore1.toString()
        }
        R.id.decreaseTeam2 -> {
            // Decrement the score and update the TextView
            mScore2--
            mScoreText2!!.text = mScore2.toString()
        }
    }
}

/**
 * Method that handles the onClick of both the increment buttons
 * @param view The button view that was clicked
 */
fun increaseScore(view: View) {
    // Get the ID of the button that was clicked
    val viewID: Int = view.getId()
    when (viewID) {
        R.id.increaseTeam1 -> {
            // Increment the score and update the TextView
            mScore1++
            mScoreText1!!.text = mScore1.toString()
        }
        R.id.increaseTeam2 -> {
            // Increment the score and update the TextView
            mScore2++
            mScoreText2!!.text = mScore2.toString()
        }
    }
}