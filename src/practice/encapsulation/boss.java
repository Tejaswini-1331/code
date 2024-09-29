package practice.encapsulation;

public class boss {



    int sal;
    boss(int sal){
        this.sal=sal;
    }
  public String toString() {
      return "empsal " + sal;
  }

   public boolean equals(Object ob){
        return this.sal == ((boss)ob).sal;
   }

   public int hashCode(){
        return 1234;
   }

}
