package com.qinggan.javamvvm.ui.hotel;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Yorashe on 19-9-30.
 */
public class Hotel implements Serializable {
    private String name;
    private String checkInDay;
    private String checkOutDay;
    private String info;
    private String score;
    private String roomPrice;
    private String roomInfo;
    private String imgUri;

//    private List<Room> rooms;

    class Room implements Serializable{
        private double price;
        private String roomInfo;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCheckInDay() {
        return checkInDay;
    }

    public void setCheckInDay(String checkInDay) {
        this.checkInDay = checkInDay;
    }

    public String getCheckOutDay() {
        return checkOutDay;
    }

    public void setCheckOutDay(String checkOutDay) {
        this.checkOutDay = checkOutDay;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }


    public String getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(String roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getRoomInfo() {
        return roomInfo;
    }

    public void setRoomInfo(String roomInfo) {
        this.roomInfo = roomInfo;
    }

    public String getImgUri() {
        return imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }
}
