package eser9.ese7;

import java.util.Comparator;

public class ComDem implements Comparator<Razionale>{
    @Override
    public int compare(Razionale r1, Razionale r2)
    {
        if(r1.getD() < r2.getD())
            return -1;
        if(r1.getD() > r2.getD())
            return 1;
        return 0;
    }
    
}
