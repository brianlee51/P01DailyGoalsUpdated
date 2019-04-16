package sg.edu.rp.c346.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOk = findViewById(R.id.buttonOk);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup rg1 = findViewById(R.id.radioGroup1);
                RadioGroup rg2 = findViewById(R.id.radioGroup2);
                RadioGroup rg3 = findViewById(R.id.radioGroup3);
                EditText etReflection = findViewById(R.id.editTextReflection);
                TextView tv1 = findViewById(R.id.textViewRead);
                TextView tv2 = findViewById(R.id.textViewArrive);
                TextView tv3 = findViewById(R.id.textViewAttempt);
                int selectedButtonId1 = rg1.getCheckedRadioButtonId();
                int selectedButtonId2 = rg2.getCheckedRadioButtonId();
                int selectedButtonId3 = rg3.getCheckedRadioButtonId();
                RadioButton rb1 = findViewById(selectedButtonId1);
                RadioButton rb2 = findViewById(selectedButtonId2);
                RadioButton rb3 = findViewById(selectedButtonId3);
                String[] info = {tv1.getText().toString() ,rb1.getText().toString(), tv2.getText().toString(),
                        rb2.getText().toString(), tv3.getText().toString(), rb3.getText().toString(),
                        etReflection.getText().toString()};
                Intent i = new Intent(MainActivity.this, summary.class);
                i.putExtra("info", info);
                startActivity(i);
            }
        });
    }
}
