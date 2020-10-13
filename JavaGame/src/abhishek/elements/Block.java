package abhishek.elements;
import abhishek.Resources;

public class Block extends Element {
    public Block(int x,int y,int Xvel){
        super(x,y,20,50,Resources.getBlockImage());
        this.xVel = Xvel;
    }
}
