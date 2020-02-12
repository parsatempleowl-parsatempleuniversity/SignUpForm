package edu.temple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Name = findViewById(R.id.Name);
        EditText Email = findViewById(R.id.Email);
        EditText Password = findViewById(R.id.Password);
        EditText PasswordConfirmation = findViewById(R.id.PasswordConfirmation);
        Button Save = findViewById(R.id.Save);

    }
}
