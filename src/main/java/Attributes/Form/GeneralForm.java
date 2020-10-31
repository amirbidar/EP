package Attributes.Form;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.sun.xml.internal.ws.developer.Serialization;
import lombok.Data;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@Data
public class GeneralForm {
    @JacksonXmlProperty(localName = "xmlns")
    private String xmlns;
    @JacksonXmlProperty(localName = "xmlns:xsd")
    private String xmlnsxsd;
    private String name;
    private String label;
    private String title;
    private Integer version;
    private String visible;
    @JacksonXmlProperty(localName = "client-side-language")
    private String clientLanguage;
    private String layoutable;
    private String enabled;
    private String resizable;
    private String draggable;
    private String rendered;
    private String description;
    private ResourcesForm resources;
}
