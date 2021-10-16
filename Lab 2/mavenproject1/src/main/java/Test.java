public class Test {
    public static void main(String[] args) {
       VendingMachine vendingMachines[] = new VendingMachine[4];
       vendingMachines[0] = new VendingMachine("Chips",9,5,10);
       vendingMachines[1] = new VendingMachine("Drinks",7,3,8);
       vendingMachines[2] = new VendingMachine("Cookies",2,1,9);
       vendingMachines[3] = new VendingMachine("Chips",9,5,10);
       
      System.out.println("Vending-Machine     Item-name     Quantity     Cost");
      System.out.println(vendingMachines[0].toString());
      System.out.println(vendingMachines[1].toString());
      System.out.println(vendingMachines[2].toString());
      System.out.println(vendingMachines[3].toString());
    }
} 
