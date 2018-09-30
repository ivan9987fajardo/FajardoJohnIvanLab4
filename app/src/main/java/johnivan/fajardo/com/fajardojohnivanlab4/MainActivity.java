package johnivan.fajardo.com.fajardojohnivanlab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4IT-H", "onCreate will execute");

    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("4IT-H", "onStart will execute");

    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("4IT-H", "onResume will execute");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("4IT-H", "onStop will execute");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("4IT-H", "onRestart will execute");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("4IT-H", "onDestroy will execute");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("4IT-H", "onPause will execute");
    }

    public void btnBack(android.view.View v) {

        Toast.makeText(this, "Back button has been pressed", Toast.LENGTH_LONG).show();

    }
    public void btnNext(android.view.View v) {

        Snackbar.make(v, "Next Button has been pressed", Snackbar.LENGTH_LONG).show();

    }
}
