package com.example.bonjournom;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.textView5);
        final EditText editText = findViewById(R.id.editText);
        Button boutton = findViewById(R.id.button);

         boutton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 textView.setText("bonjour " + editText.getText());
             }
         });

    }
}
