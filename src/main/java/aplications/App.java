package aplications;

import com.mycompany.dataestruture01.vectorpackage.Vector;

public class App {

    public static void main(String[] args) {
        
        String[] cars = {"Camaro", "Porsche", "Corvette", "Lamborghini",
        "BUGATTI DIVO", "VW Jetta", "Fusca", null};
        
        Vector vector = new Vector(cars.length);
        
        for(int i = 0; i < cars.length; i++){
            vector.add(i, cars[i]);
        }
        
        
        //vector.lastIndexOf("Porsche");
        vector.add("HB20");
        System.out.println(vector.toString());
    }
    
}
