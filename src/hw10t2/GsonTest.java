package hw10t2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class GsonTest {
    public static void main(String[] args) {
        UserDto userDto = new UserDto();
        userDto.setName("alice");
        userDto.setAge(21);
        UserDto userDto1 = new UserDto();
        userDto1.setName("ryan");
        userDto1.setAge(30);

        List<UserDto> users = List.of(userDto,userDto1);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String gs = gson.toJson(users);
        System.out.println(gs);

    }
}
