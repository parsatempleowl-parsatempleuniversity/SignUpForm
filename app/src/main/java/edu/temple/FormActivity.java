package edu.temple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    EditText Name = findViewById(R.id.Name);
    EditText Email = findViewById(R.id.Email);
    EditText Password = findViewById(R.id.Password);
    EditText PasswordConfirmation = findViewById(R.id.PasswordConfirmation);
    Button Save = findViewById(R.id.Save);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = Name.getText().toString();
                String email = Email.getText().toString();
                String password = Password.getText().toString();
                String passowrdConfirmation = PasswordConfirmation.getText().toString();

                if(name.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter name", Toast.LENGTH_LONG).show();
                }
                else if(email.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter email", Toast.LENGTH_LONG).show();
                }
                else if(password.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter password", Toast.LENGTH_LONG).show();
                }
                else if(passowrdConfirmation.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter password again", Toast.LENGTH_LONG).show();
                }
                else if(!password.equals(passowrdConfirmation)) {
                    Toast.makeText(getApplicationContext(), "Please enter the same password for password and password confirmation", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Welcome, " + name + ", to the SignUpFormApp", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
