package problema2;

public class CeasDigital implements Ceas{

    @Override
    public String citesteTimpul(int ora, int minut, int secunda) {
        return ora + ":" + minut + ":" + secunda;
    }
    
}
