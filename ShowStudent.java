class ShowStudent {
public static void main (String args[])
{
Student s1=new Student();

s1.setHours(Integer.parseInt(args[0]));
s1.setIDnumber();
s1.setPoints(Integer.parseInt(args[1]));
s1.showIDnumber();
s1.showCredits();
s1.showPoints();
System.out.println("The student's grade point average is "+ s1.getGradePoint());
System.out.println(" ");
 
Student s2=new Student();
s2.setHours(Integer.parseInt(args[2]));
s2.setIDnumber();
s2.setPoints(Integer.parseInt(args[3]));
s2.showIDnumber();
s2.showCredits();
s2.showPoints();
System.out.println("The student's grade point average is "+ s2.getGradePoint());
System.out.println(" ");
 
Student s3=new Student();
s3.setHours(Integer.parseInt(args[4]));
s3.setIDnumber();
s3.setPoints(Integer.parseInt(args[5]));
s3.showIDnumber();
s3.showCredits();
s3.showPoints();

System.out.println("The student's grade point average is "+ s3.getGradePoint());
System.out.println(" ");

private void setIDnumber()
{
StudentID += 1;
IDnumber=StudentID;
}
 
private int getIDnumber()
{
return IDnumber;
}
 
private void setCredits(int Number)
{
hours = Number;
}
 
private int getCredits()
{
return Credits;
}
 
private void setPoints(int Number)
{
points = Number;
}
 
private int getPoints()
{
return Points;
}
}
}