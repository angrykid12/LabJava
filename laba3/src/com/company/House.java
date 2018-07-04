package com.company;

import java.util.Scanner;

public class House
{
    private int id;
    private int numberofroom;
    private double square;
    private int floor;
    private int countofroom;
    private String adress;
    private String typeofbuild;
    private int yearofexp;

    House(int i, int num_rum, double sq, int fl, int count, String ad, String type, int year)
    {
        this.id = i;
        this.numberofroom = num_rum;
        square = sq;
        this.floor = fl;
        this.countofroom = count;
        this.adress = ad;
        this.typeofbuild = type;
        this.yearofexp = year;

    }

    public int getId()
    {
        return id;
    }

    public int getNumberofRoom(){
        return numberofroom;
    }

    public double getSquare(){
        return square;
    }

    public int getFloor(){
        return floor;
    }

    public int getCountofroom(){
        return countofroom;
    }

    public String getAdress(){
        return adress;
    }

    public String getTypeofbuild(){
        return typeofbuild;
    }

    public int getYearofexp(){
        return yearofexp;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNumberofroom(int numberofroom){
        this.numberofroom = numberofroom;
    }

    public void setSquare(double square){
        this.square = square;
    }

    public void setFloor(int floor){
        this.floor = floor;
    }

    public void setAdress(String adress){
        this.adress = adress;
    }

    public void setCountofroom(int countofroom)
    {
        this.countofroom = countofroom;
    }

    public void setTypeofbuild(String typeofbuild){
        this.typeofbuild = typeofbuild;
    }

    public void setYearofexp(int yearofexp){
        yearofexp = yearofexp;
    }


    public String toString()
    {
        return "id: " + getId() +
                "\nНомер квартиры: " + getNumberofRoom() + "\nПлощадь: " + getSquare() + "\nЭтаж: "
                + getFloor()+ "\nКоличество комнат:" + getCountofroom() +"\nУлица: "+ getFloor() + "\nТип здания: " + getTypeofbuild() +
                "\nСрок эксплуатации: " + getYearofexp() + "\n";
    }

    public void checkRoom(int room)
    {
        if(countofroom == room) System.out.println(toString());
    }

    public void checkSquare(double squar_e)
    {
        if(squar_e < square) System.out.println(toString());
    }



}
