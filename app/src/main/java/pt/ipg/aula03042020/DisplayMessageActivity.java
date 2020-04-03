package pt.ipg.aula03042020;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();

        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);

        String message1 = intent.getStringExtra("Telemovel");
        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText(message1);

        String message2 = intent.getStringExtra("Email");
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText(message2);

        String message3 = intent.getStringExtra("Email");
        TextView textView4 = findViewById(R.id.textView4);
        textView4.setText(message3);

        String message4 = intent.getStringExtra("Email");
        TextView textView5 = findViewById(R.id.textView5);
        textView5.setText(message4);

        String message5 = intent.getStringExtra("Email");
        TextView textView6 = findViewById(R.id.textView6);
        textView6.setText(message5);




    }
}
