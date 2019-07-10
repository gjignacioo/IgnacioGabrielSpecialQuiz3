package gabriel.ignacio.com.myapplication;

import android.support.v7.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2 extends AppCompatActivity {

    EditText txtName, txtPassword, txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        txtName = findViewById(R.id.Name2);
        txtPassword = findViewById(R.id.Password2);
        txtEmail = findViewById(R.id.Email);
    }

    public void goPrevious(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void displayUser(View v) {
        SharedPreferences sp =  getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        txtName.setText(sp.getString("User", ""));
        txtPassword.setText(sp.getString("Password", ""));
        Toast.makeText(this, sp.getString("mail", ""), Toast.LENGTH_LONG).show();
    }


}
