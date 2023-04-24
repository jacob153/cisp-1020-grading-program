public class CLS {
    public CLS(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        return;
    }
}

/*
 * use this at top of other class
 * private static CLS CLS;
 * 
 * Use this to direct to this class
 * CLS = new CLS();
 */