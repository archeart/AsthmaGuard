package edu.dartmouth;

/**
 * Created by Junior on 2/22/15.
 */
/*
  Original Author: Ganesh Tiwari
  Email : gtiwari333@gmail.com,
  Blog : http://ganeshtiwaridotcomdotnp.blogspot.com/
 */

/**
 * performs Inverser Fourier Transform
 * we used Dct because there is only real coeffs
 *
 */
public class DCT {

    /**
     * number of mfcc coeffs
     */
    int numCepstra;
    /**
     * number of Mel Filters
     */
    int M;

    /**
     * len: length of array, i.e., number of features
     * M: number of Mel Filters
     */

    public DCT(int numCepstra, int M) {
        this.numCepstra = numCepstra;
        this.M = M;
    }

    public double[] performDCT(double y[]) {
        double cepc[] = new double[numCepstra];
        // perform DCT
        for (int n = 1; n <= numCepstra; n++) {
            for (int i = 1; i <= M; i++) {
                cepc[n - 1] += y[i - 1] * Math.cos(Math.PI * (n - 1) / M * (i - 0.5));
            }
        }
        return cepc;
    }
}
