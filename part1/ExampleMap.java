import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class ExampleMap
{
   public static List<String> highEnrollmentStudents(
      Map<String, List<Course>> courseListsByStudentName, int unitThreshold)
   {
      List<String> overEnrolledStudents = new LinkedList<>();

      /*
         Build a list of the names of students currently enrolled
         in a number of units strictly greater than the unitThreshold.
      */
      for(String key: courseListsByStudentName.keySet()){
          int totalUnits = 0;
          for(Course course: courseListsByStudentName.get(key)){
              totalUnits += course.getNumUnits();
          }
          if(totalUnits > unitThreshold){
              overEnrolledStudents.add(key);
           }
      }
      return overEnrolledStudents;      
   }
}
