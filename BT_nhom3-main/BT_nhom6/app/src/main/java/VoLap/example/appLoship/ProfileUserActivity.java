package VoLap.example.appLoship;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.circleview.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfileUserActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_user);

        BottomNavigationView btnview;
        btnview = (BottomNavigationView) findViewById(R.id.bottom_ProFile);

        btnview.setSelectedItemId(R.id.canhan);
        btnview.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), Home_Activity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.thongbao:
                        startActivity(new Intent(getApplicationContext(), ThongBaoActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.canhan:
                        return true;
                }
                return false;
            }
        });
    }
}