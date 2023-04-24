public class Sleep {
    public Sleep(){
        try {
            Thread.sleep(3000);                 //3000 Milliseconds - 3 Seconds
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        return;
    }
    
}

/*
    private static Sleep Sleep;

    Sleep = new Sleep();

*/ 