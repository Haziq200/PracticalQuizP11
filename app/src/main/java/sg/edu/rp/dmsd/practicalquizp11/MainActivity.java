package sg.edu.rp.dmsd.practicalquizp11;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etAcc;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAcc = findViewById(R.id.editTextAccount);
        btnSubmit = findViewById(R.id.buttonConfirm);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);

                myBuilder.setTitle("Account's Submission");
                final String acc = etAcc.getText().toString();
                myBuilder.setMessage("Submit " + acc);
                myBuilder.setCancelable(false);
                myBuilder.setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), acc + " submitted", Toast.LENGTH_SHORT).show();
                    }
                });
                myBuilder.setNegativeButton("Cancel",null);

                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }
        });
    }
}
