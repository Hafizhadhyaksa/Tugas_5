package Tugas_5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nama    : Muhammad Hafizh Adhyaksa");
        System.out.println("NIM     : 215150707111019");


        CarData tambah = new CarData();
        tambah.addCar("SUV", "N 1111 AB", "Honda");
        tambah.addCar("SPORT", "N 2222 AB", "SSC Tuatara");
        tambah.addCar("TRUCK", "N 3333 AB", "Suzuki");
        tambah.addCar("JEEP", "N 4444 AB", "Mercedes Benz");

        tambah.listOfCar();
        System.out.println("");

        CarRider Ming = new CarRider("Lin Ming ", 30 , "012312414");
        CarRider Youhan = new CarRider("Bei Youhan", 45, "0862131631");
        CarRider Chi = new CarRider("Shang Chi", 44, "07123617712");
        CarRider Bao = new CarRider("Bao-yu", 19, "07123617235");

        RentArchive rent = new RentArchive();
        rent.Rent(Ming, tambah.getCarList().get(3), 24);
        rent.Rent(Youhan, tambah.getCarList().get(1), 24);
        rent.Rent(Chi, tambah.getCarList().get(1), 168);
        rent.Rent(Bao, tambah.getCarList().get(2), 48);
        System.out.println();
        rent.info();
    }
}
