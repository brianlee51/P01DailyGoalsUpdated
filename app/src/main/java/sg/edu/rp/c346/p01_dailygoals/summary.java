package sg.edu.rp.c346.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        Button btnClose = findViewById(R.id.ButtonClose);
        Intent i = getIntent();
        String[] info = i.getStringArrayExtra("info");
        TextView tv1 = findViewById(R.id.textViewRead);
        TextView tv3 = findViewById(R.id.textViewArrive);
        TextView tv5 = findViewById(R.id.textViewAttempt);
        TextView tv7 = findViewById(R.id.textView);
        tv1.setText(info[0] + ": " + info[1]);
        tv3.setText(info[2] + ": " +info[3]);
        tv5.setText(info[4] + ": " + info[5]);
        tv7.setText("Reflection: " + info[6]);

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(summary.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
