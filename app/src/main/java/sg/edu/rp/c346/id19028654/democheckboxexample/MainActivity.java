package sg.edu.rp.c346.id19028654.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb;
    Button btnCheck;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb=findViewById(R.id.checkBoxDiscount);
        btnCheck=findViewById(R.id.buttonCheck);
        tv=findViewById(R.id.textView);

        btnCheck.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "check being requested", Toast.LENGTH_LONG).show();
                        Log.d("MainActivity", "MainActivity status " +cb.isChecked());
                        if(cb.isChecked()){
                            tv.setText("the discount is given");
                        }
                        else{
                            tv.setText("the discount is not given");
                        }
                        cb.setChecked(false);

            }
        });

    }
}
