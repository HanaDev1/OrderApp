package hanaalalwi.firstday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button order = (Button) findViewById(R.id.order);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Order", Toast.LENGTH_LONG).show();
            }
        });


        final TextView NumOfOrder = (TextView) findViewById(R.id.NumOfOrder);
        NumOfOrder.setText("0");
        Button plus = (Button) findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = String.valueOf(NumOfOrder.getText());
                int valueInt = Integer.parseInt(value) + 1;
                NumOfOrder.setText(Integer.toString(valueInt));
            }
        });


    }
}
