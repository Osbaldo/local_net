package com.example.osbal.local_net;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnComenzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnComenzar = (Button) findViewById(R.id.btnComenzar);
    }

    public void btnComenzar(View v){
        Toast.makeText(this,"¡Aquí comienza la aplicación!",Toast.LENGTH_SHORT).show();
    }


}
