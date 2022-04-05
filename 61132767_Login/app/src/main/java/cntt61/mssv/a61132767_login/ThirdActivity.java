package cntt61.mssv.a61132767_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView tvUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        tvUserName = (TextView) findViewById(R.id.tvUserName);
        Intent i = getIntent();
        Bundle b = i.getBundleExtra("data");
        String strchaomung = b.getString("chaomung");
        tvUserName.setText(tvUserName.getText().toString() + strchaomung);
    }
}