package com.example.andy.project0;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
        findViewById(R.id.button6).setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Toast.makeText(this, R.string.spotify, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this, R.string.scores, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(this, R.string.library, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(this, R.string.BIB, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Toast.makeText(this, R.string.XYZ, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button6:
                Toast.makeText(this, R.string.capstone, Toast.LENGTH_SHORT).show();
                break;

        }

    }
}
