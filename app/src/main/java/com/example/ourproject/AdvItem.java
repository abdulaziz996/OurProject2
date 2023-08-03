package com.example.ourproject;

public class AdvItem {

    private int imageResourse;
    private String title;
    private String key_id;
    private String favStatus;

 public AdvItem(){

 }
 public AdvItem(int imageResourse, String title ,String key_id,String favStatus){
     this.imageResourse=imageResourse;
     this.title=title;
     this.key_id=key_id;
     this.favStatus=favStatus;
 }
        public int getImageResourse()
        {
            return imageResourse;
        }
        public void setImageResourse(int imageResourse){
     this.imageResourse=imageResourse;
        }
        public String getTitle(){
     return title;
        }
        public void setTitle(String title){
     this.title=title;
        }
        public String getFavStatus(){
     return favStatus;
        }
        public void setFavStatus(String favStatus){
     this.favStatus=favStatus;
        }
        public String getKey_id(){
     return key_id;
        }
        public void setKey_id(String key_id){
     this.key_id=key_id;
        }

}