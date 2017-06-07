//*********************************************************
//I pledge my Honor that I have not cheated, and will not cheat, on this assignment. Steven Faulkner  
//Dog.java       
//
// This class contains data and methods related to the
// names and ages of dogs.
//*********************************************************
import java.util.Scanner;

public class DogVer2
{
   // declare variables to store the name/age of the dog
   // Tip: This should be private!
   private int dogAge;
   private String name;
   private int personYears;
   private static int count = 0;
   //Methods are below. They should be public

  
   //------------------------------------------------------
   // Constructor: Sets up Dog object with specified data.
   //------------------------------------------------------
   public DogVer2(String Name, int age)  // Complete constructor header 
      {
         name = Name;
         dogAge = age; 
         count++; 
      }
   
   //------------------------------------------------------
   // Name accessor � declare getName here
   //------------------------------------------------------
   public String getName()
      {
         return name;
      }
   //------------------------------------------------------
   // Name mutator � declare setName here
   //------------------------------------------------------
   public void setName(String Name)
      {
         name = Name;
        
   
      }
   //------------------------------------------------------
   // Age accessor � declare getAge here
   //------------------------------------------------------
   public int getAge()
      {
         return dogAge;
      }

   //------------------------------------------------------
   // Age mutator � declare setAge here
   //------------------------------------------------------
   public void setAge(int age)
      {
         dogAge = age;
      }
     
  
   // Computes & returns this dog's age in "person-years".
   //------------------------------------------------------
   public int getpersonYears()
      {
         
         return getAge() * 7;
      }
      
   public static int getCount()
      {
         return count;
      
      }
  
   // Returns a string representation of this dog.
   //------------------------------------------------------
   public String toString()
      {
      
         return getName() +"\t" +"Age: " +getAge() +"\t" +"Person-Years: " +getpersonYears(); 
   
      }
}