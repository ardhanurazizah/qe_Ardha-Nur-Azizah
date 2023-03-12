package Pertemuan_2;

public class Kalkulator {
    int a, b, hasil, hasil1, hasil2, hasil3;

    int setAdd(int a, int b){
        hasil = a + b;
        return hasil;
    }
    int getAdd(){
        return hasil;
    }
    int setSubstract(int a, int b){
        hasil1 = a - b;
        return hasil1;
    }
    int getSubstract(){
        return hasil1;
    }
    int setMultiply(int a, int b){
        hasil2 = a * b;
        return hasil2;
    }
    int getMultiply(){
        return hasil2;
    }
    int setDivide(int a, int b){
        hasil3 = a / b;
        return hasil3;
    }
    int getDevide(){
        return hasil3;
    }
}
