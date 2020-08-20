package examples;


import java.lang.reflect.*;

public class LearnReflection {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

        Method[] methods = LearnReflection.class.getMethods();

        for(Method method : methods){
            System.out.println("method = " + method.getName());
        }

        Class<?> obj = Class.forName("basic_examples.LearnReflection");
        Object learningReflection = obj.newInstance();
        String daName = "hello";
        Method method = learningReflection.getClass().getMethod(daName, String.class, int.class);
        method.invoke(learningReflection, "Guy",40);

    }

    public void hello(String sup, int a){
        System.out.println("Have a great day " + sup + " number " + a);
    }


}
