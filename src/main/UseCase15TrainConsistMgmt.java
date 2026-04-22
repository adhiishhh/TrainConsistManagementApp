package main;
import java.util.*;

public class UseCase15TrainConsistMgmt {

    // ✅ Custom Exception
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // ✅ Goods Bogie Class
    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        void assignCargo(String cargo) {
            try {
                // ❌ Unsafe condition
                if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                    throw new CargoSafetyException("Petroleum not allowed in Rectangular bogie");
                }

                // ✅ Safe
                this.cargo = cargo;
                System.out.println("Cargo assigned: " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Assignment attempt completed");
            }
        }
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Rectangular");
        b1.assignCargo("Petroleum");   // ❌ should throw error

        System.out.println();

        GoodsBogie b2 = new GoodsBogie("Cylindrical");
        b2.assignCargo("Petroleum");   // ✅ safe
    }
}