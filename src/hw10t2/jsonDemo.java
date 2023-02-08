package hw10t2;

import java.io.*;

public class jsonDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        UserDto user = new UserDto();
//        user.setName("alice");
//        user.setAge(21);
//        user.setName("ryan");
//        user.setAge(30);
//
//        OutputStream fds = new FileOutputStream("user.bin");
//        ObjectOutputStream oos = new ObjectOutputStream(fds);
//        oos.writeObject(user);

InputStream fas = new FileInputStream("user.bin");
ObjectInputStream ois = new ObjectInputStream(fas);
UserDto readUser = (UserDto) ois.readObject();
        System.out.println("readUser = " + readUser);
    }
}
