package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static String tag = "Toppings: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view) {

        // is the view now checked.
        boolean checked = ((CheckBox) view).isChecked();

        // check which checkbox is checked?
        switch (view.getId()){
            case R.id.chocolate_syrup:
                if (checked)
                    tag = tag + "Chocolate syrup ";
                break;
            case R.id.Sprinkles:
                if (checked)
                    tag = tag + "Sprinkles ";
                break;
            case R.id.crushed_nuts:
                if (checked)
                    tag = tag + "Crushed nuts ";
                break;
            case R.id.cherries:
                if (checked)
                    tag = tag + "Cherries ";
                break;
            case R.id.orio_cookie_crumbles:
                if (checked)
                    tag = tag + "Orio cookie crumbles ";
                break;
        }
    }

    public void tosMessage(String message){
        Context context = getApplicationContext();
        CharSequence msg = message;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, msg, duration);
        toast.show();
        tag = "Toppings: ";
    }

    public void showMsg(View view) {
        tosMessage(tag);
    }

}