package edu.kvcc.cis298.cis298assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CounterActivity extends AppCompatActivity {

    private Button mGatherButton;
    private Button mMinusButton;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        mTextView = (TextView) findViewById(R.id.text_view);

        mGatherButton = (Button) findViewById(R.id.gather_button);
        mGatherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String theText = mTextView.getText().toString();
                int theValue = Integer.parseInt(theText);

                theValue++;

                String theResult = Integer.toString(theValue);
                mTextView.setText(theResult);

                if (theValue == 20) {
                    Toast.makeText(CounterActivity.this, R.string.gather_toast, Toast.LENGTH_SHORT).show();
                }
            }
        });

        mMinusButton = (Button) findViewById(R.id.minus_button);
        mMinusButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String theText = mTextView.getText().toString();
                int theValue = Integer.parseInt(theText);

                theValue--;

                String theResult = Integer.toString(theValue);
                mTextView.setText(theResult);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
