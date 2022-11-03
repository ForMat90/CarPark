import java.util.Scanner;

public class Garage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String brand;
        int year;
        int displacement; // cilindrata
        int carDoors;
        String powerSupply; // diesel o benzina
        int stroke; // 2, 4 tempi
        int capacity;
        char vehicle;
        int id = 0;
        int index = 0;
        MotorVehicle Id[] = new MotorVehicle[15];

        do {
            System.out.print("Seleziona un tipo di veicolo da inserire nel nuovissimo parco auto, digita:\na per Auto, m per Moto, f per Furgone:\n");
            vehicle = scanner.next().charAt(0);
            System.out.print("Che marca è?:\n");
            brand = scanner.next();
            System.out.print("Di che anno è?:\n");
            year = scanner.nextInt();
            System.out.print("Di che cilindrata è:\n");
            displacement = scanner.nextInt();

            switch(vehicle) {
                case 'a': { // Car
                    System.out.print("Quante porte ha la tua macchina?:\n");
                    carDoors = scanner.nextInt();
                    System.out.print("E' a diesel o benzina?:\n");
                    powerSupply = scanner.next();
                    Car a = new Car(id, brand, year, displacement, carDoors ,powerSupply);
                    Id[id] = a;
                }
                break;
                case 'f': {
                    System.out.print("Che portata ha il furgone?:\n");
                    capacity = scanner.nextInt();
                    Van van = new Van(id, brand, year, displacement, capacity);
                    Id[id] = van;
                }
                break;
                case 'm': {
                    System.out.print("2 o 4 tempi? (inserisci solo il numero:\n");
                    stroke = scanner.nextInt();
                    Motorcycle motorcycle = new Motorcycle(id, brand, year, displacement, stroke);
                    Id[id] = motorcycle;
                }
                break;

                default: System.out.println("Ma cosa hai digitato??? Inserisci i dati corretti!\n");
            }
            id++;

            for(index = 0; index < id; index++)
                System.out.println(Id[index]);
                System.out.print("Vuoi inserire altri veicoli? (s/n):\n");
                vehicle = scanner.next().charAt(0);

        }while(vehicle == 's' && id < 15);

        System.out.print("Vuoi cercare il tuo mezzo tramite numero id? Ora puoi! Scrivi il numero e il gioco è fatto!:\n");
        index = scanner.nextInt();

        if(index < id && index >= 0) {
            System.out.println(Id[index]);
        } else {
            System.out.println("Devi inserire un numero Id per poter trovare il mezzo inserito!\n");
        }
    }
}


