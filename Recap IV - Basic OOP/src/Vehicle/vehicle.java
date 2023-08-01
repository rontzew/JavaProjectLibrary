package Vehicle;
import java.util.ArrayList;
import java.util.HashMap;

public class vehicle {
    public static String producedBy;
    public final int productionYear;
    public final String vin;
    public String plateNumber;
    public int kilometers;
    public int lastSoldOnYear;
    public int positionX;
    public int positionY;

    HashMap<Character, Integer> letterVals = new HashMap<>();
    HashMap<Integer, Integer> weights = new HashMap<>();
    private static final int modulo = 11;
    private static final int checkDigitIndex = 8;


    public vehicle(String producedBy, int productionYear, String vin, String plateNumber, int kilometers, int lastSoldOnYear, int positionX, int positionY) {
        vehicle.producedBy = producedBy;
        this.productionYear = productionYear;
        this.vin = vin;
        this.plateNumber = plateNumber;
        this.kilometers = kilometers;
        this.lastSoldOnYear = lastSoldOnYear;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public vehicle(String producedBy, int productionYear, String vin, String plateNumber, int kilometers, int lastSoldOnYear){
        this(producedBy, productionYear, vin, plateNumber, kilometers, lastSoldOnYear, 0, 0);
    }

    public vehicle(String producedBy, String vin, String plateNumber){
        this(producedBy, 0, vin, plateNumber, 0,0,0,0);
    }

    private String getPlateNumber(){
        return this.plateNumber;
    }

    private void setPlateNumber(String plateNo){
        this.plateNumber = plateNo;
    }

    private int getProductionYear(){
        return productionYear;
    }

    private int getLastSoldOnYear(){
        return lastSoldOnYear;
    }

    private void setLastSoldOnYear(int saleYear){
        this.lastSoldOnYear = saleYear;
    }

    private int getKilometers(){
        return this.kilometers;
    }

    private int getPositionX(){
        return positionX;
    }

    public void setPositionX(int newPosX){
        this.positionX = newPosX;
    }

    private int getPositionY(){
        return positionY;
    }

    public void setPositionY(int newPosY){
        this.positionY = newPosY;
    }

    public void sellVehicle(String plateNumber, int lastSoldOnYear){
        setPlateNumber(plateNumber);
        setLastSoldOnYear(lastSoldOnYear);
    }

    public void moveVehicle(int positionX, int positionY){
        int distance = (int)Math.sqrt(Math.pow((getPositionX() - positionX), 2) + Math.pow((getPositionY() - positionY), 2));
        setPositionX(positionX);
        setPositionY(positionY);
        this.kilometers += distance;
    }

    private void initializeVerification(){
        letterVals.put('A', 1);
        letterVals.put('B', 2);
        letterVals.put('C', 3);
        letterVals.put('D', 4);
        letterVals.put('E', 5);
        letterVals.put('F', 6);
        letterVals.put('G', 7);
        letterVals.put('H', 8);
        letterVals.put('J', 1);
        letterVals.put('K', 2);
        letterVals.put('L', 3);
        letterVals.put('M', 4);
        letterVals.put('N', 5);
        letterVals.put('P', 7);
        letterVals.put('R', 9);
        letterVals.put('S', 2);
        letterVals.put('T', 3);
        letterVals.put('U', 4);
        letterVals.put('V', 5);
        letterVals.put('W', 6);
        letterVals.put('X', 7);
        letterVals.put('Y', 8);
        letterVals.put('Z', 9);

        weights.put(1, 8);
        weights.put(2, 7);
        weights.put(3, 6);
        weights.put(4, 5);
        weights.put(5, 4);
        weights.put(6, 3);
        weights.put(7, 2);
        weights.put(8, 10);
        weights.put(9, 0);
        weights.put(10, 9);
        weights.put(11, 8);
        weights.put(12, 7);
        weights.put(13, 6);
        weights.put(14, 5);
        weights.put(15, 4);
        weights.put(16, 3);
        weights.put(17, 2);
    }

    public boolean isVinValid(boolean isDrivingInNorthAmerica){
        if(!isDrivingInNorthAmerica){
            return true;
        }
        initializeVerification();
        int sum = 0;

        ArrayList<Character> vinToArray = new ArrayList<>();
        for(int i = 0; i < this.vin.length(); i++){
            char c = this.vin.charAt(i);
            if(c == 'I' || c == 'O' || c == 'Q'){
                System.out.println("VIN is not valid!");
                return false;
            }
            vinToArray.add(c);
        }

        for(int i = 0; i < vinToArray.size(); i++){
            if(i == checkDigitIndex){
                continue;
            }
            Character c = vinToArray.get(i);
            int w = weights.get(i+1);
            if(!Character.isDigit(c)){
                sum += letterVals.get(c) * w;
            } else {
                sum += (Character.getNumericValue(c) * w);
            }
        }
        return sum % modulo == Character.getNumericValue(vinToArray.get(checkDigitIndex)) || sum % modulo == 10 && vinToArray.get(checkDigitIndex) == 'X';
    }

    public void printVinDecomposed(){
        String print = "Vehicle identifier: " +
                this.vin.substring(0, 2) +
                "Vehicle attributes: " +
                this.vin.substring(3, 7) +
                "Check digit: " +
                this.vin.substring(8, 8) +
                "Vehicle production year: " +
                this.vin.substring(9, 9) +
                "Plant series: " +
                this.vin.substring(10, 10) +
                "Numerical identifier: " +
                this.vin.substring(11);

        System.out.print(print);
    }
}
