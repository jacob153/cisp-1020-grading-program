public class GradeAverage {
    int counter=Grades.size();
System.out.println("Counter: " + counter);

final double ArrayAdded = Grades.stream()
    .mapToDouble(a -> a)
    .sum();
    System.out.println("Grade Average: " + ArrayAdded);
}
