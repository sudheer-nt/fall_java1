package methodoverloading;

class Display {
    int add(int a, int b)
    {
        int sum = a+b;
        return sum;
    }
    float add(int a, int b, float  c)
    {
     float sum = a+b+c;
        return sum ;
    }
}
class Example
{
    public static void main(String args[])
    {
        Display obj = new Display();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30.0F));
    }
}
