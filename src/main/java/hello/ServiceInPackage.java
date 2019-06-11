package hello;

import org.springframework.stereotype.Controller;

@Controller
public class ServiceInPackage {

    private static final String CLASS = "class";

    public void methodRevision1() {
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
    }

    public void methodRevision3() {
        System.out.println("3");
    }
}

