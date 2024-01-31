package eser9.ese7;

import java.util.Comparator;
public class CompNum implements Comparator<Razionale> {
    @Override
    public int compare(Razionale r1, Razionale r2)
    {
        if(r1.getN() < r2.getN())
            return -1;
        if(r1.getN() > r2.getN())
            return 1;
        return 0;
    }
    
}
