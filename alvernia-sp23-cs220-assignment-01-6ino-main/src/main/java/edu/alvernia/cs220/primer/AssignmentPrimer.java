package edu.alvernia.cs220.primer;

/**
 * Main object which holds the assignmentId, assignmentName, and
 * assignmentSummary.
 */
public class AssignmentPrimer {

    private int assignmentId;
    private String assignmentName;
    private String assignmentSummary;

    public AssignmentPrimer() { }

    public AssignmentPrimer(int assignmentId, String assignmentName) {
        this.assignmentId = assignmentId;
        this.assignmentName = assignmentName;
    }

    public AssignmentPrimer(int assignmentId, String assignmentName, String assignmentSummary) {
        this.assignmentId = assignmentId;
        this.assignmentName = assignmentName;
        this.assignmentSummary = assignmentSummary;
    }

    public String getAssignmentName() {
         return this.assignmentName;
    }

    public int getAssignmentId() {
        return this.assignmentId;
    }

    public String getAssignmentSummary() {
        return this.assignmentSummary;
    }

    @Override
    public String toString() {
        return "Assignment " + this.assignmentId + ": " + this.assignmentName;
    }

}