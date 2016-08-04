package ro.mtalexandru;

import ro.mtalexandru.model.Activity;
import ro.mtalexandru.repository.ActivityRepository;
import ro.mtalexandru.repository.ActivityRepositoryStub;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Mau on 8/4/2016.
 */
@Path("activities")
public class ActivityResource {
    
    private ActivityRepository activityRepository = new ActivityRepositoryStub();

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Activity> getAllActivities(){
        return activityRepository.findAllActivities();
    }
}
