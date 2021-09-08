class Cals{
    int num1;
    int num2;
    int result;
    public void perform(){
        result=num1+num2;
    }
}


public class Object{
    public static void main(String[] args){
        Cals obj1 = new Cals();
        obj1.num1 =3;
        obj1.num2 =8;
        obj1.perform();
        System.out.println(obj1.result);
    }
}