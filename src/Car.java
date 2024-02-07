public class Car {
    private int maxSpeed;
    private String name;
    private int yearOfMake;

    public Car(int MaxSpeed, String Name, int YearOfMake) {
        this.maxSpeed = MaxSpeed;
        this.name = Name;
        this.yearOfMake = YearOfMake;
    }
    public void CarName()
    {
        System.out.println("Your car name is"+ name);
    }
    public void CarMaxSpeed()
    {
        System.out.println("Your car Maximum Speed is"+ maxSpeed);
    }
    public void CarYear()
    {
        System.out.println("Your car name is"+ yearOfMake);
    }
}
