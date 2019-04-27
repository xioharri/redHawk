package com.example.redhawk;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*Main Activity class is used to provide description and trigger a button on click to proceed to the map*/
public class MainActivity extends AppCompatActivity {

    /*button is created*/
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*button is set to open to activity MapsActivity*/
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMapsActivity();
            }
        });
    }
    public void openMapsActivity(){

        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);

    }
}

