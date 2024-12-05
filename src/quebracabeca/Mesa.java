/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quebracabeca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Mesa {
    List<Peca> listaPeca = new ArrayList();
    int[] zeroUm = {0, 1};
    int[] umZero = {1, 0};
    int[] umUm = {1, 1};
    
    public int AddPeca(Peca p, Peca p2){
        /*switch(listaPeca.size()){
            case 0:
                if(p.oeste[0] == 1 && p.oeste[1] == 1 &&
                    p.norte[0] == 1 && p.norte[1] == 1){
                    listaPeca.add(p);
                    System.out.println("Peca adicionada!!!");
                }
                else{
                     System.out.println("Peca selecionada nao encaixa!!!");
                }
                break;
            case 1:
                if(listaPeca.get(listaPeca.size()-1).leste[0] == p.oeste[1] &&
                   listaPeca.get(listaPeca.size()-1).leste[1] == p.oeste[0] &&
                   listaPeca.get(listaPeca.size()-1).norte[0] == 1 &&
                   listaPeca.get(listaPeca.size()-1).norte[1] == 1 &&
                   p.leste[0] + p.leste[1] < 2){
                    listaPeca.add(p);
                    System.out.println("Peca adicionada!!!");
                }
                else
                {
                    System.out.println("Peca não encaixa!!!");
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
        }
        
        */
        if(p.leste[1] != p2.oeste[0] &&
           p.leste[0] != p2.oeste[1]){
            System.out.println("As peças encaixam!!! ");
            listaPeca.add(p);
            listaPeca.add(p2);
            return 1;
        }
        else{
            if(p.oeste[1] != p2.leste[0] &&
                p.oeste[0] != p2.leste[1]){
                System.out.println("As peças encaixam!!! ");
                listaPeca.add(p);
                listaPeca.add(p2);
                return 1;
            }
            else{
                    if(p.leste[1] != p2.oeste[0] &&
                        p.leste[0] != p2.oeste[1]){
                        System.out.println("As peças encaixam!!! ");
                        listaPeca.add(p);
                        listaPeca.add(p2);
                        return 1;
                        }
                    else{
                        if(p.norte[1] != p2.sul[0] &&
                           p.norte[0] != p2.sul[1]){
                            System.out.println("As peças encaixam!!! ");
                            listaPeca.add(p);
                            listaPeca.add(p2);
                            return 1;
                        }
                        else{
                            if(p.sul[1] != p2.norte[0] &&
                               p.sul[0] != p2.norte[1]){
                                 System.out.println("As peças encaixam!!! ");
                                 listaPeca.add(p);
                                 listaPeca.add(p2);
                                 return 1;
                            }
                        }

                    }
        }
        
        return 0;
        }
        
    }
    
    public List<Peca> getList(){
        return listaPeca;
    }
}
