package douyin.avatar.avatar_demo_java.caller.model.memory.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import douyin.avatar.avatar_demo_java.Enum.QueryOperatorEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MemoryDateCondition {

    @JsonProperty("operator")
    private QueryOperatorEnum operator;

    @JsonProperty("start_time_milli")
    private long startTimeMilli;

    @JsonProperty("end_time_milli")
    private long endTimeMilli;

}
