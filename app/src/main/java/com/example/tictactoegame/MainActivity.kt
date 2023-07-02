package com.example.tictactoegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.tictactoegame.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var flag=0
    private var count=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
    }

    fun click(view: View){
//        typeCasting.in java Button button = (Button) view;
        val btnCurrent=view as Button
        if(btnCurrent.text ==""){
            count++
            if(flag==0){
//            in java we use btnCurrent.setText("X");
                btnCurrent.text="X"
                flag=1
            }
            else{
                btnCurrent.text="O"
                flag=0
            }

//        in java. String button1Text = button1.getText().toString();
            val button1=binding.button1.text.toString()
            val button2=binding.button2.text.toString()
            val button3=binding.button3.text.toString()
            val button4=binding.button4.text.toString()
            val button5=binding.button5.text.toString()
            val button6=binding.button6.text.toString()
            val button7=binding.button7.text.toString()
            val button8=binding.button8.text.toString()
            val button9=binding.button9.text.toString()

            if(button1==button2 && button2==button3 && button3!=""){
                Toast.makeText(this@MainActivity,"Winner is $button1",Toast.LENGTH_LONG).show()
                newGame()
            }
            else if(button4==button5 && button5==button6 && button6!=""){
                Toast.makeText(this@MainActivity,"Winner is $button4",Toast.LENGTH_LONG).show()
                newGame()
            }
            else if(button7==button8 && button8==button9 && button9!=""){
                Toast.makeText(this@MainActivity,"Winner is $button7",Toast.LENGTH_LONG).show()
                newGame()
            }
            else if(button1==button4 && button4==button7 && button7!=""){
                Toast.makeText(this@MainActivity,"Winner is $button1",Toast.LENGTH_LONG).show()
                newGame()
            }
            else if(button2==button5 && button5==button8 && button8!=""){
                Toast.makeText(this@MainActivity,"Winner is $button2",Toast.LENGTH_LONG).show()
                newGame()
            }
            else if(button3==button6 && button6==button9 && button9!=""){
                Toast.makeText(this@MainActivity,"Winner is $button3",Toast.LENGTH_LONG).show()
                newGame()
            }
            else if(button1==button5 && button5==button9 && button9!=""){
                Toast.makeText(this@MainActivity,"Winner is $button1",Toast.LENGTH_LONG).show()
                newGame()
            }
            else if(button3==button5 && button5==button7 && button7!=""){
                Toast.makeText(this@MainActivity,"Winner is $button3",Toast.LENGTH_LONG).show()
                newGame()
            }
            else if(count==9){
                Toast.makeText(this@MainActivity,"Match Drawn",Toast.LENGTH_LONG).show()
                newGame()
            }
        }
    }

    private fun newGame(){
        binding.button1.text=""
        binding.button2.text=""
        binding.button3.text=""
        binding.button4.text=""
        binding.button5.text=""
        binding.button6.text=""
        binding.button7.text=""
        binding.button8.text=""
        binding.button9.text=""
        flag=0
        count=0
    }
}


//Here is java code for the similar project.
/*import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private int flag = 0;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();
    }

    public void click(View view) {
        Button btnCurrent = (Button) view;
        if (btnCurrent.getText().equals("")) {
            count++;
            if (flag == 0) {
                btnCurrent.setText("X");
                flag = 1;
            } else {
                btnCurrent.setText("O");
                flag = 0;
            }

            String button1 = binding.button1.getText().toString();
            String button2 = binding.button2.getText().toString();
            String button3 = binding.button3.getText().toString();
            String button4 = binding.button4.getText().toString();
            String button5 = binding.button5.getText().toString();
            String button6 = binding.button6.getText().toString();
            String button7 = binding.button7.getText().toString();
            String button8 = binding.button8.getText().toString();
            String button9 = binding.button9.getText().toString();

            if (button1.equals(button2) && button2.equals(button3) && !button3.equals("")) {
                Toast.makeText(this, "Winner is " + button1, Toast.LENGTH_LONG).show();
                newGame();
            } else if (button4.equals(button5) && button5.equals(button6) && !button6.equals("")) {
                Toast.makeText(this, "Winner is " + button4, Toast.LENGTH_LONG).show();
                newGame();
            } else if (button7.equals(button8) && button8.equals(button9) && !button9.equals("")) {
                Toast.makeText(this, "Winner is " + button7, Toast.LENGTH_LONG).show();
                newGame();
            } else if (button1.equals(button4) && button4.equals(button7) && !button7.equals("")) {
                Toast.makeText(this, "Winner is " + button1, Toast.LENGTH_LONG).show();
                newGame();
            } else if (button2.equals(button5) && button5.equals(button8) && !button8.equals("")) {
                Toast.makeText(this, "Winner is " + button2, Toast.LENGTH_LONG).show();
                newGame();
            } else if (button3.equals(button6) && button6.equals(button9) && !button9.equals("")) {
                Toast.makeText(this, "Winner is " + button3, Toast.LENGTH_LONG).show();
                newGame();
            } else if (button1.equals(button5) && button5.equals(button9) && !button9.equals("")) {
                Toast.makeText(this, "Winner is " + button1, Toast.LENGTH_LONG).show();
                newGame();
            } else if (button3.equals(button5) && button5.equals(button7) && !button7.equals("")) {
                Toast.makeText(this, "Winner is " + button3, Toast.LENGTH_LONG).show();
                newGame();
            } else if (count == 9) {
                Toast.makeText(this, "Match Drawn", Toast.LENGTH_LONG).show();
                newGame();
            }
        }
    }

    private void newGame() {
        binding.button1.setText("");
        binding.button2.setText("");
        binding.button3.setText("");
        binding.button4.setText("");
        binding.button5.setText("");
        binding.button6.setText("");
        binding.button7.setText("");
        binding.button8.setText("");
        binding.button9.setText("");
        flag=0
        count=0
    }
}
*/