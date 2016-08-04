package ro.mtalexandru.repository;

import ro.mtalexandru.model.Activity;

import java.util.List;

/**
 * Created by Mau on 8/4/2016.
 */
public interface ActivityRepository {
    List<Activity> findAllActivities();
}
