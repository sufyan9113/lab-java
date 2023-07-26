
class Gener<T>
{
    T obj;

    Gener(T obj)
    {
        this.obj=obj;
    }

    public void show()
    {
        System.out.println("the data type is : "+ obj.getClass().getName());
    }

    public T getObj()
    {
        return obj;
    }
}

class UserGenerics
{
    public static void main(String[] args)
    {
        Gener<String> g1= new Gener<String>("sufyan");

        System.out.println(g1.getObj());

        g1.show();

        Gener<Integer> g2= new Gener<Integer>(18);

        System.out.println(g2.getObj());

        g2.show();
    }
}