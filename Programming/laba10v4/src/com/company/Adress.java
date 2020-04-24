package com.company;

public class Adress {
    String street;
    String nomer_doma;
    int index;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNomer_doma() {
        return nomer_doma;
    }

    public void setNomer_doma(String nomer_doma) {
        this.nomer_doma = nomer_doma;
    }



    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Adress(String street, String nomer_doma, int index) throws Exception {

        this.street = street;
        this.nomer_doma =nomer_doma;
        this.index = index;
        check(index);

    }

    public Adress()  {
    }

    public void check (int index) throws Exception {
        if (index<0) {
            throw new Exception();
        }
    }
}
