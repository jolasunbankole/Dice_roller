package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

    /**
     * This activity allows the user to roll a dice and view the result
     * on the screen.
    */
    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)


            /**
             * This code is a mix of finding the Button, creating a short toast.
             *
             */
            val rollButton: Button = findViewById(R.id.button)
            rollButton.setOnClickListener {
                rollDice()
                rollDice2()
                val toast = Toast.makeText(this, "DICE Rolled", Toast.LENGTH_SHORT)
                toast.show()
            }
            // Do a dice roll when app starts
            rollDice()
            rollDice2()

        }


        /**
         * Roll the dice and update  the screen with the result.
         */
        private fun rollDice() {
            var dice = Dice(6)
            val diceRoll = dice.roll()

            val diceImage: ImageView = findViewById(R.id.imageView)

            /**
             * When method that returns the right sided dice randomly generated
             */
            when (diceRoll){
                1 -> diceImage.setImageResource(R.drawable.dice_1)
                2 -> diceImage.setImageResource(R.drawable.dice_2)
                3 -> diceImage.setImageResource(R.drawable.dice_3)
                4 -> diceImage.setImageResource(R.drawable.dice_4)
                5 -> diceImage.setImageResource(R.drawable.dice_5)
                6 -> diceImage.setImageResource(R.drawable.dice_6)
            }



        }

        /**
         * This is the overall code for the second dice.
         */
        private fun rollDice2() {
            var dice2 = Dice(6)
            val diceRoll2 = dice2.roll()

            val diceImage2: ImageView = findViewById(R.id.imageView2)

            /**
             * This method below returns the value of the second dice.
             */   
            when (diceRoll2){
                1 -> diceImage2.setImageResource(R.drawable.dice_1)
                2 -> diceImage2.setImageResource(R.drawable.dice_2)
                3 -> diceImage2.setImageResource(R.drawable.dice_3)
                4 -> diceImage2.setImageResource(R.drawable.dice_4)
                5 -> diceImage2.setImageResource(R.drawable.dice_5)
                6 -> diceImage2.setImageResource(R.drawable.dice_6)
            }

        }
    }



    /**
    * This is the code that returns a randomly generated number
    * Appears in the TexView in the ViewGroup
    */
    class Dice(private val numSides: Int){
    fun roll(): Int{
        return(1..numSides).random()
    }
}


