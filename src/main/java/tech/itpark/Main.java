package tech.itpark;

public class Main {
    public static void main(String[] args) {

        Flat flat1 = new Flat();

        flat1.rooms = 1;
        System.out.println(flat1.rooms);
        flat1.area = 31.2;
        System.out.println(flat1.area);
        flat1.storey = 9;
        System.out.println(flat1.storey);
        flat1.storeyInHouse = 19;
        System.out.println(flat1.storeyInHouse);
        flat1.price = 4_046_000;
        System.out.println(flat1.price);
        flat1.complex = "ЖК Станция Спортивная";
        System.out.println(flat1.complex);
        flat1.address = "пр-т Детский, д. 1.2, район Приволжский";
        System.out.println(flat1.address);
        flat1.seller = "Агентство";
        System.out.println(flat1.seller);
        flat1.created = 1615362721;
        System.out.println(flat1.created);

        Flat flat2 = new Flat();

        flat2.rooms = 1;
        System.out.println(flat2.rooms);
        flat2.area = 33;
        System.out.println(flat2.area);
        flat2.storey = 17;
        System.out.println(flat2.storey);
        flat2.storeyInHouse = 19;
        System.out.println(flat2.storeyInHouse);
        flat2.price = 4_350_000;
        System.out.println(flat2.price);
        flat2.complex = "ЖК Казань XXI век";
        System.out.println(flat2.complex);
        flat2.address = "пр-т Альберта Камалиева, д. 32Б";
        System.out.println(flat2.address);
        flat2.metro = "Горки";
        System.out.println(flat2.metro);
        flat2.distanceToMetro = 2.5;
        System.out.println(flat2.distanceToMetro);
        flat2.seller = "Агентство недвижимости Ключ";
        System.out.println(flat2.seller);
        flat2.created = 1615354201;
        System.out.println(flat2.created);

        Flat flat3 = new Flat();

        flat3.rooms = 3;
        System.out.println(flat3.rooms);
        flat3.area = 132.1;
        System.out.println(flat3.area);
        flat3.storey = 4;
        System.out.println(flat3.storey);
        flat3.storeyInHouse = 5;
        System.out.println(flat3.storeyInHouse);
        flat3.price = 21_150_000;
        System.out.println(flat3.price);
        flat3.check = "Проверенно в ЕГРН";
        System.out.println(flat3.check);
        flat3.address = "ул. Карла Маркса, 39А";
        System.out.println(flat3.address);
        flat3.metro = "Площадь Тукая";
        System.out.println(flat3.metro);
        flat3.distanceToMetro = 1.1;
        System.out.println(flat3.distanceToMetro);
        flat3.seller = "Агентство недвижимости Ключ";
        System.out.println(flat3.seller);
        flat3.created = 1615350601;
        System.out.println(flat3.created);

    }
}
