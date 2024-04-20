package com.khair.gairdview;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    ArrayList<HashMap<String,String>>arrayList=new ArrayList<>();
    HashMap<String,String>hashMap=new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=findViewById(R.id.gridView);

        CreteTable();


        MyAdapter myAdapter=new MyAdapter();
        gridView.setAdapter(myAdapter);











    }
 /////////////////////////////////////////////////////////////////////////////////////////////////////
 //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
public class MyAdapter extends BaseAdapter{

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

         LayoutInflater layoutInflater= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         View myView=layoutInflater.inflate(R.layout.griditem,parent,false);

         TextView Item_Text=myView.findViewById(R.id.Item_Text);
         ImageView Item_Image=myView.findViewById(R.id.Item_Image);


         HashMap<String,String>hashMap=arrayList.get(position);
         String stringText=hashMap.get("Item_Tittle");
         String stringImage=hashMap.get("Item_Image");

         Item_Text.setText(stringText);


         int IntImage=Integer.parseInt(stringImage);
         Item_Image.setImageResource(IntImage);















         return myView;
     }
 }
///===================================CreteTable====================================================
public void CreteTable() {

   hashMap=new HashMap<>();
   hashMap.put("Item_Tittle","Clothing");
   hashMap.put("Item_Image",""+R.drawable.img_1);
   arrayList.add(hashMap);


    hashMap=new HashMap<>();
    hashMap.put("Item_Tittle","Facial");
    hashMap.put("Item_Image",""+R.drawable.img_2);
    arrayList.add(hashMap);


    hashMap=new HashMap<>();
    hashMap.put("Item_Tittle","Her Style");
    hashMap.put("Item_Image",""+R.drawable.img_3);
    arrayList.add(hashMap);


    hashMap=new HashMap<>();
    hashMap.put("Item_Tittle","Health");
    hashMap.put("Item_Image",""+R.drawable.img_4);
    arrayList.add(hashMap);


    hashMap=new HashMap<>();
    hashMap.put("Item_Tittle","Makeup");
    hashMap.put("Item_Image",""+R.drawable.img_5);
    arrayList.add(hashMap);


    hashMap=new HashMap<>();
    hashMap.put("Item_Tittle","Shoes");
    hashMap.put("Item_Image",""+R.drawable.img_6);
    arrayList.add(hashMap);



}




/////////////////////////////////////////////////////////////////////////////////////////////////////
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
}