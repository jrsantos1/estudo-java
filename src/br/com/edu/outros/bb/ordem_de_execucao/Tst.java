package br.com.edu.outros.bb.ordem_de_execucao;

public class Tst {
    int ini=0,fim=25;
    void print() {
        System.out.println(ini+fim);
    }
    {
        ini=fim%7;
        fim=ini*3;
    }
    Tst(int a, int b) {
        ini+=a;
        fim+=b;
        System.out.println("Os valores alterados são " + ini + " fim " + fim);
    }
    {
        ini/=2;
        fim+=10;
    }

    {
        System.out.println("O valor de ini é " + ini);
        System.out.println("O valor de fim é " + fim);
    }
}
