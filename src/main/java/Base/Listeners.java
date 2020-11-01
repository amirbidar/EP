package Base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
@Data
public class Listeners {
    @JsonProperty("phase-listener")
    public List<PhaseListener> phaseListener;
}
