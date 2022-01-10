package me.seno.designpatterns._01_singleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        Settings settings = Settings.getInstance();

        /* 리플렉션 기법 */
//        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Settings settings1 = constructor.newInstance();
//
//        System.out.println(settings == settings1);

        /* 직렬화 역직렬화 사용 */
//        Settings settings1 = null;
//
//        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
//            out.writeObject(settings);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
//            settings1 = (Settings) in.readObject();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(settings == settings1);

        EnumSettings settings = EnumSettings.INSTANCE;
        EnumSettings settings1 = null;

        /* 리플렉션 기법으로 인스턴스 생성 시도 시 enum은 리플렉션 Cannot reflectively create enum objects 에러를 뱉는다. */
//        Constructor<?>[] constructors = EnumSettings.class.getDeclaredConstructors();
//        for (Constructor<?> constructor : constructors) {
//            constructor.setAccessible(true);
//            settings1 = (EnumSettings) constructor.newInstance("INSTANCE");
//        }

//        System.out.println(settings == settings1);


        /* serializable 방식으로도 enum 인스턴스 생성이 불가하다. */
        EnumSettings serializableSettings = null;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            serializableSettings = (EnumSettings) in.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(settings == serializableSettings);
    }
}
