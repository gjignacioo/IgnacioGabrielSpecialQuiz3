package gabriel.ignacio.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtName, txtPassword, txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.Name);
        txtPassword = findViewById(R.id.Password);
        txtEmail = findViewById(R.id.Email);
    }

    public void goNext(View v){
        Intent i = new Intent(this, gabriel.ignacio.com.myapplication.Main2.class);
        startActivity(i);
    }

    public void saveInfo(View v){
        SharedPreferences sp =  getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("User", txtName.getText().toString());
        editor.putString("Password", txtPassword.getText().toString());
        editor.putString("Email", txtEmail.getText().toString());
        editor.commit();
        Toast.makeText(this, "saved in userInfo.xml.", Toast.LENGTH_LONG);
    }
}
