package programmer.zaman.now.Util;

import programmer.zaman.now.annotation.NotBlank;
import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.BlankException;
import programmer.zaman.now.error.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.getUsername() == null) {
            throw new NullPointerException("username is null");
        } else if (loginRequest.getUsername().isBlank()) {
            throw new ValidationException("username is Blank");
        } else if (loginRequest.getPassword() == null) {
            throw new NullPointerException("password is null");
        } else if (loginRequest.getPassword().isBlank()) {
            throw new ValidationException("password is blank");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest){
        if (loginRequest.getUsername() == null) {
            throw new BlankException("username is null");
        } else if (loginRequest.getUsername().isBlank()) {
            throw new BlankException("username is Blank");
        } else if (loginRequest.getPassword() == null) {
            throw new BlankException("password is null");
        } else if (loginRequest.getPassword().isBlank()) {
            throw new BlankException("password is blank");
        }
    }

    public static void validateReflection(Object o) {
        Class aClass = o.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields) {
            field.setAccessible(true);

            if (field.getAnnotation(NotBlank.class) != null) {
                try {

                    String value = (String) field.get(o);
                    if (value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + "is blank");
                    }
                } catch (IllegalAccessException e) {
                    System.out.println("tidak dapat akses");
                }

            }
        }
    }
}
