package programmer.zaman.now.application;

import programmer.zaman.now.Util.ValidationUtil;
import programmer.zaman.now.data.CreateUserRequest;

public class ReflectionApp {

    public static void main(String[] args) {

        CreateUserRequest request = new CreateUserRequest();
        ValidationUtil.validateReflection(request);
    }
}
