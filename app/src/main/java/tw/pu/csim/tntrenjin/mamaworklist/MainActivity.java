package tw.pu.csim.tntrenjin.mamaworklist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    Intent it;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        it = new Intent();
    }

    public void selectWorkClick(View v) {
        it.setClass(this, WorkListActivity.class);
        startActivity(it);
        finish();
    }


}
