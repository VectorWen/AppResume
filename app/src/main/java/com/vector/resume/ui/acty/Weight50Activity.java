package com.vector.resume.ui.acty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.vector.resume.R;

public class Weight50Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight50);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.app_bar_layout:
                startActivity(new Intent(this,AppBarLayoutActivity.class));
                break;
            case R.id.coordinator_layout:
                startActivity(new Intent(this,CoordinatorLayoutActivity.class));
                break;
            case R.id.card_view:
                startActivity(new Intent(this,CardViewActivity.class));
                break;
        }
    }
}
