import java.util.ArrayList;

public interface Filter {
    static ArrayList<Object> applyFilter(ArrayList<Object> objects, Filter f) {
        ArrayList<Object> filtered = new ArrayList<>();
    

boolean accept(Object x);

static ArrayList<Object> applyFilter(ArrayList<Object> objects, Filter f) {
ArrayList<Object> filtered = new ArrayList<>();

ArrayList<Object> result = new ArrayList<Object>();

for (Object ob : objects) {
if (f.accept(ob)) {
result.add(ob);

}
return result;
}
        
        
        
        
        
        
        
       
    
}
