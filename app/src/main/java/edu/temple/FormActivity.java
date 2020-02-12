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

                String name1 = "Name";
                String email1 = "E-mail";
                String password1 = "Password";
                String passwordConfirmation1 = "Password Confirmation";
                String emptyString = "";

                if(name.equals(emptyString) || (name.equals(name1))) {
                    Toast.makeText(getApplicationContext(), "Please enter your name", Toast.LENGTH_LONG).show();
                }
                else if(email.equals(emptyString) || (email.equals(email1))) {
                    Toast.makeText(getApplicationContext(), "Please enter your email", Toast.LENGTH_LONG).show();
                }
                else if(password.equals(emptyString) || (password.equals(password1))) {
                    Toast.makeText(getApplicationContext(), "Please enter your password", Toast.LENGTH_LONG).show();
                }
                else if(passowrdConfirmation.equals(emptyString) || passowrdConfirmation.equals(passwordConfirmation1)) {
                    Toast.makeText(getApplicationContext(), "Please enter your password again", Toast.LENGTH_LONG).show();
                }
                else if(!password.equals(passowrdConfirmation)) {
                    Toast.makeText(getApplicationContext(), "Please enter the same password for Password and Password Confirmation", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Welcome, " + name + ", to the SignUpForm App", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
