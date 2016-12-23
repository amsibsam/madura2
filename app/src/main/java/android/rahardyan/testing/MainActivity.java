package android.rahardyan.testing;

import android.rahardyan.madura.CallHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CallHelper callHelper = new CallHelper();
        callHelper.callInit();
    }
}
