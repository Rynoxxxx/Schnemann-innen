import GLOOP.*;
public class Asiate2 extends Schneemann{

    GLKegel hut;
    GLZylinder bart, bart1, bart2;
    public Asiate2 (double pX, double pZ){
        super(pX,pZ);
        hut = new GLKegel(pX,235,pZ,50,20);
        hut.setzeFarbe(1,1,0);
        hut.drehe(80,0,0);

        bart = new GLZylinder(pX,195,pZ+35,2,20);
        bart.setzeFarbe(0,0,0);
        bart.drehe(0,90,0);

        bart1 = new GLZylinder(pX-10,190,pZ+35,2,15);
        bart1.setzeFarbe(0,0,0);
        bart1.drehe(90,0,0);

        bart2 = new GLZylinder(pX+10,190,pZ+35,2,15);
        bart2.setzeFarbe(0,0,0);
        bart2.drehe(90,0,0);

    }
}
