package com.example.activitytest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends BaseActivity {
    private static final String TAG = "FirstActivity";

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "you clicked add item ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "you clicked remove item ", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    String returnedData = data.getStringExtra("data_return");
                    Log.d("FirstActivity", returnedData);
                }
                break;
                default:
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate:");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button1 = findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//                Toast.makeText(FirstActivity.this,"you clicked button 1",
//                       Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
//                Intent intent = new Intent("com.example.activitytest.ACTION_START");
//               intent.addCategory("com.example.activitytest.MY_CATEGORY");
//                Intent intent = new Intent("android.intent.action.VIEW");
//                intent.setData(Uri.parse("http://www.baidu.com"));
//                Intent intent = new Intent(Intent.ACTION_DIAL);
//               intent.setData(Uri.parse("tel:10086"));
//               String data = "Hello SecondActivity";
//                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
//                intent.putExtra("extra_data", data);
//                startActivity(intent);
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivityForResult(intent, 1);
            }
        });
    }
}
