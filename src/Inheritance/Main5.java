package Inheritance;

public class Main5 {
    public static  void main(String[] args) {
        GetterAndSetter file = new GetterAndSetter(false, false);

        System.out.println("Initial File Status:");
        file.displayStatus();

        System.out.println("\nMaking file Read-Only:");
        file.makeReadOnly();
        file.displayStatus();

        System.out.println("\nMaking file Write-Only:");
        file.makeWriteOnly();
        file.displayStatus();

        System.out.println("\nMaking file Read and Write:");
        file.makeReadWrite();
        file.displayStatus();
    }
}
