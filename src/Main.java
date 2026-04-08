import javax.swing.*;
import javax.swing.JOptionPane;

public class Main {

        public static void main(String[] args) {

            // ===== CREAR CLIENTE =====
            Cliente cliente = new Cliente();
            cliente.setIdentificacion(JOptionPane.showInputDialog("Ingrese tu ID:"));
            cliente.setNombres(JOptionPane.showInputDialog("Ingresa tu nombre:"));
            cliente.setApellidos(JOptionPane.showInputDialog("Ingrese tu apellido:"));

            // ===== CREAR CUENTA =====
            Cuenta cuenta = new Cuenta();
            cuenta.setNumeroCuenta(JOptionPane.showInputDialog("Ingresa tu número de cuenta:"));

            double saldoInicial = Double.parseDouble(
                    JOptionPane.showInputDialog("Ingrese saldo inicial:")
            );

            // Validación de saldo inicial
            if (saldoInicial < 0) {
                JOptionPane.showMessageDialog(null, "El saldo no puede ser negativo. Se asignará 0.");
                saldoInicial = 0;
            }

            cuenta.setSaldo(saldoInicial);

            // ===== MENÚ =====
            int opcion;

            do {
                String menu = """
                    CAJERO AUTOMÁTICO

                    1. Consultar saldo
                    2. Depositar dinero
                    3. Retirar dinero
                    4. Mostrar datos
                    5. Salir
                    """;

                opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

                switch (opcion) {

                    case 1:
                        JOptionPane.showMessageDialog(null,
                                "Saldo actual: $" + cuenta.getSaldo());
                        break;

                    case 2:
                        double deposito = Double.parseDouble(
                                JOptionPane.showInputDialog("Ingrese monto a depositar:")
                        );

                        if (deposito > 0) {
                            cuenta.setSaldo(cuenta.getSaldo() + deposito);
                            JOptionPane.showMessageDialog(null, "Depósito exitoso");
                        } else {
                            JOptionPane.showMessageDialog(null, "Monto inválido");
                        }
                        break;

                    case 3:
                        double retiro = Double.parseDouble(
                                JOptionPane.showInputDialog("Ingrese monto a retirar:")
                        );

                        if (retiro > 0 && retiro <= cuenta.getSaldo()) {
                            cuenta.setSaldo(cuenta.getSaldo() - retiro);
                            JOptionPane.showMessageDialog(null, "Retiro exitoso");
                        } else {
                            JOptionPane.showMessageDialog(null, "Fondos insuficientes o monto inválido");
                        }
                        break;

                    case 4:
                        JOptionPane.showMessageDialog(null,
                                "=== DATOS ===\n" +
                                        "Cliente: " + cliente.getNombres() + " " + cliente.getApellidos() +
                                        "\nID: " + cliente.getIdentificacion() +
                                        "\nCuenta: " + cuenta.getNumeroCuenta() +
                                        "\nSaldo: $" + cuenta.getSaldo());
                        break;

                    case 5:
                        JOptionPane.showMessageDialog(null, "Gracias por usar el sistema");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida");
                }

            } while (opcion != 5);
        }
    }

