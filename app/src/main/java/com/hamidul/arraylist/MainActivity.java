package com.hamidul.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList <HashMap <String,String>> arrayList = new ArrayList<>();
    HashMap <String,String> hashMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setStatusBarColor(Color.WHITE);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        Data();

        MyAdapter myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);


    }//onCreate=====================================================================================

    public class MyAdapter extends BaseAdapter{
        LayoutInflater layoutInflater;
        ImageView imageView;
        TextView tvName,tvMobile;
        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myView = layoutInflater.inflate(R.layout.item,parent,false);

            imageView = myView.findViewById(R.id.imageView);
            tvName = myView.findViewById(R.id.tvName);
            tvMobile = myView.findViewById(R.id.tvMobile);

            HashMap <String,String> hashMap1 = arrayList.get(position);
            String name = hashMap1.get("name");
            String mobile = hashMap1.get("mobile");
            int count = position+1;

            tvName.setText(count+" "+name);
            tvMobile.setText(mobile);

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, ""+name, Toast.LENGTH_SHORT).show();
                }
            });

            return myView;
        }
    }

    private void Data (){

        hashMap = new HashMap<>();
        hashMap.put("name","S.M.Hamidul");
        hashMap.put("mobile","01611683142");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","S.M.Ujjal");
        hashMap.put("mobile","01745623598");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Mahadi Hasan");
        hashMap.put("mobile","01784875091");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Ajad Shikdar");
        hashMap.put("mobile","01758586208");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","S.M.Hamidul");
        hashMap.put("mobile","01611683142");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","S.M.Ujjal");
        hashMap.put("mobile","01745623598");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Mahadi Hasan");
        hashMap.put("mobile","01784875091");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Ajad Shikdar");
        hashMap.put("mobile","01758586208");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","S.M.Hamidul");
        hashMap.put("mobile","01611683142");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","S.M.Ujjal");
        hashMap.put("mobile","01745623598");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Mahadi Hasan");
        hashMap.put("mobile","01784875091");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Ajad Shikdar");
        hashMap.put("mobile","01758586208");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","S.M.Hamidul");
        hashMap.put("mobile","01611683142");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","S.M.Ujjal");
        hashMap.put("mobile","01745623598");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Mahadi Hasan");
        hashMap.put("mobile","01784875091");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","Ajad Shikdar");
        hashMap.put("mobile","01758586208");
        arrayList.add(hashMap);


    }

}//AppCompatActivity================================================================================