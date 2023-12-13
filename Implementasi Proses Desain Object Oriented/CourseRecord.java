import java.util.Enumeration; 
import java.util.Vector;
    public class CourseRecord { 
        private Student student;
        private Vector<Assignment> assignments; 
        private boolean takingFinalExam;
        public CourseRecord(Student student) { 
            this.student = student;
            this.assignments = new Vector<Assignment>(); 
            this.takingFinalExam = false;
        }
    public Student getStudent() { 
        return this.student;
    }
    public void setStudent(Student student) { 
        this.student = student;
    }
    public void addAssignment(Assignment assignment) { 
        this.assignments.add(assignment);
    }
    public Enumeration<Assignment> getAssignment() { 
        return this.assignments.elements();
    }
    public double average() { 
        double sum = 0;
        for (Enumeration<Assignment> e = getAssignment(); 
        e.hasMoreElements();) {
            Assignment assignment = e.nextElement(); 
            sum += assignment.getMark();
        }
        return sum / this.assignments.size();
        }
        public boolean canTakeFinalExam() { 
            return average() >= 60;
        }
        public boolean isTakingFinalExam() { 
            return this.takingFinalExam;
        }
        public void setTakingFinalExam(boolean takingFinalExam) { 
            this.takingFinalExam = takingFinalExam;
        }
    }