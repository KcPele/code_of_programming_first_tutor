package EncapsAndPoly;

import com.sun.source.tree.Tree;

public class Poly {
    public static void main(String[] args) {


        Plant plant1 = new Plant();
        Oak oak = new Oak();
        Plant plant2 = oak;
        plant2.grow();
        oak.oaking();
    }
}
