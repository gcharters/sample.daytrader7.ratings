package application.rest.v1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


@Path("/rating")
public class Ratings {

	public enum RatingEnum {
		  BUY,
		  HOLD,
		  SELL;

		  private static final List<RatingEnum> VALUES =
		    Collections.unmodifiableList(Arrays.asList(values()));
		  private static final int SIZE = VALUES.size();
		  private static final Random RANDOM = new Random();

		  public static RatingEnum randomRating()  {
		    return VALUES.get(RANDOM.nextInt(SIZE));
		  }
		}	
	
	
    @GET
    @Path("/{symbol}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRating(@PathParam("symbol") String symbol) {

    		Rating rating = new Rating(symbol, RatingEnum.randomRating().toString());
        return Response.ok(rating).build();
    }


}
