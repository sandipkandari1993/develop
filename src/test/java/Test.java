public class Test {

    TestFlip obj1;

    public static  void  main(String a[])
    {
        System.out.print("commiting git changes");
        Test t= new Test();
        t.validatetest();
    }

    public void validatetest()
    {
        obj1= new TestFlip();
        obj1.testLogin("sandip","admin");
    }
}
