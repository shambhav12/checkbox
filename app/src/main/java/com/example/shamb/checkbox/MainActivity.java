package com.example.shamb.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox;
    private TextView textView;
    private Button button;
    private CheckBox checkBox2;
    private CheckBox checkBox3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      button = (Button) findViewById(R.id.buttonID);
      checkBox = (CheckBox) findViewById(R.id.checkBoxID);
      checkBox2 = (CheckBox) findViewById(R.id.checkBoxID2);
      checkBox3 = (CheckBox) findViewById(R.id.checkBoxID3);
      textView = (TextView) findViewById(R.id.resultID);

      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
         StringBuilder stringBuilder = new StringBuilder();
         stringBuilder.append(checkBox.getText().toString() + "status is" + checkBox.isChecked() + "\n");
              stringBuilder.append(checkBox2.getText().toString() + "status is" + checkBox2.isChecked() + "\n");
              stringBuilder.append(checkBox3.getText().toString() + "status is" + checkBox3.isChecked() + "\n");
              textView.setText(stringBuilder);





          }
      });


    }
}
