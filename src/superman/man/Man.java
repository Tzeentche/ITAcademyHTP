package superman.man;

public class Man {

    boolean isAlive = true;
    char gender = '\u047D';
    byte age = 33;
    int hairLength;
    short maxSpeed = -32768;

    short test1 = 0b00000000_00000000;
    short test2 = (short)0b10000000_00000000;
    short test3 = 0b00000000_00000001;

    void grow() {
        hairLength += 1;
    }

    public static void main(String[] args) {

        Man manObject = new Man();

        manObject.grow();

        System.out.println("1 manObject.hairLength = " + manObject.hairLength);
        System.out.println(manObject.isAlive);
        System.out.println("\"" + manObject.gender + "\"");
        manObject.age = (byte)(manObject.age + 1);
        System.out.println("Superman is " + manObject.age + " years old.");
        System.out.println((short)(manObject.maxSpeed + 2));
        System.out.println(Integer.toBinaryString(manObject.maxSpeed * 1000));
        System.out.println(manObject.test1);
        System.out.println(manObject.test2);
        System.out.println(manObject.test3);
    }
}
