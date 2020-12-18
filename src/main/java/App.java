import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        System.out.println(bean == bean1);

        Cat cat_bean_1 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat_bean_1.getName() + " " + cat_bean_1.getAge());

        Cat cat_bean_2 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat_bean_2.getName() + " " + cat_bean_1.getAge());

        System.out.println(cat_bean_1 == cat_bean_2);
    }
}