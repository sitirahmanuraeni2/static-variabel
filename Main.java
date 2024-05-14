package com.tutorial;


class Display{
    static String type ="Display";
    private String name;

    Display(String name){
        this.name = name;
    }

    void setType(String typeInput){
        //type = typeInput; //alternatif 1
        this.type = typeInput; //alternatif 2
        Display.type = typeInput; //alternatif 3
    }

    void show(){
        System.out.println("Display name = " + this.name);
    }
}

public class Main {
    public static void main(String[] args) {

        Display dispaly1 = new Display("Monitor");
        dispaly1.show();

        Display dispaly2 = new Display ("Smartphone");
        dispaly2.show();

        // tampilkan static variable atau class variable

        //kita coba mengganti variable staticnya

        dispaly1.setType("Monitor");

        System.out.println("Menampilkan static atau class variable");
        System.out.println(dispaly1.type);
        System.out.println(dispaly2.type);
        System.out.println(Display.type);
    }

}