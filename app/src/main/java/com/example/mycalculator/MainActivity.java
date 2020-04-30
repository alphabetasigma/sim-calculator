package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText firstNumber, secondNumber;
    TextView answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = findViewById(R.id.editText);
        secondNumber = findViewById(R.id.editText2);
        answer = findViewById(R.id.textView2);


    }
public void operationClicked(View view){
        String FirstNumber = firstNumber.getText().toString();
        String SecondNumber = secondNumber.getText().toString();

        if (FirstNumber.isEmpty() || SecondNumber.isEmpty()) {
            Toast.makeText(MainActivity.this,"Invalid Inputs", Toast.LENGTH_LONG).show();
        } else {
            try {

                int first = Integer.parseInt(FirstNumber);
                int second = Integer.parseInt(SecondNumber);
                int ans = 0;
                int viewId = view.getId();

                if (viewId == R.id.add) {
                    ans =first+second;

                }else if (viewId ==R.id.sub) {
                    ans = first-second;
                }else if (viewId == R.id.mul) {
                    ans = first*second;
                }else if (viewId ==R.id.div) {
                    ans = first/second;
                }
                String Answer = String.valueOf(ans);

                answer.setText(Answer);

            }catch (Exception e) {
                Toast.makeText(MainActivity.this,"Invalid Inputs", Toast.LENGTH_LONG).show();

            }
            }
        }

}
