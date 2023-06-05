import GLOOP.GLZylinder;

public class Asiate extends Schneemann {
    GLZylinder hut,hut1,kordel;
    public Asiate (double pX, double pZ){
        super(pX, pZ);
        hut = new GLZylinder(pX,230,pZ,25,60);
        hut.drehe(90,0,0);
        hut.setzeFarbe(0,0,0);
        hut1 = new GLZylinder(pX,225,pZ,40,5);
        hut1.drehe(90,0,0);
        hut1.setzeFarbe(0,0,0);
        kordel = new GLZylinder(pX+35,210,pZ,2,25);
        kordel.drehe(90,0,0);
        kordel.setzeFarbe(1,1,1);

    }
}
