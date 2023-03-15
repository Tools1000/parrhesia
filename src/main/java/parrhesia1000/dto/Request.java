package parrhesia1000.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
@JsonFormat(shape= JsonFormat.Shape.ARRAY)
public class Request {

    @JsonProperty
    private String req = "REQ";

    @JsonProperty
    private String subscriptionId;

    @JsonProperty
    private Filters filters;

}

