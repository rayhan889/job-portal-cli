import java.util.ArrayList;

public class Job {
    private String jobId;
    private String jobName;
    private String jobDescription;
    private ArrayList<JobCategory> jobCategories;
    private String recruiterId;

    public Job(String jobId, String jobName, String jobDescription, ArrayList<JobCategory> jobCategories, String recruiterId) {
        this.jobId = jobId;
        this.jobName = jobName;
        this.jobDescription = jobDescription;
        this.jobCategories = jobCategories;
        this.recruiterId = recruiterId;
    }

    public String getJobId() {return jobId;}
    public void setJobId(String jobId) {this.jobId = jobId;}
    public String getJobName() {return jobName;}
    public void setJobName(String jobName) {this.jobName = jobName;}
    public String getJobDescription() {return jobDescription;}
    public void setJobDescription(String jobDescription) {this.jobDescription = jobDescription;}
    public ArrayList<JobCategory> getCategory() {return jobCategories;}
    public void setCategory(ArrayList<JobCategory> jobCategories) {this.jobCategories = jobCategories;}
    public String getRecruiter() {return recruiterId;}
    public void setRecruiter(String recruiterId) {this.recruiterId = recruiterId;}
}
