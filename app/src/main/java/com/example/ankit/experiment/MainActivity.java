package com.example.ankit.experiment;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton radioButton, radioButton1;
    int points = 0;
    int counter = 0;
    int temp = 0;
    RadioButton a,b,c;
    TextView tV1;
    String questions[] = {"All computers execute", "Which of  the following is most oriented to scientific programming?",
            "Which of the following is not a characteristic of  COBOL", "Which of the following BASIC statements is correct?",
            "Which of the following relates to machine language?"};
    String choice1[] = {"BASIC Programs", "FORTRAN", "It is a very standaradized language", "INPUT N$", "difficult to learn"};
    String choice2[] = {"COBOL Programs", "COBOL", "It is very efficient in terms of coding and execution", "100 END,JOB", "first-generation language"};
    String choice3[] = {"machine language programs", "BASIC", "It is a readable language", "PRINT X,Y;Z", "all of the above"};
    String correct[] = {"machine language programs", "FORTRAN", "It is very efficient in terms of coding and execution", "PRINT X,Y;Z", "all of the above"};
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.choice1:
                if (checked)
                    // Pirates are the best
                    a = (RadioButton) findViewById(R.id.choice1);
                    tV1 = (TextView) findViewById(R.id.point);
                    tV1.setVisibility(View.VISIBLE);
                if (a.getText().toString().equals(correct[counter])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Correct Answer";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    points++;
                    counter++;
                    tV1.setText(""+points);
                }
                else
                {
                    Context context = getApplicationContext();
                    CharSequence text = "Wrong Answer";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                break;
            case R.id.choice2:
                if (checked)
                    // Ninjas rule
                    b = (RadioButton) findViewById(R.id.choice2);
                    tV1 = (TextView) findViewById(R.id.point);
                    tV1.setVisibility(View.VISIBLE);
                if (b.getText().toString().equals(correct[counter])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Correct Answer";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    points++;
                    counter = counter + 1;
                    tV1.setText(""+points);
                }
                else
                {
                    Context context = getApplicationContext();
                    CharSequence text = "Wrong Answer";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                break;
            case R.id.choice3:
                if (checked)
                    // Ninjas rule
                    c = (RadioButton) findViewById(R.id.choice3);
                    tV1 = (TextView) findViewById(R.id.point);
                    tV1.setVisibility(View.VISIBLE);
                if (c.getText().toString().equals(correct[counter])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Correct Answer";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    points++;
                    counter = counter + 1;
                    tV1.setText(""+points);
                }
                else
                {
                    Context context = getApplicationContext();
                    CharSequence text = "Wrong Answer";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                break;
        }
    }
    public void next(View view) {
        if (temp < questions.length) {
            TextView tV = (TextView) findViewById(R.id.t);
            tV.setVisibility(View.VISIBLE);
            tV.setText("POINTS");
            TextView textView = (TextView) findViewById(R.id.question);
            textView.setText(questions[temp]);
            RadioButton radioButton = (RadioButton) findViewById(R.id.choice1);
            radioButton.setVisibility(View.VISIBLE);
            radioButton.setText(choice1[counter]);
            RadioButton radioButton1 = (RadioButton) findViewById(R.id.choice2);
            radioButton1.setVisibility(View.VISIBLE);
            radioButton1.setText(choice2[temp]);
            RadioButton radioButton2 = (RadioButton) findViewById(R.id.choice3);
            radioButton2.setVisibility(View.VISIBLE);
            radioButton2.setText(choice3[temp]);
            temp = temp + 1;
        }
        else {
            Context context = getApplicationContext();
            CharSequence text = "Your total score is "+ points;
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            if(points > 3) {
                Intent intent = new Intent(MainActivity.this, EndActivity.class);
                startActivity(intent);
            }
            else {
                Intent intent1 = new Intent(MainActivity.this,EndActivity2.class);
                startActivity(intent1);


            }
        }
    }
    public void sPoints(int p)
    {
        TextView textView1 = (TextView) findViewById(R.id.point);
        textView1.setText("" + p);
    }
}
