package com.vector.resume.ui.acty;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;

import com.vector.resume.R;

public class ButtonActivity extends AppCompatActivity {

    private View nice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setEnterTransition(new Fade().setDuration(100));
            getWindow().setExitTransition(new Fade().setDuration(100));
        }

        setContentView(R.layout.button_activity);

        nice = findViewById(R.id.nice);
    }

    @Override
    protected void onResume() {
        super.onResume();
        nice.animate().rotation(45).setDuration(280);
    }

    public void onClick(View view){
    }
}
