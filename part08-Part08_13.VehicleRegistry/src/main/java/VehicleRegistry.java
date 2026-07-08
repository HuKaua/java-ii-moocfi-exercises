import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap <LicensePlate,String> hashmap;

    public VehicleRegistry(){
        this.hashmap = new HashMap<>();

    }


    public boolean add(LicensePlate licensePlate, String owner){            
        if (hashmap.containsKey(licensePlate)) {
            return false;
        }  
            hashmap.put(licensePlate, owner);
            return true;
        
    }

    public String get(LicensePlate licensePlate){
       return hashmap.get(licensePlate);
       
    }

    public boolean remove(LicensePlate licensePlate){
        if (hashmap.containsKey(licensePlate)) {
            hashmap.remove(licensePlate);
            return true;
        }
        return false;

    }

    public void printLicensePlates(){
        for (LicensePlate plate : hashmap.keySet()) {
            System.out.println(plate);
        }

    }

    public void printOwners(){
        ArrayList <String> printedOwners = new ArrayList<>();
        
        for (String owner : hashmap.values()) {
            if (!(printedOwners.contains(owner))) {
                System.out.println(owner);
                printedOwners.add(owner);
            }
        }
    }
}
