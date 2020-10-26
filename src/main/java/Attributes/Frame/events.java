package Attributes.Frame;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;
import Enum.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class events {
    private EnumsDecleration.EventTypeLabel type;
    private String name;
    @JacksonXmlProperty(localName = "submit-region")
    private String submitRegion;
    @JacksonXmlProperty(localName = "re-render")
    private String renderer;
    private EnumsDecleration.EventPhase phase;
    @JacksonXmlProperty(localName = "run-at")
    private EnumsDecleration.Environment environment;
    @JacksonXmlProperty(localName = "client-side-language")
    private EnumsDecleration.Language language;
    private String action;
    @JacksonXmlProperty(localName = "on-success")
    private String onSuccess;
    @JacksonXmlProperty(localName = "fire-condition")
    private String fireCondition;
    private String before;
    private String condition;
    @XmlElement(name = "argument")
    private List<Arguments> argument=new ArrayList<>();

    // TODO: 10/26/2020 check this
    public void setArgument(Arguments argument) {
        this.argument.add(argument);
    }
}
