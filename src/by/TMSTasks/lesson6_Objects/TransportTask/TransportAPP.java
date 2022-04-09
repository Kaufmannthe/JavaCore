package by.TMSTasks.lesson6_Objects.TransportTask;

public class TransportAPP {
    public static void main(String[] args) {
        Ground_Transport passengerCar = new Passenger_Car(150,200, 3, "BMW X3",4,
                5,"в ристайлинге",4);

        Passenger_Car passenger_car1 = new Passenger_Car(150,200,3,"BMW X3",4
        ,5,"в ристайлинге",4);

        Freight_Transport freightTransport = new Freight_Transport(200,70,6,"MAZ",
                4,14,20);

        Civil_Air_Transport civilAirTransport = new Civil_Air_Transport(300,800,10,
                "Boing",50,600,100,true);

        Military_Air_Transport militaryAirTransport = new Military_Air_Transport(500, 900,6,
                "MX10",40,500,false,10);

        Ground_Transport ground_transport [] = {passengerCar};
        for(Ground_Transport ground_transport1 : ground_transport){     //test transportInfo
            ground_transport1.transportInfo();
        }

        System.out.println();
        passenger_car1.fuelScore(150); //test fuelScore

        System.out.println();
        freightTransport.loadCapacityCheck(31);     //test loadCapacityCheck


        System.out.println();
        civilAirTransport.passengerValueCheck(99);         //test passengerValueCheck

        System.out.println();
        militaryAirTransport.rocketValueCheck();            //test rocketValueCheck

        System.out.println();
        militaryAirTransport.catapultSystemCheck();         //test catapultSystemCheck
    }
}
