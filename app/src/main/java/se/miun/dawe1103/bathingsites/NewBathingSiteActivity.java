package se.miun.dawe1103.bathingsites;


import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;


public class NewBathingSiteActivity extends AppCompatActivity {


    public NewBathingSiteActivity(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_bathing_site);

        Toolbar toolbar = findViewById(R.id.toolbarNewBathingSite);
        setSupportActionBar(toolbar);

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle(R.string.new_bathing_site_toolbar_title);
        }
        //toolbar.inflateMenu(R.menu.menu_new_bathing_site);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_new_bathing_site, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_clear) {
            clearInput();
            Log.d("CLEAR:", "CLEAR-button has been pressed");
            return true;
        }
        else if (id == R.id.action_save) {
            Log.d("SAVE:", "SAVE-button has been pressed");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void clearInput(){

    }

}
