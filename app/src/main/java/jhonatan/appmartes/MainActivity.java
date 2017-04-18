package jhonatan.appmartes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGrup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGrup = (RadioGrup) findViewById(R.id.radioGroupId);

    }




    }
}
