package w12;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "origin",
    "destination"
})
public class City {

    @JsonProperty("origin") 
    private String origin;

    @JsonProperty("destination")
    private String destination;
    
    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    @JsonProperty("destination")
    public String getDestination() {
        return destination;
    }
}
