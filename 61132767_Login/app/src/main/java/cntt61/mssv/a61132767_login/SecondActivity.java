package cntt61.mssv.a61132767_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    EditText edtUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        edtUserName = (EditText) findViewById(R.id.edtUserName);

    }

    public void denmanhinhchinh(View view) {
        Bundle b = new Bundle();
        b.putString("chaomung", edtUserName.getText().toString());
        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
        intent.putExtra("data", b);
        startActivity(intent);
    }
}