package com.example.ourproject;

public class FavList {

    private String itemTitle;
    private String key_id;
    private int item_image;


    public FavList(String itemTitle, String key_id,int item_image){
        this.item_image=item_image;
        this.itemTitle=itemTitle;
        this.key_id=key_id;
    }
    public String getItemTitle(){
        return itemTitle;
    }
    public void setItemTitle(String itemTitle){
        this.itemTitle=itemTitle;
    }
    public String getKey_id(){
        return key_id;
    }
    public void setKey_id(){
        this.key_id=key_id;
    }
    public int getItem_image(){
        return item_image;
    }
    public void setItem_image(int item_image){
        this.item_image=item_image;
    }
}

