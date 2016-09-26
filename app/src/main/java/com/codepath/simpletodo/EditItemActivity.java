package com.codepath.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    EditText editText;
    Button saveButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        editText = (EditText)(findViewById(R.id.editText));
        Bundle bundle = getIntent().getExtras();
        String itemText = bundle.getString("editText");
        editText.setText(itemText);
        saveButton = (Button)(findViewById(R.id.saveButton));
        saveButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("editText", editText.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
