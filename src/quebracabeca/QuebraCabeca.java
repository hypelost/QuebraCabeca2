
package quebracabeca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class QuebraCabeca {
    
    public static void main(String[] args) {
        int[] zeroUm = {0, 1};
        int[] umZero = {1, 0};
        int[] umUm = {1, 1};
        int op = 1, op2;
        Scanner ler = new Scanner(System.in);
        List<Peca> listaPecas = new ArrayList<>();
        Mesa mesa = new Mesa(){};
      
        
        Borda peca1 = new Borda(umUm, zeroUm, umZero, umUm, 1);
        Borda peca2 = new Borda(umUm, umZero, zeroUm, zeroUm, 2);
        Borda peca3 = new Borda(umUm, zeroUm, umUm, zeroUm, 3);
        Borda peca4 = new Borda(umZero, umUm, umUm, zeroUm, 4);
        Peca peca5 = new Peca(umZero, umUm, umZero, umZero, 5);
        Borda peca6 = new Borda(umZero, umZero, umUm, zeroUm, 6);
        Borda peca7 = new Borda(zeroUm, umUm, zeroUm, umUm, 7);
        Borda peca8 = new Borda(zeroUm, umUm, umZero, umZero, 8);
        Borda peca9 = new Borda(zeroUm, umUm, umUm, zeroUm, 9);
        
        listaPecas.add(peca1);
        listaPecas.add(peca2);
        listaPecas.add(peca3);
        listaPecas.add(peca4);
        listaPecas.add(peca5);
        listaPecas.add(peca6);
        listaPecas.add(peca7);
        listaPecas.add(peca8);
        listaPecas.add(peca9);
        
        
        
        
        do{
            
            System.out.println("Selecione uma peca: ");
            for(int i = 0; i<listaPecas.size(); i++){
                System.out.println(i+1 + " - Peca " +listaPecas.get(i).indice);
            }
            System.out.println("10 - Sair ");
            op = ler.nextInt();
            if(op < 1 || op > 10){
                System.out.println("Opcao invalida");
                op = 1;
                break;        
            }
            
            listaPecas.remove(listaPecas.get(op-1));
            if(mesa.getList().isEmpty()){
                System.out.println("Selecione uma peça para encaixar com a peca: ");
                for(int i = 0; i<listaPecas.size(); i++){
                    System.out.println(i+1 + " - Peca " +listaPecas.get(i).indice);
                }
            }
            
            else{
                System.out.println("Selecione uma das pecas já encaixadas para encaixar com a peca selecionada" + mesa.getList().get(op-1).indice + ":");
                for(int i = 0; i<listaPecas.size(); i++){
                    System.out.println(i+1 + " - Peca " +listaPecas.get(i).indice);
                }
            }
            
            op2 = ler.nextInt();
            if(op2 < 1 || op2 > 10){
                System.out.println("Opcao invalida");
                op = 1;
                break;        
            }
            if(mesa.AddPeca(listaPecas.get(op-1), listaPecas.get(op-1))==1){
                listaPecas.remove(listaPecas.get(op2-1));
            }
            else{
                listaPecas.add(listaPecas.get(op-1));
            }
            
        }while(op>0 && op<10);
        
        
    }
    
}
