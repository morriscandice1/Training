import java.util.ArrayList;
public class modArrayList<D> extends ArrayList<D>  { //allowing any type of data to be stored in the list through "d"

    //get using mod method
    public D getUsingMod(int index) {
        int validIndex = Math.abs(index) % this.size();
        return this.get(validIndex);
    }
}
