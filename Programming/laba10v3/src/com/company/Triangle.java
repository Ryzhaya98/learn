package com.company;

public class Triangle {

//    Point a = new Point(0,0);// экземпляр класса для вершины а
//    Point b = new Point(0,0);
//    Point c = new Point(0,0);

    Point a;
    Point b;
    Point c;


    public Triangle(double x_a,double x_b, double x_c, double y_a, double y_b, double y_c){
        this.a = new Point(x_a,y_a);
        this.b = new Point(x_b,y_b);
        this.c = new Point(x_c,y_c);


    }

    public double length (Point a, Point b){
        double a_b_length = Math.sqrt(Math.pow(b.getX()-a.getX(), 2) + Math.pow(b.getY()-a.getY(),2));
        System.out.println("Длина равна = " + a_b_length);
        return a_b_length;

    }

    public  void checkExist () throws Exception {

        double a_c_length = length( this.a, this.c);
        double a_b_length =length( this.a, this.b);
        double b_c_length = length( this.b, this.c);

        if (b_c_length+ a_c_length < a_b_length) {
            throw new Exception();
        }
        if (a_b_length+ a_c_length < b_c_length){
            throw new Exception();
        }
        if (a_b_length+ b_c_length < a_c_length){
            throw new Exception();
        }

        System.out.println("Такой треугольник существует");


    }


}
