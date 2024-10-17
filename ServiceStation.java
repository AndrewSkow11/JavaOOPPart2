public class ServiceStation implements ServiceStationInterface {

    @Override
    public void check(Car car) {
        System.out.println("\nОбслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            car.updateTyre();
        }
        car.checkEngine();
    }

    @Override
    public void check(Truck truck) {
        System.out.println("\nОбслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();
    }

    @Override
    public void check(Bicycle bicycle) {
        System.out.println("\nОбслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
        }
    }
}