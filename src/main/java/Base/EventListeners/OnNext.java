package Base.EventListeners;

import Base.Argument;
import Enum.EnumsDecleration;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
@Data
public class OnNext {
    @JsonProperty("submit-region")
    public String submitRegion;
    public List<Argument> argument;
    @JsonProperty("re-render")
    public String reRender;
    public String before;
    public String name;
    public String action;
    @JsonProperty("on-success")
    public String onSuccess;
    public EnumsDecleration.EventPhase phase;
    @JsonProperty("client-side-language")
    public EnumsDecleration.Language clientSideLanguage;
    @JsonProperty("run-at")
    public EnumsDecleration.Environment runAt;
    @JsonProperty("fire-condition")
    public String fireCondition;
    public String condition;


}
