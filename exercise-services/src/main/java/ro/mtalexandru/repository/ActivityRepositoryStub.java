package ro.mtalexandru.repository;

import ro.mtalexandru.model.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mau on 8/4/2016.
 */
public class ActivityRepositoryStub implements ActivityRepository {
    @Override
    public List<Activity> findAllActivities(){
        List<Activity> activities = new ArrayList<Activity>();

        Activity activity1 = new Activity();
        activity1.setDescription("Swimming");
        activity1.setDuration(55);

        activities.add(activity1);

        Activity activity2 = new Activity();
        activity2.setDescription("Cycling");
        activity2.setDuration(129);

        activities.add(activity2);

        return activities;
    }
}
