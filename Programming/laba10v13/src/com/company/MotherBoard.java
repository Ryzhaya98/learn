package com.company;

public class MotherBoard {

    double OZU;
    Processor proc;

    public double getOZU() {
        return OZU;
    }

    public void setOZU(double OZU) {
        this.OZU = OZU;
    }

    public Processor getProc() {
        return proc;
    }

    public void setProc(Processor proc) {
        this.proc = proc;
    }

    public MotherBoard(String proc_name, double ozu) throws Exception {
        this.proc = new Processor(proc_name);
        check(ozu);
        this.OZU = ozu;
    }

    public void check(double ozu)throws Exception{
        if(ozu<0) {
            throw new Exception();
        }
    }
}
