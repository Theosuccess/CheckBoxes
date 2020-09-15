package com.example.checkboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox chocolate,sprinkles,nuts,cherries,cookies;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find all the checkBox views
        chocolate = findViewById(R.id.chocolate_checkbox);
        sprinkles = findViewById(R.id.sprinkles_checkbox);
        nuts = findViewById(R.id.nuts_checkbox);
        cherries = findViewById(R.id.cherry_checkbox);
        cookies = findViewById(R.id.cookie_checkbox);
    }

    public void ButtonToast(View view) {
        //create a string variable to save the values
        String result = "Selected items";
        //
        if (chocolate.isChecked()){
            result += "\nChocolate syrup";
        }
        if (sprinkles.isChecked()){
            result += "\nSprinkles";
        }
        if (nuts.isChecked()){
            result += "\ncrushed nuts";
        }
        if (cherries.isChecked()){
            result += "\nCherries";
        }
        if (cookies.isChecked()){
            result += "\nOrio cookie crumbles";
        }
        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();

    }

    public void onChecked(View view) {
        boolean checked = ((CheckBox)view).isChecked();
        String str = "";
        //check which checkBox was clicked
        switch (view.getId()){
            case R.id.chocolate_checkbox:
                str = checked? "Chocolate syrup selected": "Chocolate syrup deselected";
                break;
                //
            case R.id.cherry_checkbox:
                str = checked? "cherries selected": "cherries deselected";
                break;
                //
            case R.id.cookie_checkbox:
                str = checked? "Orio cookie crumbles selected": "Orio cookie crumbles deselected";
                break;
                //
            case R.id.nuts_checkbox:
                str = checked? "crushed nuts selected": "crushed nuts deselected";
                break;
                //
            case R.id.sprinkles_checkbox:
                str = checked? "springles selected": "springles deselected";
                break;
        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();

    }

}