package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    lateinit var diceImage2: ImageView
    lateinit var diceImage3: ImageView

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val rollButton : Button = findViewById<Button>(R.id.roll_button)

         rollButton.setOnClickListener {
//             Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
             randomRollDice()
         }
         diceImage = findViewById(R.id.iv_dice_image)
         diceImage2 = findViewById(R.id.iv_dice_image2)
         diceImage3 = findViewById(R.id.iv_dice_image3)
    }

    fun randomRollDice(){
        val randomInt1 = Random().nextInt(6) + 1

        val drawableResource1 = when(randomInt1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        val randomInt2 = Random().nextInt(6) + 1

        val drawableResource2 = when(randomInt2){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        val randomInt3 = Random().nextInt(6) + 1

        val drawableResource3 = when(randomInt3){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        rollDice(drawableResource1)
        rollDice2(drawableResource2)
        rollDice3(drawableResource3)
    }

    private fun rollDice(drawableResource: Int) {
        diceImage.setImageResource(drawableResource)
    }

    private fun rollDice2(drawableResource: Int) {
        diceImage2.setImageResource(drawableResource)
    }

    private fun rollDice3(drawableResource: Int) {
        diceImage3.setImageResource(drawableResource)
    }
}

