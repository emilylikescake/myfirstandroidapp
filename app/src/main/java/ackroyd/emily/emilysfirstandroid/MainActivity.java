package ackroyd.emily.emilysfirstandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Hello MillMills !");

        final Button button = findViewById(R.id.button_find_your_age);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView youragewillbe;
                youragewillbe = (TextView) v.getRootView().findViewById(R.id.your_age_will_be);

                TextView startingAge = (TextView) v.getRootView().findViewById(R.id.my_age);

                int newAge = Integer.parseInt(startingAge.getText().toString()) + 31;
                System.out.println("number is: " + newAge);
                youragewillbe.setText("For Mummy and Daddy's Golden Wedding Anniversary your age will be: " + Integer.toString(newAge));
                System.out.println(youragewillbe.getText());

            }
        });


    }
}
