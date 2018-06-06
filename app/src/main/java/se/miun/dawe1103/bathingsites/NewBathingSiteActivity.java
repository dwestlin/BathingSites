package se.miun.dawe1103.bathingsites;


import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;



public class NewBathingSiteActivity extends AppCompatActivity {

    // Defining classes.
    private NewBathingSiteFragment newBathingSiteFragment;
    private BathingSitesFragment bathingSiteFragment;

    public NewBathingSiteActivity(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_bathing_site);

        Toolbar toolbar = findViewById(R.id.toolbarNewBathingSite);
        setSupportActionBar(toolbar);

        // get the orientation
        int orientation = this.getResources().getConfiguration().orientation;

        // And based on what orientation the app has, the fragments are created
        if(orientation == Configuration.ORIENTATION_PORTRAIT){
            newBathingSiteFragment = new NewBathingSiteFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.bathingImgFragment,newBathingSiteFragment).commit();
        }
        else if(orientation == Configuration.ORIENTATION_LANDSCAPE){
            bathingSiteFragment = new BathingSitesFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.bathingImgFragment,bathingSiteFragment).commit();

            newBathingSiteFragment = new NewBathingSiteFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.newBathingSiteInput, newBathingSiteFragment).commit();
        }
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
            return true;
        }
        else if (id == R.id.action_save) {
            saveBathingSite();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    // Function that's calls the fragments clearInput()-function.
    public void clearInput(){
        newBathingSiteFragment.clearInput();
    }

    // Function that calls the fragments saveBathingSite()-function.
    public void saveBathingSite(){
        newBathingSiteFragment.saveBathingSite();
    }

}
