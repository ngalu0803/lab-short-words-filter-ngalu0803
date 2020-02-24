import java.util.ArrayList;

public interface Filter {
    static ArrayList<Object> applyFilter(ArrayList<Object> objects, Filter f) {
        ArrayList<Object> filtered = new ArrayList<>();
        boolean accept(Object x);
        static ArrayList<Object> applyFilter(ArrayList<Object> objects, Filter f) {
            //creating an array list to store the result
            ArrayList<Object> result = new ArrayList<Object>();
            //looping through each object
            for (Object ob : objects) {
                //if f accepts ob, adding ob to result
                if (f.accept(ob)) {
                    result.add(ob);
                }
            }
            //returning result
            return result;
        }
    }
        
        
        
        
        
        
        
        
        return filtered;
    }
}
