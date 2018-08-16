package pe.edu.upeu.clase01_2018_ii;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txtn, txtr;
    private ImageButton ibtnraiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtn = (EditText) findViewById(R.id.edtn);
        txtr = (EditText) findViewById(R.id.edtr);
        ibtnraiz = (ImageButton) findViewById(R.id.ibtn);
        txtr.setEnabled(false);
        ibtnraiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x = Double.parseDouble(txtn.getText().toString());
                txtr.setText(""+Math.sqrt(x));
            }
        });
    }
}
