package aplication;

import tabuleiro.Posicao;
import xadress.PartidaXadress;
import xadress.PecaXadress;

public class programma {
    public static void main(String[] args){
        
        PartidaXadress partidaXadress = new PartidaXadress();
        UI.imprimeTabuleiro(partidaXadress.pecas());
    }
}
