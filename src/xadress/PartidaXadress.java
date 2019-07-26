package xadress;

import tabuleiro.Tabuleiro;

public class PartidaXadress {
    
    private Tabuleiro tabuleiro;
    
    public PartidaXadress(){
        tabuleiro = new Tabuleiro(8, 8);
    }
    
    public PecaXadress[][] pecas(){
        PecaXadress[][] mat = new PecaXadress[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for(int i = 0; i < tabuleiro.getLinhas(); i++){
            for(int j = 0; j < tabuleiro.getColunas(); j++){
                mat[i][j] = (PecaXadress) tabuleiro.peca(i, j);
            }
        }
        return mat;
    }
}
