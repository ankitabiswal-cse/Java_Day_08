class Travel{
    String passengerName;
    String destination;
    double price;

    Travel(String name,String d,double p){
        passengerName = name;
        destination = d;
        price = p;
    }
    void display(){
        System.out.println("Passenger Name:"+passengerName);
        System.out.println("Destination:"+destination);
        System.out.println("Ticket Price:"+price);
    }
}
public class TravelTicket {
    public static void main(String[] args){
        Travel t1 = new Travel("Ankita Biswal","Kedarnath",15000);

        t1.display();
    }
}
