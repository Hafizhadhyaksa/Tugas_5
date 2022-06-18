package Tugas_5;

import java.util.ArrayList;

public class RentArchive {

    private ArrayList<CarRent> rentData = new ArrayList<CarRent>();

    public void info(){
        System.out.println("===================================");
        System.out.println("        INFORMASI PELANGGAN");
        System.out.println("===================================");

        for(CarRent rentCar : rentData){
            System.out.println("Nama Peminjam   :"+ rentCar.getRider().getName());
            System.out.println("Tipe Mobil      :"+ rentCar.getCar().getCarType());
            System.out.println("No. Polisi      :"+ rentCar.getCar().getPolNum());
            System.out.println("Durasi Rental   :"+ rentCar.getRentDuration() + " Jam");
            System.out.println("===================================");
        }
    }

    public void Rent(CarRider rider, Car car, int rentDuration){

        CarRent cRent = new CarRent(rider, car, rentDuration);

         if (car.isStatus() == true){
            System.out.println("MOBIL BERHASIL DISEWA");
            car.setStatus(String.valueOf(false));
            rentData.add(new CarRent(rider, car, rentDuration));
        }else {
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
        }
    }

}
