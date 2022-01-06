package w12;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"service",
"value"
})
public class ServicePackage {

    @JsonProperty("service")
    private String service;
    
    @JsonProperty("value")
    private Integer value;
    
    @JsonProperty("service")
    public String getService() {
        return service;
    }

    @JsonProperty("value")
    public Integer getValue() {
        return value;
    }

}
