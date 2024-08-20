
class Program5 {
    public static void main(String[] args){
        int mRoyale=286;
        int gRoyale=9;
        int mKoopa=412;
        int gKoopa=40;
        int mFrame=361;
        int gFrame=18;
        int mBadwagon=161;
        int gBadwagon=11;
        
        double royaleMPG= (double)mRoyale/gRoyale;
        double koopaMPG= (double)mKoopa/gKoopa;
        double frameMPG=(double)mFrame/gFrame;
        double badwagonMPG = (double)mBadwagon/gBadwagon;
        
        royaleMPG= ((int)(royaleMPG*10+0.5)); 
        royaleMPG=(royaleMPG/10); 
        
        koopaMPG=((int)(koopaMPG*10+0.5)); 
        koopaMPG=(koopaMPG/10); 
        
        frameMPG=((int)(frameMPG*10+0.5)); 
        frameMPG=(frameMPG/10); 
        
        badwagonMPG=((int)(badwagonMPG*10+0.5)); 
        badwagonMPG=(badwagonMPG/10); 
        
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon");
        System.out.println("Royale averaged "+royaleMPG+" m/g");
        System.out.println("Koopa King averaged "+koopaMPG+" m/g");
        System.out.println("Pipe Frame averaged "+frameMPG+" m/g");
        System.out.println("Badwagon averaged "+badwagonMPG+" m/g");
    }
}
