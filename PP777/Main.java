import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while(true){
            System.out.println("1.Login ");
            System.out.println("2..Regisation");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if (choice == 1) {
                login();
                break;
            }
            else if(choice==2)
            {
                Regisation r1 = new Regisation();
                r1.reg();
                break;
            }
            else {
                System.out.println("invalid choice");
            }
        }
    }
    public static void login() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter the username :");
            String username = sc.nextLine();
            System.out.println("Enter the password :");
            String password = sc.nextLine();
            if (username.equals("kowshik") && password.equals("777")) {
                System.out.println("!!!(login successful)!!!");
                menu();
                break;
            }
        }
    }
    public static void menu() {
        while (true) {
            System.out.println("\t\t\t\t\t\t\t\t\t $$The menu of this system$$ ");
            System.out.println("\t\t\t\t\t\t\t\t\t Press 1 for View Toll List ");
            System.out.println("\t\t\t\t\t\t\t\t\t Press 2 for Toll Entry");
            System.out.println("\t\t\t\t\t\t\t\t\t press 3 for exit.....");
            System.out.println("\t\t\t\t\t\t\t\t\t Enter your choice? ");
            Scanner pc = new Scanner(System.in);
            int j = pc.nextInt();
               if(j==1) {
                   Calculation c1 = new Calculation();
                   c1.viewtolllist();
               }
            else if (j == 2) {
                Calculation c2 = new Calculation();
                c2.calculate();
                Scanner scanner = new Scanner(System.in);
                Variable v1 = new Variable();
                VaricalesCalculation vc = new VaricalesCalculation();
                int total = 0;
                while (true) {
                    System.out.println("Enter the choice of varicales:");
                    int choice = scanner.nextInt();
                    if (choice == 0) break;
                    switch (choice) {
                        case 1: {
                            v1.setMotorcycle(100);
                            vc.m = vc.m + 1;
                            v1.mtk = v1.mtk + v1.getMotorcycle();
                            total = total + v1.getMotorcycle();
                            break;
                        }
                        case 2: {
                            vc.c = vc.c + 1;
                            v1.ctk = v1.ctk + v1.Car;
                            total = total + v1.Car;
                            break;
                        }
                        case 3: {
                            vc.p = vc.p + 1;
                            v1.ptk = v1.ptk + v1.Pickup;
                            total = total + v1.Pickup;
                            break;
                        }
                        case 4: {
                            vc.mi = vc.mi + 1;
                            v1.mitk = v1.mitk + v1.Mediumbus;
                            total = total + v1.Microbus;
                            break;
                        }
                        case 5: {
                            vc.mb = vc.mb + 1;
                            v1.mbtk = v1.mbtk + v1.Minibus;
                            total = total + v1.Minibus;
                            break;
                        }
                        case 6: {
                            vc.mdb = vc.mdb + 1;
                            v1.mdbtk = v1.mdbtk + v1.Mediumbus;
                            total = total + v1.Mediumbus;
                            break;
                        }
                        case 7: {
                            vc.bb = vc.bb + 1;
                            v1.bbtk = v1.bbtk + v1.Bigbus;
                            total = total + v1.Bigbus;
                            break;
                        }
                        case 8: {
                            vc.tf = vc.tf + 1;
                            v1.tftk = v1.tftk + v1.TruckFivetonnes;
                            total = total + v1.TruckFivetonnes;
                            break;
                        }
                        case 9: {
                            vc.te = vc.te + 1;
                            v1.tetk = v1.tetk + v1.TruckEighttonnes;
                            total = total + v1.TruckEighttonnes;
                            break;
                        }
                        case 10: {
                            vc.ttx = vc.ttx + 1;
                            v1.ttxtk = v1.ttxtk + v1.Truck3axle;
                            total = total + v1.Truck3axle;
                            break;
                        }
                        case 11: {
                            vc.taf = vc.taf + 1;
                            v1.taftk = v1.taftk + v1.Trailer4axle;
                            total = total + v1.Trailer4axle;
                            break;
                        }
                    }
                }

                vc.calculate();

                v1.SingleCalulate();

                System.out.println("\t\t\t\t\t\t\t\t\t (The total amount of money)= " + total+ " Tk");
            }
            else if (j==3)
                break;
        }

    }
}