
/**
 *
 * @author chris
 */
public final class VendingMachine {
  
    private boolean isOn;
    private String itemName;
    private int itemCost;
    private int itemQuant;
    static int baseSerialNumber = 999;
    int serialNumber;
    int maxQuant;
    
    /**
     *
     * @param addItemName
     * @param addItemQuant
     * @param addItemCost
     * @param setQuant
     */
    public VendingMachine(String addItemName, int addItemQuant, int addItemCost, int setQuant) {
       isOn = true;
       
       
       setMaxQuant(setQuant);
       setItemName(addItemName);
       setItemQuant(addItemQuant);
       setItemCost(addItemCost);
       serialNumber = baseSerialNumber + 1;
       baseSerialNumber = serialNumber;
    }
       
    /**
     *
     * @param setQuant
     */
    public void setMaxQuant(int setQuant){
        if (isOn){
        if (setQuant <= 10 && setQuant > 0) {
            maxQuant = setQuant;
        }
        else throw new IllegalArgumentException("MAX QUANTITY ALREADY REACHED");
        }
    }
   
    /**
     *
     */
    public VendingMachine(){
       maxQuant = 10;
    }
  
    /**
     *
     */
    public void setIsOn() {
        isOn = !isOn;
    }

    /**
     *
     * @return
     */
    public String getItemName() {
        if (isOn){
        return itemName;
    } else return null;
    }

    /**
     *
     * @param addItemName
     */
    public void setItemName(String addItemName) {
        if (isOn){     
        itemName = addItemName;
    }
    }

    /**
     *
     * @return
     */
    public Integer getItemCost() {
        if (isOn){
        return itemCost;
    } else return null;
    }

    /**
     *
     * @param addItemCost
     */
    public void setItemCost(int addItemCost) {
        if (isOn){
        itemCost = addItemCost;
    }
    }

    /**
     *
     * @return
     */
    public Integer getItemQuant() {
        if (isOn){
        return itemQuant;
        } else return null;
    }
       
    /**
     *
     * @param addItemQuant
     */
    public void setItemQuant(int addItemQuant) {
        if (isOn){
        if ((addItemQuant + itemQuant) <= maxQuant && addItemQuant > 0){
        itemQuant = itemQuant + addItemQuant;
    }
        else throw new IllegalArgumentException("MAX QUANTITY ALREADY REACHED");
    }
    }
    
    /**
     *
     * @return
     */
    public Integer getSerialNumber() {
        if (isOn){
        return serialNumber;
    } else return null;
    }
      
    /**
     *
     * @return
     */
    public String viewItems(){
        if (isOn){
        return ("There are currently " + itemQuant + " items in"
                + " the machine, costing £" + itemCost);
    }
        else{
            return null;
        }
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        if (isOn){
        return (serialNumber + "                " 
                + itemName + "                " 
                + itemQuant + "      " + 
                "£" + itemCost);
    
} else return null;    
}
}
