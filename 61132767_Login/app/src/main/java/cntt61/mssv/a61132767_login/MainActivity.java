package cntt61.mssv.a61132767_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chuyenmanhinh(View v){
        Intent iManhinhkhac = new Intent(this, SecondActivity.class);
        startActivity(iManhinhkhac);
    }

}