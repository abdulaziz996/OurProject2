package com.example.ourproject;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private ArrayList<AdvItem> AdvItem;


    private Context context;

    private FaDB faDB;

    public ItemAdapter(ArrayList<AdvItem> AdvItem ,Context context){
        this.AdvItem = AdvItem;
        this.context = context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        faDB = new FaDB(context);
        SharedPreferences prefs =context.getSharedPreferences("prefs",Context.MODE_PRIVATE);
        boolean firstStart =prefs.getBoolean("firstStart", true);
        if(firstStart){
            createTableOnfirstStart();
        }
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_fire_boat,parent,false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder , int position){
    final AdvItem advItem = AdvItem.get(position);

    readCursorDB(advItem,holder);
    holder.imageView.setImageResource(advItem.getImageResourse());
    holder.textView.setText(advItem.getTitle());
    }
    @Override
    public int getItemCount(){
        return AdvItem.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        Button favbtn;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView =itemView.findViewById(R.id.title);
            favbtn = itemView.findViewById(R.id.favbtn);
            favbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    AdvItem advItem = AdvItem.get(position);
                    if(advItem.getFavStatus().equals("0")){
                        advItem.setFavStatus("1");
                        faDB.insertIntoDB(advItem.getTitle(),advItem.getImageResourse(),advItem.getKey_id(),advItem.getFavStatus());
                        favbtn.setBackgroundResource(R.drawable.baseline_favorite_24);

                    }else {
                        advItem.setFavStatus("0");
                        faDB.remove_fav(advItem.getKey_id());
                        favbtn.setBackgroundResource(R.drawable.baseline_favorite_border_22);
                    }
                }
            });
        }
    }
    private void createTableOnfirstStart(){
        faDB.insertEmpty();

        SharedPreferences prefs = context.getSharedPreferences("prefs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        editor.putBoolean("firstStart", false);
        editor.apply();
    }


private void readCursorDB(AdvItem advItem,ViewHolder viewHolder){
    Cursor cursor =faDB.read_all_data(advItem.getKey_id());
    SQLiteDatabase db = faDB.getReadableDatabase();
    try {
        while (cursor.moveToNext()){
            String item_fav = cursor.getString(cursor.getColumnIndex(faDB.FAVORITE_STATUS));
            advItem.setFavStatus(item_fav);

            if(item_fav != null && item_fav.equals("1")){
                viewHolder.favbtn.setBackgroundResource(R.drawable.baseline_favorite_24);

            } else if (item_fav != null && item_fav.equals("0")) {
                viewHolder.favbtn.setBackgroundResource(R.drawable.baseline_favorite_border_22);

            }


        }
   } finally {
        if (cursor != null && cursor.isClosed()){
            cursor.close();
            db.close();
        }
    }
    }

    }