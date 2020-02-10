package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
        EditText myTextField = (EditText) findViewById(R.id.myText);
        String str = myTextField.getText().toString();
        Integer num = Integer.parseInt(str);
        goToActivity2(num);
    }

    public void goToActivity2(int num){

        Intent intent = new Intent(this, Main2Activity.class);
        double converted = num * 0.77;
        String str = Double.toString(converted);
        intent.putExtra("message",str);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
