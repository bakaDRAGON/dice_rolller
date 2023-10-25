package com.bakadragon.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bakadragon.diceroller.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        mainBinding.rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val randomNumber=(1..6).random()
        val diceImage:Int
        when (randomNumber) {
            1 -> {
                diceImage=R.drawable.dice_1
            }
            2 -> {
                diceImage=R.drawable.dice_2
            }
            3 -> {
                diceImage=R.drawable.dice_3
            }
            4 -> {
                diceImage=R.drawable.dice_4
            }
            5 -> {
                diceImage=R.drawable.dice_5
            }
            else -> {
                diceImage=R.drawable.dice_6
            }
        }
        mainBinding.imageDice.setImageResource(diceImage)
        Toast.makeText(this,"Dice is Rolled",Toast.LENGTH_SHORT).show()

    }
}