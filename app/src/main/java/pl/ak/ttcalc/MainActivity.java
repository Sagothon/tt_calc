package pl.ak.ttcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String[] thicknessArray;
    private Spinner thicknessSpinner;
    private Button resultBtn, addBtn;
    private EditText length, width;
    private TextView[] list_of_txtviews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.thicknessArray = new String[] {
                "25 mm", "32 mm", "50 mm"
        };
        thicknessSpinner = (Spinner) findViewById(R.id.thickness);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, thicknessArray);
        thicknessSpinner.setAdapter(adapter);

        width = (EditText) findViewById(R.id.width);
        length = (EditText) findViewById(R.id.length);

    }

    public void addBtnClick(View view) {
        GridLayout list = (GridLayout)findViewById(R.id.list);
        TextView tv = new TextView(getApplicationContext());
        tv.setText("textview");

        Button b = new Button(getApplicationContext());
        b.setText("-");

        list.addView(tv);
        list.addView(b);
    }

    public void resultBtnClick(View view) {
    }




}


