package com.sport_of_life.sportoflife.activities.listview;

public class Program {
    private int id;
    private String hareketIsmi;
    private String alet;
    private String setMiktarı;

    //Constructor

    public Program(int id, String hareketIsmi, String alet, String setMiktarı) {
        this.id = id;
        this.hareketIsmi = hareketIsmi;
        this.alet = alet;
        this.setMiktarı = setMiktarı;
    }

    //Setter, getter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String gethareketIsmi() {
        return hareketIsmi;
    }

    public void sethareketIsmi(String hareketIsmi) {
        this.hareketIsmi = hareketIsmi;
    }

    public String getAlet() {
        return alet;
    }

    public void setAlet(String alet) {
        this.alet = alet;
    }

    public String getsetMiktarı() {
        return setMiktarı;
    }

    public void setsetMiktarı(String setMiktarı) {
        this.setMiktarı = setMiktarı;
    }
}



