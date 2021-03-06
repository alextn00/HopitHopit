package com.example.hopithopit.ui.ambulance;

public class Ambul {
    private String own, type, num, tel, city, district;

    public void setOwn(String own) {
        this.own = own;
    }

    public String getOwn() {
        return own;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getType() {
        return type;
    }

    public String getTel() {
        return tel;
    }

    public String getNum() {
        return num;
    }

    public String getDistrict() {
        return district;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        /*return "ambul{" +
                "own='" + own + '\'' +
                ", type='" + type + '\'' +
                ", num='" + num + '\'' +
                ", tel='" + tel + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                '}';*/
        return type + num + tel + city + district;
    }
}
