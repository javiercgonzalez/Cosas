package com.example.javi.practicafragments1.utils;

import com.example.javi.practicafragments1.R;

import java.util.ArrayList;

public class DataSet {
    public static ArrayList listar(){

        Version v1,v2,v3;
        ArrayList list=new ArrayList<>();
        v1=new Version("Samsung","asd",R.string.beta, R.drawable.samsung,"12");
        v2=new Version("IOS","asd",R.string.beta,R.drawable.ios,"12");
        v3=new Version("Linux","asd",R.string.beta,R.drawable.linux,"12");
        list.add(v1);
        list.add(v2);
        list.add(v3);


        v1.getSubversiones().add(new Version("Beta","24 Septiembre",R.string.beta, R.drawable.beta,"12"));
        v1.getSubversiones().add(new Version("Apple Pie","13 Octubre",R.string.apple_pie, R.drawable.apple_pie,"1.4"));
        v1.getSubversiones().add(new Version("Ginger Bread","25 Enero",R.string.gingerbread, R.drawable.gingerbread,"17"));
        v1.getSubversiones().add(new Version("Cupcake","17 Agosto",R.string.cupcake,R.drawable.cupcake,"3.2"));
        v1.getSubversiones().add(new Version("Donut","4 Marzo",R.string.donut , R.drawable.donut,"1.8"));
        v1.getSubversiones().add(new Version("Banana","19 Abril",R.string.banana,  R.drawable.banana,"1.7"));
        v1.getSubversiones().add(new Version("Jelly Bean","21 Febrero",R.string.jelly_bean, R.drawable.jelly_bean,"4.3"));
        v1.getSubversiones().add(new Version("Icecream","12 Julio",R.string.icecream, R.drawable.icecream,"1.8"));
        v1.getSubversiones().add(new Version("Mars","9 Noviembre",R.string.mars, R.drawable.mars,"7.4"));
        v1.getSubversiones().add(new Version("Kitkat","2 Diciembre",R.string.kitkat,R.drawable.kitkat,"3.8"));


        v2.getSubversiones().add(new Version("iPhone OS 1.0","31 Octubre",R.string.os1, R.drawable.os1,"1.0"));
        v2.getSubversiones().add(new Version("iPhone OS 2.0 Pie","14 Julio",R.string.os2, R.drawable.os2,"2.0"));
        v2.getSubversiones().add(new Version("iPhone OS 3.0 Bread","25 Febrero",R.string.os3, R.drawable.os3,"3.0"));
        v2.getSubversiones().add(new Version("iOS 4","25 Febrero",R.string.os4, R.drawable.ios4,"4.0"));
        v2.getSubversiones().add(new Version("iOS 5","25 Febrero",R.string.os5, R.drawable.ios5,"5.0"));
        v2.getSubversiones().add(new Version("iOS 6","25 Febrero",R.string.os6, R.drawable.ios6,"6.0"));
        v2.getSubversiones().add(new Version("iOS 7","25 Febrero",R.string.os7, R.drawable.ios7,"7.0"));

        v3.getSubversiones().add(new Version("Debian GNU","25 Febrero",R.string.lin1, R.drawable.linux1,"1.1"));
        v3.getSubversiones().add(new Version("Emmabuntüs","25 Febrero",R.string.lin2, R.drawable.linux2,"1.5"));
        v3.getSubversiones().add(new Version("Fedora 16","25 Febrero",R.string.lin3, R.drawable.linux3,"1.7"));
        v3.getSubversiones().add(new Version("Gentoo","25 Febrero",R.string.lin4, R.drawable.linux4,"1.8"));
        v3.getSubversiones().add(new Version("Mandriva","25 Febrero",R.string.lin5, R.drawable.linux5,"2.3"));
        v3.getSubversiones().add(new Version("openSUSE","25 Febrero",R.string.lin6, R.drawable.linux6,"2.5"));
        v3.getSubversiones().add(new Version("Slackware","25 Febrero",R.string.lin7, R.drawable.linux7,"2.7"));
        v3.getSubversiones().add(new Version("Ubuntu","25 Febrero",R.string.lin8, R.drawable.linux8,"2.9"));


        return list;
    }
}
