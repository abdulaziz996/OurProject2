package com.example.ourproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class FaDB extends SQLiteOpenHelper {

    private static int DB_V = 1;
    private static String DB_NAME ="Art";
    private static String TABLE_NAME ="Favorite";
    public static String KEY_ID ="id";
     public static String ITEM_TITLE ="itemTitle";
     public static String ITEM_IMAGE ="itamImage";
    public static String FAVORITE_STATUS ="fState";
     private static String CREATE_TABLE ="CREATE TABLE " + TABLE_NAME +"("
             + KEY_ID + "TEXT," + ITEM_TITLE + " TEXT,"+ITEM_IMAGE
             +"TEXT,"+ FAVORITE_STATUS+"TEXT)";

    public FaDB(Context context){super(context,DB_NAME,null,DB_V);}
    @Override
public void onCreate(SQLiteDatabase sqLiteDatabase){
         sqLiteDatabase.execSQL(CREATE_TABLE);

}
@Override
public void onUpgrade(SQLiteDatabase sqLiteDatabase , int i ,int i1){

}

public void insertEmpty(){
         SQLiteDatabase db = this.getWritableDatabase();
    ContentValues cv = new ContentValues();

    for(int x=1; x<11 ; x++){
        cv.put(KEY_ID,x);
        cv.put(FAVORITE_STATUS,"0");

        db.insert(TABLE_NAME, null, cv);
    }

}
public void insertIntoDB(String item_title,int item_image, String id, String fav_state){
         SQLiteDatabase db;
         db =this.getWritableDatabase();
         ContentValues cv =new ContentValues();
         cv.put(ITEM_TITLE, item_title);
         cv.put(ITEM_IMAGE,item_image);
         cv.put(KEY_ID,id);
         cv.put(FAVORITE_STATUS,fav_state);
         db.insert(TABLE_NAME,null,cv);
    Log.d("FaDB Status", item_title+ ", favstatus - "+fav_state+" - . "+ cv);
}
public Cursor read_all_data(String id){
         SQLiteDatabase db = this.getReadableDatabase();
         String sql = "select * from "+ TABLE_NAME + " where "+ KEY_ID+"="+id+"";
         return db.rawQuery(sql,null,null);
}
public void remove_fav(String id){
         SQLiteDatabase db = this.getWritableDatabase();
         String sql ="UPDATE" + TABLE_NAME + "SET "+ FAVORITE_STATUS +"='0' WHERE "+ KEY_ID+"="+id+"";
         db.execSQL(sql);
         Log.d("remove",id.toString());

}
public Cursor select_all_fav_list(){
         SQLiteDatabase db = this.getReadableDatabase();
         String sql="SELECT * FROM "+TABLE_NAME+" WHERE "+FAVORITE_STATUS+" ='1'";
         return db.rawQuery(sql,null,null);
}
}