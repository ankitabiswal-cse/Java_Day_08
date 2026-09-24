class Electric{
    String customerName;
    double billCalculation;
    int electricUnits;

    Electric(String name,double calculation,int units){
        customerName = name;
        billCalculation = calculation;
        electricUnits = units;
    }
    void display(){
        System.out.println("Customer Name :"+customerName);
        System.out.println("Bill Calculation :"+billCalculation);
        System.out.println("Electric Units :"+electricUnits);
    }
}
public class ElectricBill {
    public static void main(String[] args){
        Electric e1 = new Electric("Ankita Biswal",800,90);

        e1.display();
    }
}
