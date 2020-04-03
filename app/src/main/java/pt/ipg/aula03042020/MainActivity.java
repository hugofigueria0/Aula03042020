package pt.ipg.aula03042020;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String message1 = editText2.getText().toString();

        EditText editText3 = (EditText) findViewById(R.id.editText3);
        String message2 = editText3.getText().toString();

        EditText editText4 = (EditText) findViewById(R.id.editText4);
        String message3 = editText4.getText().toString();

        EditText editText6 = (EditText) findViewById(R.id.editText6);
        String message4 = editText6.getText().toString();

        EditText editText7 = (EditText) findViewById(R.id.editText7);
        String message5 = editText7.getText().toString();




        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra("Telemovel", message1);
        intent.putExtra("Email", message2);
        intent.putExtra("Idade", message3);
        intent.putExtra("Peso", message4);
        intent.putExtra("Altura", message5);
        startActivity(intent);
    }
}