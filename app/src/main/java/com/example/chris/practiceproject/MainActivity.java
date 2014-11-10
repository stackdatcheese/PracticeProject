package com.example.chris.practiceproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    public void bonzai(View button) {
        final EditText nameField = (EditText) findViewById(R.id.EditTextName);
        String name = nameField.getText().toString();

        final Spinner feedbackSpinner = (Spinner) findViewById(R.id.spinner);
        String feedbackType = feedbackSpinner.getSelectedItem().toString();

        final CheckBox responseCheckbox = (CheckBox) findViewById(R.id.checkBox);
        boolean bRequiresResponse = responseCheckbox.isChecked();

        final CheckBox responseCheckbox2 = (CheckBox) findViewById(R.id.checkBox2);
        boolean bRequiresResponse2 = responseCheckbox.isChecked();

        final CheckBox responseCheckbox3 = (CheckBox) findViewById(R.id.checkBox3);
        boolean bRequiresResponse3 = responseCheckbox.isChecked();
    }

/*    public void toggleFortune(View view) {
        TextView fortune = (TextView) findViewById(R.id.fortune_text);
        ImageView cookie = (ImageView) findViewById(R.id.fortune_view);

        // use the text visibility to determine mode
        if (fortune.getVisibility() == View.GONE) {
            fortune.setVisibility(View.VISIBLE);
            cookie.setImageResource(R.drawable.crunched);
        } else {
            fortune.setVisibility(View.GONE);
            cookie.setImageResource(R.drawable.uncracked);
        }
    }*/
}
