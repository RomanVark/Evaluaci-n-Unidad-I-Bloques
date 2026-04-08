public class Main {
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            Cuenta cuenta = new Cuenta();
            cuenta.setNumeroCuenta("12345");
            cuenta.setSaldo(0);

            int opcion;

            do {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Depositar");
                System.out.println("3. Retirar");
                System.out.println("4. Salir");
                System.out.print("Opcion: ");

                opcion = sc.nextInt();

                switch (opcion) {

                    case 1:
                        System.out.println("Saldo: " + cuenta.consultarSaldo());
                        break;

                    case 2:
                        System.out.print("Monto a depositar: ");
                        double dep = sc.nextDouble();
                        cuenta.depositar(dep);
                        break;

                    case 3:
                        System.out.print("Monto a retirar: ");
                        double ret = sc.nextDouble();
                        cuenta.retirar(ret);
                        break;

                    case 4:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción inválida");
                }

            } while (opcion != 4);

            sc.close();
        }
    }
}
