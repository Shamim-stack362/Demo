public class Calculate {
    private String name;
    private String fatherName;
    private String motherName;
    private int rollNo;
    private int age;

    public void setName(String name){
        this.name = name;

    }

    public void setfatherName(String fatherName){
        this.fatherName = fatherName;
    }
    public void setmotherName(String motherName){
        this.motherName = motherName;
    }
    public void setrollNo(int rollNo){
        this.rollNo=rollNo;
    }
   public String getName(){
        return name;
   }
    public String getfatherName(){
        return fatherName ;
    }
    public String getmotherName(){
        return motherName;
    }
    public int getrollNo(){
        return rollNo;
    }

public static void main(String[] args){
        Calculate cal = new Calculate();
    cal.setName("sabbir ali");
    cal.setfatherName("shams bin sabbir");
    cal.setmotherName("tiya");
    cal.setrollNo(101);

    System.out.println( cal.getName());
    System.out.println(cal.getfatherName());
    System.out.println(cal.getmotherName());
    System.out.println(cal.getrollNo());


}
}
