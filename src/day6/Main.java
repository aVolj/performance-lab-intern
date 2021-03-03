package day6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * todo Document type Main
 */
public class Main {
    public static void main(String[] args) {
        Vault federalVault = new Vault();
        Field[] fields = federalVault.getClass().getDeclaredFields();

        System.out.println("федералы до");
        printInfo(federalVault);
        List<Object> arrValue = new ArrayList<>();
        for (Field fieldsValues : fields) {
            try {
                fieldsValues.setAccessible(true);
                arrValue.add(fieldsValues.get(federalVault));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        try {
            Constructor constructor1 = federalVault.getClass().getDeclaredConstructor(int.class, int.class,
                double.class, String.class);
            constructor1.setAccessible(true);
            Vault myVault = (Vault) constructor1.newInstance(arrValue.get(0), arrValue.get(1),
                arrValue.get(2), arrValue.get(3));

            System.out.println("мы после");
            printInfo(myVault);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        for (Field element : fields) {
            try {
                element.setAccessible(true);
                if (element.getType() == String.class) {
                    element.set(federalVault, "");
                } else {
                    element.set(federalVault, 0);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        System.out.println("федералы после");
        printInfo(federalVault);



        //access to private constructor
        try {
            Constructor constructor = federalVault.getClass().getDeclaredConstructor(
                int.class, int.class, double.class, String.class);

            constructor.setAccessible(true);
            Vault myVault1 = (Vault) constructor.newInstance(1000_000, 0, 0, "");
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        //access to private method
        try {
            Method method = federalVault.getClass().getDeclaredMethod("setDollars", int.class);
            method.setAccessible(true);
            method.invoke(federalVault, 11);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void printInfo(Vault federalVault) {
        //got access to private variable
        try {
            Field[] field = federalVault.getClass().getDeclaredFields();
            for (Field f : field) {
                f.setAccessible(true);

                System.out.println(f.get(federalVault));
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
