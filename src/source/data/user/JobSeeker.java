package source.data.user;

import source.data.job.Job;
import source.data.resume.Resume;

import java.util.ArrayList;

public class JobSeeker extends User<JobSeeker> {
    public static final int MAX_APPLIED_JOB_CAPACITY = 10;

    private Resume resume;
    private ArrayList<Job> appliedJobs;
    private String preference;

    @Override
    public void updateProfile(JobSeeker newProfile) {
        this.resume = newProfile.resume;
        this.appliedJobs = newProfile.appliedJobs;
        this.preference = newProfile.preference;
    }

    @Override
    public void search() {}

    public boolean applyForJob(Job job) {
        boolean success = true;
        if (appliedJobs.size() > MAX_APPLIED_JOB_CAPACITY) {
            success = false;
        }
        return success;
    }

    public void uploadResume(Resume resume) {
        this.resume = resume;
    }
}