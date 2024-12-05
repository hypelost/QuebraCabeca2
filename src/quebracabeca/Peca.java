/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quebracabeca;

/**
 *
 * @author David
 */
public class Peca {
    int[] norte = new int[2];
    int[] sul = new int[2];
    int[] leste = new int[2];
    int[] oeste = new int[2];
    int indice;
    
    public Peca(){}
    
    public Peca(int[] norte, int[] sul, int[] leste, int[] oeste, int indice){
        this.norte = norte;
        this.sul = sul;
        this.leste = leste;
        this.oeste = oeste;
        this.indice = indice;
    }
    
    
            
}
