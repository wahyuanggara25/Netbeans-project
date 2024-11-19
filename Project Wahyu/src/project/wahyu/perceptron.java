/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.wahyu;

/**
 *
 * @author asus
 */
 
public class perceptron{
    final double alfa=0.8;
    final double teta=0.5;
    double yOut;
    double y;
    double bias;
    double trans[],bobot[];
    int epoh;
    boolean kondisi;
 
    public void learn(double[][] inputan, double[] target){
        trans = new double[target.length];
        bobot = new double[inputan.length];
        //mengubah nilai -1 dengan 0
        for(int a=0; a<target.length; a++){
            if(target[a]==1){
                trans[a]=1;
            }else{
                trans[a]=-1;
            }
        }
 
        epoh=0;
        do{
            System.out.println(++epoh);
            kondisi=true;
            for(int b=0; b<inputan.length; b++){
                //prncarian nilai output
                double bubut=0;
                for(int c=0; c<inputan[0].length; c++){
                    bubut+=bobot[c]*inputan[b][c];
                    System.out.print(bobot[c]);
                }
                System.out.println();
                yOut=bias+bubut;
 
                //penggunaan pengaktifan bipolar
                if(yOut<-teta){
                    y=-1;
                }else if((yOut>=-teta)&&(yOut<=teta)){
                    y=0;
                }else{
                    y=1;
                }
 
                //penentuan kondisi
                if(y!=trans[b]){
                    for(int c=0; c<inputan[0].length; c++){
                        bobot[c]=bobot[c]+alfa*trans[b]*inputan[b][c];
                    }
                    bias=bias+alfa*trans[b];
                    kondisi=false;
                }
            }
 
            if(epoh==1000){
                System.out.println("I Dont Know This...");
                kondisi=true;
            }
        }
        while(kondisi==false);
    }
 
 
    public void test(double in1,double in2){
        yOut=bias+in1*bobot[0]+in2*bobot[1];
 
        if(yOut<-teta){
            y=-1;
        }else if((yOut>-teta) && (yOut<teta)){
            y=0;
        }else{
            y=1;
        }
 
        if(y==-1) y=0;
        System.out.println((int)in1+" "+(int)in2+" adalah "+(int)y);
    }
 
    public static void main(String haripinter[]){
        perceptron persept = new perceptron();
        double data[][] = {{1,1},{1,0},{0,1},{0,0}};
        double target[] = {1,1,1,0};
        persept.learn(data, target);
        
        persept.test(1, 1);
        persept.test(0, 1);
        persept.test(1, 0);
        persept.test(0, 0);
        
    }
}

