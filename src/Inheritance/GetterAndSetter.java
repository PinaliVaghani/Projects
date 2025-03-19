package Inheritance;

public class GetterAndSetter {
    private boolean isReadable;
    private boolean isWritable;

    public GetterAndSetter(boolean b, boolean b1) {
    }

    // Constructor
    public void FileDemo(boolean isReadable, boolean isWritable) {
        this.isReadable = isReadable;
        this.isWritable = isWritable;
    }


    // Getter for isReadable
    public boolean isReadable () {
        return isReadable;
    }


    // Setter for isReadable
    public void setReadable(boolean isReadable) {
        this.isReadable = isReadable;
    }

    // Getter for isWritable
    public boolean isWritable() {
        return isWritable;
    }

    // Setter for isWritable
    public void setWritable(boolean isWritable) {
        this.isWritable = isWritable;
    }

    // Method to make the file Read-Only
    public void makeReadOnly() {
        this.isReadable = true;
        this.isWritable = false;
    }

    // Method to make the file Write-Only
    public void makeWriteOnly() {
        this.isReadable = false;
        this.isWritable = true;
    }

    // Method to make the file both Readable and Writable
    public void makeReadWrite() {
        this.isReadable = true;
        this.isWritable = true;
    }

    // Display file status
    public void displayStatus() {
        System.out.println("File Status: ");
        System.out.println("Readable: " + isReadable);
        System.out.println("Writable: " + isWritable);
    }


}


