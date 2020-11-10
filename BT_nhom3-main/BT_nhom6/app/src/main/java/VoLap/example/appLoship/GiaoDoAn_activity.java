package VoLap.example.appLoship;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ViewFlipper;

import com.example.circleview.R;

public class  GiaoDoAn_activity extends AppCompatActivity {
    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giaodoan);

        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.setAutoStart(true);


    }
}
