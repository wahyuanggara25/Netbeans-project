/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaline;

/**
 *
 * @author asus
 */
public class Adaline {
    private float[][] z;
    private float[] y;
    private float[] deltaW;
    private float[] t;
    //private float y;
    private float net;
    private float b;

    private float deltaWMax;
    private int epoch;
    private int maxEpoch;
    private float alfa = 0.3f;
    private float maxError = 0.2f;

    public Adaline(){
        System.out.println("Metode Adaline");
        inisialisasi();
        training();

              
        
    }
    
    private void inisialisasi(){
        z = new float[4][2];
        z[0][0] = 1.0f;
        z[0][1] = 1.0f;
        z[1][0] = -1.0f;
        z[1][1] = 1.0f;
        z[2][0] = -1.0f;
        z[2][1] = 1.0f;
        z[3][0] = -1.0f;
        z[3][1] = -1.0f;
 
        t = new float[4];
        t[0] = 1.0f;
        t[1] = -1.0f;
        t[2] = -1.0f;
        t[3] = -1.0f;

        y = new float[2];
        deltaW = new float[2];
        for (int i=0;i<2;i++){
            y[i] = 0.0f;
            deltaW[i] = 0.0f;
        }

        b = 0.0f;
        //y = 0;
        deltaWMax = 0.0f;
        net = 0.0f;
        epoch = 0;
        maxEpoch = 10;
    }

    private int f(float net){
        if(net < 0)
            return -1;
        else
            return 1;
    }

    private void training(){
        do{
            epoch++;
            System.out.println("\nEpoch ke-"+epoch);
        System.out.println("Net          t-y         delta W1      delta W2        delta B       w1        w2        b");
            for(int i=0;i<2;i++) {
                net = z[i][0] * y[0] + z[i][1] * y[1] + b;
                deltaW[0] = alfa * (t[i] - net) * z[i][0];
                y[0] = y[0] + deltaW[0];
                deltaW[1] = alfa * (t[i] - net) * z[i][1];
                y[1] = y[1] + deltaW[1];
                b = b + alfa * (t[i] - net);
                if (deltaW[0] > deltaW[1]) {
                    deltaWMax = deltaW[0];
                }else{
                    deltaWMax = deltaW[1];
                }
                System.out.println(net+"    "+(t[i]-net)+"    "+deltaW[0]+"     "+deltaW[1]+"     "+(alfa * (t[i] - net))+"     "+y[0]+"     "+y[1]+"     "+b+"      Max Delta W = "+deltaWMax);
            }
        }while(maxError < deltaWMax);
    }

    public int mapping(float x1, float x2){
        net = y[0] * x1 + y[1] * x2 + b;
        return f(net);    }}
