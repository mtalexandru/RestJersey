package ro.mtalexandru;

import ro.mtalexandru.model.Activity;
import ro.mtalexandru.model.User;
import ro.mtalexandru.repository.ActivityRepository;
import ro.mtalexandru.repository.ActivityRepositoryStub;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Mau on 8/4/2016.
 */
@Path("activities") //http://localhost:8080/webapi/activities
public class ActivityResource {
    
    private ActivityRepository activityRepository = new ActivityRepositoryStub();

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Activity> getAllActivities(){
        return activityRepository.findAllActivities();
    }


    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Path("{activityId}") //http://localhost:8080/webapi/activities/1234
    public Activity getActivity(@PathParam("activityId") String activityId){
        return activityRepository.findActivity(activityId);
    }

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Path("{activityId}/user") //http://localhost:8080/webapi/activities/1234/
    public User getActivityUser(@PathParam("activityId") String activityId){
        return activityRepository.findActivity(activityId).getUser();
    }
}
