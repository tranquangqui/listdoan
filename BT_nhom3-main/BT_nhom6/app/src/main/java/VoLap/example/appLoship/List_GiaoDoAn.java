package VoLap.example.appLoship;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.circleview.R;

import java.util.ArrayList;

public class List_GiaoDoAn extends AppCompatActivity {

    GridView gridHinhAnh;
    ArrayList<GridViewBean> arrayList;
    GridViewBaseAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_giao_do_an);

        Anhxa();

        adapter = new GridViewBaseAdapter(this,R.layout.activity_picture,arrayList);
        gridHinhAnh.setAdapter(adapter);

        /*
        BottomNavigationView btnview;
        btnview = (BottomNavigationView)findViewById(R.id.bottom_navigation);

        btnview.setSelectedItemId(R.id.thongbao);

        btnview.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), GameHomeActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.thongbao:
                        return true;
                    case R.id.canhan:
                        startActivity(new Intent(getApplicationContext(),SettingsActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

         */

    }
    private void Anhxa(){
        gridHinhAnh = (GridView)findViewById(R.id.gridviewServices);
        arrayList = new ArrayList<>();
        arrayList.add(new GridViewBean("Bánh canh ghẹ",R.drawable.monan_banhcanhghe));
        arrayList.add(new GridViewBean("Bánh canh giò",R.drawable.monan_banhcanhgio));
        arrayList.add(new GridViewBean("Bánh mỳ",R.drawable.monan_banhmy));
        arrayList.add(new GridViewBean("Bánh tráng",R.drawable.monan_banhtrang));
        arrayList.add(new GridViewBean("Bánh tráng cuộn",R.drawable.monan_banhtrangcuon));
        arrayList.add(new GridViewBean("Cá viên chiên",R.drawable.monan_cavienchien));
        arrayList.add(new GridViewBean("Cơm",R.drawable.monan_com));
        arrayList.add(new GridViewBean("Đồ ăn combo",R.drawable.monan_combo));
        arrayList.add(new GridViewBean("Bánh tráng cuộn",R.drawable.monan_banhtrangcuon));
        arrayList.add(new GridViewBean("Bánh tráng",R.drawable.monan_banhtrang));
        arrayList.add(new GridViewBean("Cơm sườn",R.drawable.monan_comsuon));
        arrayList.add(new GridViewBean("Trà sửa",R.drawable.monan_trasua));
        arrayList.add(new GridViewBean("Trà sửa",R.drawable.monan_trasua1));
        arrayList.add(new GridViewBean("Trà sửa",R.drawable.monan_trasua2));
    }

}

