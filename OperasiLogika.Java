import java.util.Scanner;

class OperatorLogika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("\nPilih operasi logika:");
            System.out.println("=========================");
            System.out.println("1. OR");
            System.out.println("2. XOR");
            System.out.println("3. NOT");
            System.out.print("Masukkan pilihan (1/2/3): ");
            
            int pilihan = scanner.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.println("Operasi OR");
                    System.out.println("true || true   = " + (true || true));
                    System.out.println("true || false  = " + (true || false));
                    System.out.println("false || true  = " + (false || true));
                    System.out.println("false || false = " + (false || false));
                    break;
                case 2:
                    System.out.println("Operasi XOR");
                    System.out.println("true ^ true   = " + (true ^ true));
                    System.out.println("true ^ false  = " + (true ^ false));
                    System.out.println("false ^ true  = " + (false ^ true));
                    System.out.println("false ^ false = " + (false ^ false));
                    break;
                case 3:
                    System.out.println("Operasi NOT");
                    System.out.println("!true  = " + (!true));
                    System.out.println("!false = " + (!false));
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
            
            System.out.print("\nApakah Anda ingin melakukan operasi lain? (y/n): ");
            String jawaban = scanner.next().toLowerCase();
            lanjut = jawaban.equals("y") || jawaban.equals("yes");
        }
        
        System.out.println("Terima kasih telah menggunakan aplikasi ini.");
        scanner.close();
    }
}