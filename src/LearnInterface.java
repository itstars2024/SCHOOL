interface InterfaceExample

{

    public void cycle(int r);      // abstract method

    default void show()   {        // default method

        System.out.println("Default  InterfaceExample Method Executed");

    }

}

interface LearnInterface

{

    public void square(int a);      // abstract method

    default void show()   {        // default method

        System.out.println("Default LearnInterface Method Executed");

    }

}

 class DefaultExample implements InterfaceExample, LearnInterface

{
    //Implementation of the cycle method
    public void cycle(int r) {
        System.out.println("Area of a cycle is " + 3.14 * r * r);
        LearnInterface.super.show();
    }

// implementation of square abstract method

    public void square(int a)

    {

        System.out.println(a*a);

    }

    @Override
    public void show() {
        InterfaceExample.super.show();

    }

    public static void main(String[] args)

{

    DefaultExample d = new DefaultExample();

    d.square(4);
    d.cycle(7);

// default method executed

d.show();

}

}
