class Movie{
    String movieName;
    int seatNumber;
    double ticketPrice;

    Movie(String name,int number, double price){
        movieName = name;
        seatNumber = number;
        ticketPrice = price;
    }
    void display(){
        System.out.println("Movie Name ="+movieName);
        System.out.println("Seat Number ="+seatNumber);
        System.out.println("Ticket Price ="+ticketPrice);
    }
}
public class MovieTicket {
    public static void main(String[] args){
        Movie m1 = new Movie("Spider Man 2",25,350);
        m1.display();
    }
}
