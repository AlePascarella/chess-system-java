package xadress;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class PecaXadress extends Peca{
    
    private Color color;

    public PecaXadress(Color color, Tabuleiro tabuleiro) {
        super(tabuleiro);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
}
