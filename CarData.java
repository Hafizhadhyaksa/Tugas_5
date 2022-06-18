package Tugas_5;

import java.util.ArrayList;

public class CarData {

    private ArrayList<Car> carList = new ArrayList<Car>();

    public void addCar(String carType, String polNum, String merk){

        Car rent = new Car(carType, polNum, merk, true);

        carList.add(rent);
    }

    public void listOfCar(){
        System.out.println("===================================");
        System.out.println("            DAFTAR MOBIL");
        System.out.println("===================================");

        for(Car mobil : carList){
            System.out.println("Tipe Mobil  :"+mobil.getCarType());
            System.out.println("No. Polisi  :"+mobil.getPolNum());
            System.out.println("Merk        :"+mobil.getMerk());
            System.out.println("===================================");
        }
    }

    public ArrayList<Car> getCarList(){
        return carList;
    }

}
