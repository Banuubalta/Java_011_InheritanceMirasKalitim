package com.banubalta;

import com.banubalta.departman.Muhasebeci;
import com.banubalta.departman.Mudur;

public class AppMain {

    public static void main(String[] args) {

        Mudur mudur = new Mudur();

        mudur.setAdi("Helen");
        mudur.setSoyadi("Baysal");
        mudur.setPersonelNo(12);
        mudur.setDepartmani("Bilişim");
        mudur.setTelefonNo("123445555");
        mudur.setTahsilDurumu("Üniversite");

        //System.out.println("ADI SOYADI: " + mudur.getAdi() + " " + mudur.getSoyadi());
        //System.out.println("TAHSİL: " +  mudur.getTahsilDurumu());

        mudur.mudurBilgisiniYaz(mudur);

        System.out.println("-------------------------------");

        mudur.setAdi("Ömer");
        mudur.setSoyadi("Metin");
        mudur.setPersonelNo(12);
        mudur.setDepartmani("CEO");
        mudur.setTelefonNo("3333333");
        mudur.setTahsilDurumu("Master");

      //  System.out.println("ADI SOYADI: " + mudur.getAdi() + " " + mudur.getSoyadi());
      //  System.out.println("TAHSİL: " +  mudur.getTahsilDurumu());
        mudur.mudurBilgisiniYaz(mudur);


        Muhasebeci muhasebeci = new Muhasebeci();
        muhasebeci.setAdi("Şadiye");
        muhasebeci.setUnvani("Mali Musavir");

        System.out.println(muhasebeci);
        muhasebeci.bilgiPersonelYaz(muhasebeci);
    }


}