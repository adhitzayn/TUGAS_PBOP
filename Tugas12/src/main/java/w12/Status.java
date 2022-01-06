package w12;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"code",
"description"
})
public class Status {

    @JsonProperty("code")
    private Integer code;
    
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

}

