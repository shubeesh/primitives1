import com.sun.source.doctree.SystemPropertyTree;

public class primitives {

    public static void main(String[] args) {
        //Integer Types

        Integer myInt = 7;      //32-bit integer or an 4 byte integer. 2 ^ 32 different values.
        System.out.println(myInt);
        Short myShort = 8;      //16-bit integer or an 2 byte integer. 2 ^ 16 different values.
        System.out.println(myShort);
        Byte myByte = 9;        //8-bit integer     2^8 = 256 values.    -128 <-> 127
        System.out.println(myByte);
        Long myLong = 6386423529580L;

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE + 1);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MIN_VALUE);

        String myString = " Hello World";

        char myChar = 'a';

        boolean myBoolean = true;   // 8 bits
        boolean myBoolean2 = false;
    }

}
