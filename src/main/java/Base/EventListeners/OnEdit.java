package Base.EventListeners;

import Base.Argument;
import Enum.EnumsDecleration;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
@Data
public class OnEdit {
    public EnumsDecleration.EventPhase phase;
    @JsonProperty("fire-condition")
    public String fireCondition;
    @JsonProperty("submit-region")
    public String submitRegion;
    public String condition;
    public List<Argument> argument;
    @JsonProperty("re-render")
    public String reRender;
    @JsonProperty("client-side-language")
    public EnumsDecleration.Language clientSideLanguage;
    public String before;
    public String name;
    public String action;
    @JsonProperty("on-success")
    public String onSuccess;
    @JsonProperty("run-at")
    public EnumsDecleration.Environment runAt;
}
